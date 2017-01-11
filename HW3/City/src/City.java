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
	// the starting position for the pictures
	int kid1X = 60;
	int kid1Y = 60;
	int kid2X = 1100;
	int kid2Y = 60;
	int police1X=1100;
	int police1Y=700;
	int police2X = 468;
	int police2Y = 248;
	int teacher1X = 380;
	int teacher1Y = 680;
	int teacher2X = 80;
	int teacher2Y=400;
	int d = 0;
	Image kid,kid2, cityI, school, cityHall,police,police2,teachers,teachers2;
	
	// initializes people for the city
	Person[] people={new Teacher("Aubree",30,5556897,6,"Math"),new Teacher("Shay",40,5557894,12,"English"),
			 new Police("Mike",35,5551234,Police.Type.Cheif), new Police("Tom",28,1478978,Police.Type.Patrol),
			 new Kid("Aaron",6,7894561,"Suckers"), new Kid("Bob",10,3216549,"Starburst")};
	// create buildings for the city
	Building[] building={new CityHall("City Hall","1234 main"), new School("School","456 Main")};
	
	// creates a school so you can add people the building
	School s = (School) building[1];
	CityHall C=(CityHall) building[0];
	
	// gets the name of the different people in the person array
	String PoliceOfficer1 = people[2].getName();
	String PoliceOfficer2=people[3].getName();
	String Teacher1=people[0].getName();
	String Teacher2 =people[1].getName();
	String Kid1=people[4].getName();
	String Kid2 = people[5].getName();

	/**
	 * The constructor for the city
	 * @param k creates kid1 in the city
	 * @param k2 creates kid2 in the city
	 * @param schools creates a school in the city
	 * @param cityhall creates a City hall in the city
	 * @param p creates police1` in the city
	 * @param p2 creates police2 in the city
	 * @param t creates teacher1 in the city
	 * @param t2 creates teacher2 in the city
	 * @param c creates the city background 
	 */
	public City(Image k,Image k2,Image schools,Image cityhall,Image p,Image p2,Image t ,Image t2, Image c ){
		kid = k;
		kid2 = k2;
		school =schools;
		cityHall=cityhall;
		cityI=c;
		police = p;
		police2 = p2;
		teachers = t;
		teachers2=t2;
		
		
		addMouseMotionListener(this);
		addMouseListener(this);
		
	}
	
	public void mouseClicked(MouseEvent e){
		
		if(e.getY() > 400 && e.getY() < 600 && e.getX() >700 && e.getX()<900){
			System.out.printf("%s,%s\n",building[1].name,building[1].address);
			s.showOccupants();
		}
		else if (e.getY() > 0 && e.getY() < 150 && e.getX() > 350 && e.getX() < 500)
		{
			System.out.printf("%s,%s\n",building[0].name,building[0].address);
			C.showOccupants();
		}
		else if (e.getX() > kid1X && e.getX()< kid1X +100){
			System.out.printf("%s,%d,%d\n",people[4].getName(),people[4].getAge(),people[4].getNumber());
		}
		else if (e.getX() > kid2X && e.getX()< kid2X +100){
			System.out.printf("%s,%d,%d\n",people[5].getName(),people[5].getAge(),people[5].getNumber());
		}
		else if (e.getX()> police1X && e.getX() < police1X +100){
			Police p1=(Police) people[2];
			System.out.printf("%s,%d,%d,%s\n",people[2].getName(),people[2].getAge(),people[2].getNumber(),p1.getRole());
		}
		else if (e.getX()> police2X && e.getX() < police2X +100){
			Police p2=(Police) people[3];
			System.out.printf("%s,%d,%d,%s\n",people[3].getName(),people[3].getAge(),people[3].getNumber(),p2.getRole());
		}
		else if (e.getX()>teacher1X && e.getX() < teacher1X +100){
			System.out.printf("%s,%d,%d\n",people[0].getName(),people[0].getAge(),people[0].getNumber());
		}
		else if (e.getX()>teacher2X && e.getX() < teacher2X +100){
			System.out.printf("%s,%d,%d\n",people[1].getName(),people[1].getAge(),people[1].getNumber());
		}
	}
	public void mouseEntered(MouseEvent e){}
	public void mouseExited(MouseEvent e){}
	public void mousePressed(MouseEvent e){
		if (e.getX() >= kid1X && e.getX() <= kid1X + 100 && e.getY()>= kid1Y && e.getY() <= kid1Y +100)
			d = 1;
		else if (e.getX() >= kid2X && e.getX() <= kid2X + 100 && e.getY()>= kid2Y && e.getY() <= kid2Y +100)
			d = 2;
		else if (e.getX() >= police1X && e.getX() <= police1X + 100 && e.getY()>= police1Y && e.getY() <= police1Y +100)
			d = 3;
		else if (e.getX() >= police2X && e.getX() <= police2X + 100 && e.getY()>= police2Y && e.getY() <= police2Y +100)
			d = 4;
		else if (e.getX() >= teacher1X && e.getX() <= teacher1X + 100 && e.getY()>= teacher1Y && e.getY() <= teacher1Y +100)
			d = 5;
		else if (e.getX() >= teacher2X && e.getX() <= teacher2X + 100 && e.getY()>= teacher2Y && e.getY() <= teacher2Y +100)
			d = 6;
	}
	public void mouseReleased(MouseEvent e){
		d = 0;
	}
	
	public void mouseDragged(MouseEvent e){	
		if(d == 0){
			if (e.getX() >= kid1X && e.getX() <= kid1X + 100 && e.getY()>= kid1Y && e.getY() <= kid1Y +100)
				d = 1;
			else if (e.getX() >= kid2X && e.getX() <= kid2X + 100 && e.getY()>= kid2Y && e.getY() <= kid2Y +100)
				d = 1;
			else if (e.getX() >= police1X && e.getX() <= police1X + 100 && e.getY()>= police1Y && e.getY() <= police1Y +100)
				d = 3;
			else if (e.getX() >= police2X && e.getX() <= police2X + 100 && e.getY()>= police2Y && e.getY() <= police2Y +100)
				d = 4;
			else if (e.getX() >= teacher1X && e.getX() <= teacher1X + 100 && e.getY()>= teacher1Y && e.getY() <= teacher1Y +100)
				d = 5;
			else if (e.getX() >= teacher2X && e.getX() <= teacher2X + 100 && e.getY()>= teacher2Y && e.getY() <= teacher2Y +100)
				d = 6;
		}
		else if (d == 1){
			kid1X = e.getX();
			kid1Y= e.getY();
				if(kid1X > 700 && kid1X < 900 && kid1Y > 400 && kid1Y <600){
						s.addEmployee(Kid1);
					
			}
			else if (kid1X > 700 || kid1X < 900 || kid1Y >400 || kid1Y <600){
				s.removePerson(Kid1);
			}
		}
		else if (d == 2){
			kid2X = e.getX();
			kid2Y= e.getY();
				if(kid2X > 700 && kid2X < 900 && kid2Y > 400 && kid2Y <600){
						s.addEmployee(Kid2);
					
			}
			else if (kid2X > 700 || kid2X < 900 || kid2Y >400 || kid2Y <600){
				s.removePerson(Kid2);
			}
		}
		else if (d == 3){
			police1X = e.getX();
			police1Y= e.getY();
			if (police1X >350 && police1X <500 && police1Y > 0 && police1Y < 150 ){
				C.addEmployee(PoliceOfficer1);
			}
			else if (police1X >350 || police1X <500 || police1Y > 0 || police1Y < 150 ){
				C.removeEmployee(PoliceOfficer1);
			}
		}
		else if (d == 4){
			police2X = e.getX();
			police2Y= e.getY();
			if (police2X >350 && police2X <500 && police2Y > 0 && police2Y < 150 ){
				C.addEmployee(PoliceOfficer2);
			}
			else if (police2X >350 || police2X <500 || police2Y > 0 || police2Y < 150 ){
				C.removeEmployee(PoliceOfficer2);
			}
		}
		else if (d ==5){
			teacher1X =e.getX();
			teacher1Y = e.getY();
			if(teacher1X > 700 && teacher1X <900 && teacher1Y > 400 && teacher1Y <600){
				s.addEmployee(Teacher1);
			}
			else if (teacher1X > 700 || teacher1X < 900 || teacher1Y >400 || teacher1Y <600){
				s.removePerson(Teacher1);
			}
		}
		else if (d ==6){
			teacher2X =e.getX();
			teacher2Y = e.getY();
			if(teacher2X > 700 && teacher2X <900 && teacher2Y > 400 && teacher2Y <600){
				s.addEmployee(Teacher2);
			}
			else if (teacher2X > 700 || teacher2X < 900 || teacher2Y >400 || teacher2Y <600){
				s.removePerson(Teacher2);
			}
		}
		repaint();
	}
	
	public void mouseMoved(MouseEvent e){}
	
	public void paint(Graphics g){
		Graphics2D g2=(Graphics2D)g;
		g2.drawImage(cityI,0,0,this);
		g2.drawImage(kid, kid1X, kid1Y, this);
		g2.drawImage(kid2,kid2X,kid2Y,this);
		g2.drawImage(police, police1X,police1Y, this);
		g2.drawImage(police2, police2X,police2Y, this);
		g2.drawImage(teachers, teacher1X, teacher1Y, this);
		g2.drawImage(teachers2, teacher2X, teacher2Y, this);
		g2.drawImage(school,700,400,this);
		g2.drawImage(cityHall, 350, 0, this);
		
	}
	
	static int imageWidth=100, imageHeight=100;

	public static void main(String[] args) {

		String kid1="/resources/kids.png"; // kid image
		String city="/resources/city.jpg"; // city image
		String school ="/resources/school.png"; // school image
		String cityHall="/resources/cityHall.png"; // city hall image
		String policeOfficer1="/resources/policeOfficer.png"; // police officer image
		String teacher1 = "/resources/teacher.png"; // teacher image
		String kid2="/resources/kid2.png";
		String policeOfficer2="/resources/policeman5.png";
		String teacher2 = "/resources/teacher2.png";
		
		Image police=Toolkit.getDefaultToolkit().getImage(City.class.getResource(policeOfficer1));
		police = police.getScaledInstance(imageWidth, imageHeight, Image.SCALE_SMOOTH);
		
		Image police2=Toolkit.getDefaultToolkit().getImage(City.class.getResource(policeOfficer2));
		police2 = police2.getScaledInstance(imageWidth, imageHeight, Image.SCALE_SMOOTH);
		
		Image kid = Toolkit.getDefaultToolkit().getImage(City.class.getResource(kid1));
	    kid = kid.getScaledInstance(imageWidth,imageHeight,Image.SCALE_DEFAULT);
	    
	    Image kids2 = Toolkit.getDefaultToolkit().getImage(City.class.getResource(kid2));
	    kids2 = kids2.getScaledInstance(imageWidth,imageHeight,Image.SCALE_DEFAULT);
	    
	    Image teachers = Toolkit.getDefaultToolkit().getImage(City.class.getResource(teacher1));
	    teachers = teachers.getScaledInstance(imageWidth,imageHeight,Image.SCALE_DEFAULT);
	    
	    Image teachers2 = Toolkit.getDefaultToolkit().getImage(City.class.getResource(teacher2));
	    teachers2 = teachers2.getScaledInstance(imageWidth,imageHeight,Image.SCALE_DEFAULT);
	    
	    Image schoolI = Toolkit.getDefaultToolkit().getImage(City.class.getResource(school));
	    schoolI = schoolI.getScaledInstance(200,200,Image.SCALE_DEFAULT);
	    
	    Image cityhall = Toolkit.getDefaultToolkit().getImage(City.class.getResource(cityHall));
	    cityhall = cityhall.getScaledInstance(150,160,Image.SCALE_DEFAULT);
	    
	    Image cityI = Toolkit.getDefaultToolkit().getImage(City.class.getResource(city));
	    
	    JFrame frame = new JFrame("DragImage"); 
	      frame.add(new City(kid,kids2,schoolI,cityhall,police,police2,teachers,teachers2,cityI));
	      frame.setSize(1300,1000);
	      frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
	      frame.setVisible(true);
	}
}
