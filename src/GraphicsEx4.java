/* �ۼ���¥ : 181101
 * �ڹ��������� ����7
 * 12�� �׷��� : CHECKTIME���� 4��*/
import javax.swing.*;
import java.awt.*;

public class GraphicsEx4 extends JFrame
{
	MyPanel panel = new MyPanel();
	public GraphicsEx4() 
	{
		setTitle("���� 7, 4��");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(panel);
		setSize(100,150);
		setVisible(true);
	}
	class MyPanel extends JPanel
	{
		@Override
		protected void paintComponent(Graphics g) 
		{
			
			super.paintComponent(g);
			g.setColor(Color.red);
			g.fillArc(10,10, 80, 80, 90, 120);
			
			g.setColor(Color.yellow);
			g.fillArc(10,10, 80, 80, 90, -120);
			
			g.setColor(Color.blue);
			g.fillArc(10,10, 80, 80, -30, -120);

		}
	}
	
	
	public static void main(String[] args) 
	{
		new GraphicsEx4();
	}

}
