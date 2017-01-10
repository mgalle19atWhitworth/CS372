import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 * Creates and out puts all the people and buildings. Also pays the employees. 
 * @author mgalle19
 *
 */
public class City extends JComponent implements MouseMotionListener {
	int imageX, imageY;
	Image image, imageField, school, cityHall,police;
	public City(Image i,Image schools,Image cityhall,Image p,Image ifield){
		image = i;
		school =schools;
		cityHall=cityhall;
		imageField=ifield;
		police = p;
		
		addMouseMotionListener(this);
	}
	public City(Image image2) {
		school = image2;
	}
	public void mouseDragged(MouseEvent e)
	{	
		imageX=e.getX();
		imageY=e.getY();
		repaint();
	}
	
	public void mouseMoved(MouseEvent e){}
	
	public void paint(Graphics g){
		Graphics2D g2=(Graphics2D)g;
		int x = imageX;
		int y =imageY;
		g2.drawImage(imageField,0,0,this);
		g2.drawImage(image, imageX, imageY, this);
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
		
		Image police=Toolkit.getDefaultToolkit().getImage(City.class.getResource(policeOfficer));
		police = police.getScaledInstance(imageWidth, imageHeight, Image.SCALE_SMOOTH);
		Image image = Toolkit.getDefaultToolkit().getImage(City.class.getResource(kid));
	    image = image.getScaledInstance(imageWidth,imageHeight,Image.SCALE_DEFAULT);
	    
	    Image imageField = Toolkit.getDefaultToolkit().getImage(City.class.getResource(city));
	    Image image2 = Toolkit.getDefaultToolkit().getImage(City.class.getResource(school));
	    Image cityhall = Toolkit.getDefaultToolkit().getImage(City.class.getResource(cityHall));
	    image2 = image2.getScaledInstance(200,200,Image.SCALE_DEFAULT);
	    cityhall = cityhall.getScaledInstance(200,200,Image.SCALE_DEFAULT);
	    
	    JFrame frame = new JFrame("DragImage");  
	      frame.add(new City(image,image2,cityhall,police,imageField));
	      frame.setSize(800, 500);
	      frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
	      frame.setVisible(true);
	      

		Person[] people={new Teacher("Tom",30,5556897,6,"Teaching"),new Teacher("Bob",40,5557894,12,"Teaching"),
						 new Police("Mike",35,5551234,Police.Type.Cheif), new Police("Aubree",28,1478978,Police.Type.Patrol),
						 new Kid("Aaron",6,7894561,"Suckers"), new Kid("Brian",10,3216549,"Starburst")};
		Building[] building={new CityHall("City Hall","1234 main"), new School("School","456 Main")};
		
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
		String PoliceOfficer1 = people[2].getName();
		String PoliceOfficer2=people[3].getName();
		CityHall C=(CityHall) building[0];
		C.addEmployee(PoliceOfficer1);
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
