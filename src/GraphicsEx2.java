/* �ۼ���¥ : 181101
 * �ڹ��������� ����7
 * 12�� �׷��� : CHECKTIME���� 2��*/
import javax.swing.*;
import java.awt.*;

public class GraphicsEx2 extends JFrame
{
	MyPanel panel = new MyPanel();
	public GraphicsEx2() 
	{
		setTitle("���� 7, 2��");
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
			g.drawRect(10, 15, 20, 10); //�߽��� (20,20)�̰� ����10,�� 20�� �簢��
		}
	}

	public static void main(String[] args) 
	{
		new GraphicsEx2();

	}

}
