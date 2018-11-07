/* 작성날짜 : 181101
 * 자바윈도우즈 과제7
 * 12장 그래픽 : CHECKTIME문제 1번*/

import javax.swing.*;
import java.awt.*;

public class GraphicsEx1 extends JFrame
{
	MyPanel panel = new MyPanel();
	public GraphicsEx1() 
	{
		setTitle("과제 7, 1번");
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
