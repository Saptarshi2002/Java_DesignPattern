import javax.swing.JFrame;
import javax.swing.JLabel;

public class Binary implements Observer {
	JFrame frame = new JFrame("Binary Value");
	JLabel label = new JLabel();

	@Override
	public void update(int n, boolean showBin, boolean showOct, boolean showHex) {
		// TODO Auto-generated method stub
		if (showBin) {
//			frame = new JFrame("Binary Value");
            frame.setSize(300, 100);
//            JLabel label = new JLabel("Binary: " + Integer.toBinaryString(n));
//            label.setText("Binary: " + Integer.toBinaryString(n));
            label.setText("Binary: " + Integer.toBinaryString(n));
            frame.add(label);
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        }
		else
			frame.setVisible(false);
		
	}

}
