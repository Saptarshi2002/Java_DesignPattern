import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println("Hello");
		MainConverter converter = new MainConverter();
		Binary binary = new Binary();
		converter.add(binary);
		
		JFrame frame;
		JTextField input;
		JCheckBox bin,oct,hex;
		JButton button;
		JButton cancel;
		
		
//		boolean showBin;
//		boolean showOct;
//		boolean showHex;
		
		

			frame = new JFrame();
			frame.setSize(400, 250);
//			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setLayout(new FlowLayout());
			
			
//			JLabel  prompt = new JLabel("Enter your Decimal number here");
			JLabel prompt = new JLabel("Enter Decimal number here :");
			input = new JTextField(15);
			bin = new JCheckBox("Binary");
			oct = new JCheckBox("Octal");
			hex = new JCheckBox("HexaDecimal");
			button = new JButton("Convert");
			cancel = new JButton("Cancel");
			
			button.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					int n = Integer.parseInt(input.getText());
					boolean showBin = bin.isSelected();
//					boolean showOct = oct.isSelected()
					boolean showOct = oct.isSelected();
					boolean showHex = hex.isSelected();
					
					converter.setValues(n, showBin, showOct, showHex);
				}
			});
			cancel.addActionListener(e -> frame.dispose());
			
			
			frame.add(prompt);
	        frame.add(input);
	        frame.add(bin);
	        frame.add(oct);
	        frame.add(hex);
	        frame.add(button);
	        frame.add(cancel);
	        frame.setVisible(true);

		
}
}
