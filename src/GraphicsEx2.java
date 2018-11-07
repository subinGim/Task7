/* 작성날짜 : 181101
 * 자바윈도우즈 과제7
 * 12장 그래픽 : CHECKTIME문제 2번*/
import javax.swing.*;
import java.awt.*;

public class GraphicsEx2 extends JFrame
{
	MyPanel panel = new MyPanel();
	public GraphicsEx2() 
	{
		setTitle("과제 7, 2번");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(panel);
		setSize(400,200);
		setVisible(true);
	}
	
	class MyPanel extends JPanel 
	{
		@Override
		protected void paintComponent(Graphics g) 
		{
			// TODO Auto-generated method stub
			super.paintComponent(g);
			g.setColor(Color.black);
			g.drawOval(10,15,20,10);
			g.drawRect(10, 15, 20, 10); //중심이 (20,20)이고 높이10,폭 20인 사각형
		}
	}

	public static void main(String[] args) 
	{
		new GraphicsEx2();

	}

}
