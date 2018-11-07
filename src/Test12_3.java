/* 작성날짜 : 181104
 * 자바윈도우즈 과제7
 * 12장 그래픽 : 실습문제 3번 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class Test12_3 extends JFrame
{
	ImageIcon icon = new ImageIcon("images/apple.jpg");
	Image img = icon.getImage();
	MyLabel label = new MyLabel();
	
	public Test12_3() 
	{
		setTitle("과제7, 실습문제 3번");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(null);

		label.setSize(400,400);
		c.add(label);	
		label.addMouseMotionListener(new MyListener());
		
		setSize(400,400);
		setVisible(true);
	}

	class MyLabel extends JLabel
	{
		int x = 0;
		int y = 0;
		@Override
		protected void paintComponent(Graphics g) 
		{
			super.paintComponent(g);
			g.drawImage(img, x, y, 100, 100, this);
		}
	}

	class MyListener extends MouseAdapter implements MouseMotionListener
	{
		@Override
		public void mouseDragged(MouseEvent e) 
		{
			label.x = e.getX()-50;
			label.y = e.getY()-50;
			repaint();
		}

	}
	public static void main(String[] args) 
	{
		new Test12_3();
	}

}
