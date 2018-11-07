/* �ۼ���¥ : 181104
 * �ڹ��������� ����7
 * 12�� �׷��� : �ǽ����� 4�� */
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
		setTitle("����7, �ǽ����� 4��");
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
			panel.x = e.getX()-50; // ���콺�� ������ �� ���콺�� �̹����� �߾ӿ��� ����ٴϵ��� -50�ؼ� ��ġ����.
			panel.y = e.getY()-50;
			repaint();//�� ������ �巡�׽� �̹����� ���� �׷����� ����.
			
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
