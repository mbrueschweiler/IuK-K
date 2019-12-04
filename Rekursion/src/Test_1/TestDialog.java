package Test_1;

import javax.swing.JDialog;
import javax.swing.WindowConstants;

public class TestDialog extends JDialog {
	private static final long serialVersionUID = 1L;

	private TestPanel panel = new TestPanel();
	
	public TestDialog() {
		getContentPane().add(panel);
	}

	public static void main(String[] arg) {
		TestDialog dialog = new TestDialog();
		dialog.setSize(1000,1000);
		dialog.setVisible(true);
		dialog.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
	}
}
