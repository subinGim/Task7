/* 작성날짜 : 181101
 * 자바윈도우즈 과제7
 * 12장 그래픽 : CHECKTIME문제 3번*/
import javax.swing.*;
import java.awt.*;

public class GraphicsEx3 extends JFrame
{
	MyPanel panel = new MyPanel();
	public GraphicsEx3() 
	{
		setTitle("과제 7, 3번");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(panel);
		setSize(400,200);
		setVisible(true);
	}
	class MyPanel extends JPanel 
	{
		@Override
		protected void paintComponent(Graphics g) {
			// TODO Auto-generated method stub
			super.paintComponent(g);
			g.setColor(Color.red);

			int[] x = {10,5,15};
			int[] y = {10,15,20};
			g.fillPolygon(x, y, 3);
		}
	}
	public static void main(String[] args) 
	{
		new GraphicsEx3();
	}

}
