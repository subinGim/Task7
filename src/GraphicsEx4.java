/* 작성날짜 : 181101
 * 자바윈도우즈 과제7
 * 12장 그래픽 : CHECKTIME문제 4번*/
import javax.swing.*;
import java.awt.*;

public class GraphicsEx4 extends JFrame
{
	MyPanel panel = new MyPanel();
	public GraphicsEx4() 
	{
		setTitle("과제 7, 4번");
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
