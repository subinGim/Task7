/* 작성날짜 : 181101
 * 자바윈도우즈 과제7
 * 12장 그래픽 : CHECKTIME문제 4번 변형
 * repaint() 사용하기!*/
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
		setTitle("과제 7, 4번(변형)");
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
			
			getParent().repaint(); //부모컴포넌트부터 다시 그려지게 함.
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

