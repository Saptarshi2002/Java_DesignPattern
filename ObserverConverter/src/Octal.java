import javax.swing.JFrame;
import javax.swing.JLabel;

public class Octal implements Observer {

	JFrame frame = new JFrame("Octal Value");
	JLabel label = new JLabel();

	@Override
	public void update(int n, boolean showBin, boolean showOct, boolean showHex) {
		if (showOct) {
//			frame = new JFrame("Binary Value");
            frame.setSize(300, 100);
//            JLabel label = new JLabel("Binary: " + Integer.toBinaryString(n));
//            label.setText("Binary: " + Integer.toBinaryString(n));
            
            
            label.setText("Octal:  " + Integer.toOctalString(n));
            frame.add(label);
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        }
		else
			frame.setVisible(false);
		
	}	
		
}
