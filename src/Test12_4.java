/* 작성날짜 : 181104
 * 자바윈도우즈 과제7
 * 12장 그래픽 : 실습문제 4번 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Test12_4 extends JFrame
{

	ImageIcon icon = new ImageIcon("images/apple.jpg");
	Image img = icon.getImage();
	MyPanel panel = new MyPanel();
	
	public Test12_4() 
	{
		setTitle("과제7, 실습문제 4번");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(null);
		c.add(panel);
		
		panel.setSize(400,400);
		panel.addMouseMotionListener(new MyListener());
		
		setSize(400,400);
		setVisible(true);
	}
	
	class MyPanel extends JPanel
	{
		int x = 0;
		int y = 0;
		@Override
		public void paintComponent(Graphics g) 
		{
			super.paintComponent(g);
			g.drawImage(img, x, y, 100, 100, this);
			
		}
	}
	
	class MyListener implements MouseMotionListener
	{
		@Override
		public void mouseDragged(MouseEvent e) 
		{
			panel.x = e.getX()-50; // 마우스가 움직일 때 마우스가 이미지의 중앙에서 따라다니도록 -50해서 위치설정.
			panel.y = e.getY()-50;
			repaint();//가 없으면 드래그시 이미지가 새로 그려지지 않음.
			
		}

		@Override
		public void mouseMoved(MouseEvent arg0) 
		{
			
		}
	}
	
	public static void main(String[] args) 
	{
		new Test12_4();
	}

}
