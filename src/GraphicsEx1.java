/* �ۼ���¥ : 181101
 * �ڹ��������� ����7
 * 12�� �׷��� : CHECKTIME���� 1��*/

import javax.swing.*;
import java.awt.*;

public class GraphicsEx1 extends JFrame
{
	MyPanel panel = new MyPanel();
	public GraphicsEx1() 
	{
		setTitle("���� 7, 1��");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(panel);
		
		setSize(400,200);
		setVisible(true);
	}

	class MyPanel extends JPanel 
	{
		@Override
		public void paintComponent(Graphics g) 
		{
			
			super.paintComponent(g);
			g.setColor(Color.yellow);
			g.drawLine(10, 10, 30, 30);
		}
	}


	public static void main(String[] args) 
	{
		new GraphicsEx1();

	}

}
