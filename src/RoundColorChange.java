/* �ۼ���¥ : 181101
 * �ڹ��������� ����7
 * 12�� �׷��� : CHECKTIME���� 4�� ����
 * repaint() ����ϱ�!*/
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class RoundColorChange extends JFrame
{
	MyPanel panel = new MyPanel();
	Color[] color = {Color.red, Color.YELLOW, Color.blue};
	
	public RoundColorChange()
	{
		setTitle("���� 7, 4��(����)");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(panel);
		panel.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) 
			{
				
				Color temp = color[0];
				color[0] = color[2];
				color[2] = color[1];
				color[1] = temp;
			}
		});
		setSize(100,150);
		setVisible(true);
	}
	class MyPanel extends JPanel
	{
		@Override
		protected void paintComponent(Graphics g) 
		{
			
			super.paintComponent(g);
			
			getParent().repaint(); //�θ�������Ʈ���� �ٽ� �׷����� ��.
			g.setColor(color[0]);
			g.fillArc(10,10, 80, 80, 90, 120);
			
			g.setColor(color[1]);
			g.fillArc(10,10, 80, 80, 90, -120);
			
			g.setColor(color[2]);
			g.fillArc(10,10, 80, 80, -30, -120);

		}
	}

	public static void main(String[] args) 
	{
		new RoundColorChange();
	}

}

