import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Random;
public class ThreadTest extends JFrame {
	public ThreadTest(){
	setSize(500,500);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setLayout(new FlowLayout());
	JButton b = new JButton("Roll");
	this.add(b);
	Roll[] cs = new Roll[5];
	for (int i = 0; i <5; i++){
		JLabel l = new JLabel();
		
		cs[i] = new Roll(l);
		this.add(l);
		
	}
	this.setVisible(true);
	b.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e){
	
	for (int i = 0; i < 5; i++){
		Thread t = new Thread(cs[i]);
		t.start();
	}
	}
});
	try{
		Thread.sleep(100);
	}catch(InterruptedException ex){;} 
	
}
	
	  public static void main(String[] args) {
	        ThreadTest t = new ThreadTest();
	    }
	
}

class Roll implements Runnable{
	
	private JLabel _label;
	public Roll (JLabel label){
		_label = label;
		
	}
	public void run(){
		Random rand = new Random();
		Random r = new Random();
		int num = rand.nextInt(50)+1;
		for(int i = num; i >= 1;i--){
			int pickedNumber = rand.nextInt(6)+1;
			
			if (pickedNumber ==6){
			Toolkit toolkit = Toolkit.getDefaultToolkit();
			URL iu =getClass().getResource("/resources/dice-6-hi.png");
			Image img = toolkit.getImage(iu);
			img = img.getScaledInstance(50, 50, Image.SCALE_SMOOTH);
			ImageIcon icon = new ImageIcon(img);
			_label.setIcon(icon);
			}
			else if (pickedNumber ==5){
				Toolkit toolkit = Toolkit.getDefaultToolkit();
				URL iu =getClass().getResource("/resources/dice-5-hi.png");
				Image img = toolkit.getImage(iu);
				img = img.getScaledInstance(50, 50, Image.SCALE_SMOOTH);
				ImageIcon icon = new ImageIcon(img);
				_label.setIcon(icon);
				}
			else if (pickedNumber ==4){
				Toolkit toolkit = Toolkit.getDefaultToolkit();
				URL iu =getClass().getResource("/resources/Dice-4-b.svg.png");
				Image img = toolkit.getImage(iu);
				img = img.getScaledInstance(50, 50, Image.SCALE_SMOOTH);
				ImageIcon icon = new ImageIcon(img);
				_label.setIcon(icon);
				}
			else if (pickedNumber ==3){
				Toolkit toolkit = Toolkit.getDefaultToolkit();
				URL iu =getClass().getResource("/resources/Dice-3-b.svg.png");
				Image img = toolkit.getImage(iu);
				img = img.getScaledInstance(50, 50, Image.SCALE_SMOOTH);
				ImageIcon icon = new ImageIcon(img);
				_label.setIcon(icon);
				}
			else if (pickedNumber ==2){
				Toolkit toolkit = Toolkit.getDefaultToolkit();
				URL iu =getClass().getResource("/resources/dice-2-md.png");
				Image img = toolkit.getImage(iu);
				img = img.getScaledInstance(50, 50, Image.SCALE_SMOOTH);
				ImageIcon icon = new ImageIcon(img);
				_label.setIcon(icon);
				}
			else if (pickedNumber ==1){
				Toolkit toolkit = Toolkit.getDefaultToolkit();
				URL iu =getClass().getResource("/resources/th.jpeg");
				Image img = toolkit.getImage(iu);
				img = img.getScaledInstance(50, 50, Image.SCALE_SMOOTH);
				ImageIcon icon = new ImageIcon(img);
				_label.setIcon(icon);
				}
			
			try{
				Thread.sleep(100);
			}catch(InterruptedException ex){;}
		}
			
	}
}