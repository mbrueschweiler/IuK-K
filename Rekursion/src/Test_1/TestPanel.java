package Test_1;

import java.awt.Graphics;

import javax.swing.JPanel;

class TestPanel extends JPanel {
	private static final long serialVersionUID = 1L;

	@Override
	protected void paintComponent(Graphics g) {
		int sizeX=(int) this.getSize().getWidth();
		
		int[] werte = Test.hofstaederZahlen(sizeX); 
		for (int x=1; x<sizeX; x++) {
			int y=werte[x];
			g.drawLine(x,y,x,y);
		}
	}
}