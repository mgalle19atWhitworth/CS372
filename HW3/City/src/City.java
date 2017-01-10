import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.net.URL;
import java.util.stream.IntStream;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;

/**
 * Creates and out puts all the people and buildings. Also pays the employees. 
 * @author mgalle19
 *
 */
public class City extends JComponent implements MouseMotionListener, MouseListener {
	int imageX, imageY;
	int imageZ=100;
	int imageI=0;
	int x = 150;
	int y =  0;
	Image image, imageField, school, cityHall,police,teachers;
	
	Person[] people={new Teacher("Tom",30,5556897,6,"Teaching"),new Teacher("Bob",40,5557894,12,"Teaching"),
			 new Police("Mike",35,5551234,Police.Type.Cheif), new Police("Aubree",28,1478978,Police.Type.Patrol),
			 new Kid("Aaron",6,7894561,"Suckers"), new Kid("Brian",10,3216549,"Starburst")};
	Building[] building={new CityHall("City Hall","1234 main"), new School("School","456 Main")};
	School s = (School) building[1];
	CityHall C=(CityHall) building[0];
	
	public City(Image i,Image schools,Image cityhall,Image p,Image t ,Image ifield ){
		image = i;
		school =schools;
		cityHall=cityhall;
		imageField=ifield;
		police = p;
		teachers = t;
		
		addMouseMotionListener(this);
		addMouseListener(this);
		
	}
	
	public void mouseClicked(MouseEvent e){
		
		if(e.getY() > 250 && e.getY() < 450){
			System.out.printf("%s,%s\n",building[1].name,building[1].address);
			s.showOccupants();
		}
		else if (e.getY() > 0 && e.getY() < 200 && e.getX() > 600 && e.getX() < 800)
		{
			System.out.printf("%s,%s\n",building[0].name,building[0].address);
			C.showOccupants();
		}
				}
	public void mouseEntered(MouseEvent e){}
	public void mouseExited(MouseEvent e){}
	public void mousePressed(MouseEvent e){
		
	}
	public void mouseReleased(MouseEvent e){}
	
	public void mouseDragged(MouseEvent e){	
		
		if(e.getX()> imageX && e.getX()< imageX +60 && e.getY() > imageY && e.getY() < imageY+60){
		imageX=e.getX();
		imageY=e.getY();
		repaint();
		}
		else if(imageX >325 && imageX< 375){
				String Kid1=people[4].getName();
				s.addEmployee(Kid1);
			}
			

	else if(e.getX()>imageZ && e.getX() < imageZ+60 && e.getY() > imageI && e.getY() < imageI +60){
		imageZ = e.getX();
		imageI = e.getY();
		repaint();
	}
		else if (imageZ>600 &&imageZ < 700){
		String PoliceOfficer1 = people[2].getName();
		C.addEmployee(PoliceOfficer1);
		}
		else if (e.getX() > x && e.getX() < x+60 && e.getY() > y && e.getY()<y + 60){
			x = e.getX();
			y=e.getY();
			repaint();
		}
	}
	
	public void mouseMoved(MouseEvent e){}
	
	public void paint(Graphics g){
		Graphics2D g2=(Graphics2D)g;
		g2.drawImage(imageField,0,0,this);
		g2.drawImage(image, imageX, imageY, this);
		g2.drawImage(police, imageZ,imageI, this);
		g2.drawImage(teachers, x, y, this);
		g2.drawImage(school,325,250,this);
		g2.drawImage(cityHall, 600, 0, this);
		
	}
	
	static int imageWidth=60, imageHeight=60;

	public static void main(String[] args) {

		String kid="/resources/kids.png";
		String city="/resources/city.jpg";
		String school ="/resources/school.png";
		String cityHall="/resources/cityHall.png";
		String policeOfficer="/resources/policeOfficer.png";
		String teacher = "/resources/teacher.png";
		
		Image police=Toolkit.getDefaultToolkit().getImage(City.class.getResource(policeOfficer));
		police = police.getScaledInstance(imageWidth, imageHeight, Image.SCALE_SMOOTH);
		Image image = Toolkit.getDefaultToolkit().getImage(City.class.getResource(kid));
	    image = image.getScaledInstance(imageWidth,imageHeight,Image.SCALE_DEFAULT);
	    Image teachers = Toolkit.getDefaultToolkit().getImage(City.class.getResource(teacher));
	    teachers = teachers.getScaledInstance(imageWidth,imageHeight,Image.SCALE_DEFAULT);
	   
	    
	    Image imageField = Toolkit.getDefaultToolkit().getImage(City.class.getResource(city));
	    Image image2 = Toolkit.getDefaultToolkit().getImage(City.class.getResource(school));
	    Image cityhall = Toolkit.getDefaultToolkit().getImage(City.class.getResource(cityHall));
	    image2 = image2.getScaledInstance(200,200,Image.SCALE_DEFAULT);
	    cityhall = cityhall.getScaledInstance(200,200,Image.SCALE_DEFAULT);
	    
	    JFrame frame = new JFrame("DragImage");  
	   
	    
	      frame.add(new City(image,image2,cityhall,police,teachers,imageField));
	      frame.setSize(800, 500);
	      frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
	      frame.setVisible(true);
	
		
		
		/*System.out.println("People in City");
		for(int i =0; i<people.length;i++){
			System.out.printf("%s,%d,%d\n",people[i].getName(),people[i].getAge(),people[i].getNumber());
		}
		System.out.println();
		System.out.println("Buildings in City");
		for (int i =0;i<building.length;i++){
			System.out.printf("%s,%s\n",building[i].name,building[i].address);
		}
		
		System.out.println();
		
		String PoliceOfficer2=people[3].getName();
		CityHall C=(CityHall) building[0];
	
		C.addEmployee(PoliceOfficer2);
		C.showOccupants();
		
		String Teacher1=people[0].getName();
		String Teacher2=people[1].getName();
		String Kid1=people[4].getName();
		
		School s = (School) building[1];
		s.addEmployee(Teacher1);
		s.addEmployee(Teacher2);
		s.addEmployee(Kid1);
		s.showOccupants();
		
		Teacher t1=(Teacher) people[0];
		t1.pay();
		t1.pay();
		System.out.printf("%s's total payments: %d \n",t1.name, t1.totalPay);
	*/
	}
}
