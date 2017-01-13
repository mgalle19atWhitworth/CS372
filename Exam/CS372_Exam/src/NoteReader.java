import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

import javax.swing.ComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JList;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.JTextPane;
import javax.swing.ListModel;
import javax.swing.JLabel;
import java.awt.Insets;

public class NoteReader extends JComponent {
	public NoteReader() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JList list = new JList();
		GridBagConstraints gbc_list = new GridBagConstraints();
		gbc_list.insets = new Insets(0, 0, 5, 5);
		gbc_list.fill = GridBagConstraints.BOTH;
		gbc_list.gridx = 1;
		gbc_list.gridy = 3;;
		add(list, gbc_list);
		
		JLabel lblNewLabel = new JLabel("New label");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.gridx = 7;
		gbc_lblNewLabel.gridy = 4;
		add(lblNewLabel, gbc_lblNewLabel);
		 JFrame frame = new JFrame("DragImage"); 
	      
	      frame.setSize(1300,1000);
	      frame.add(list);
	      frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
	      frame.setVisible(true);
	}
	
		

	
	static int id =0;
	static int idr =200;
	static int ids =100;
	static int idt =300;
	static char length;
	static String color;
	static String kind;
	static char colorFind;
	static char width;
	static char side;
	static ArrayList<Circle> circles= new ArrayList<Circle>();
	static ArrayList<Rectangle> rectangles = new ArrayList<Rectangle>();
	static ArrayList<Square> squares = new ArrayList<Square>();
	static ArrayList<Triangle> triangles = new ArrayList<Triangle>();
	static String shapes[];
public static void main(String[] args){

	String curdir=System.getProperty("user.dir")+"\\src";
	File cd = new File(curdir);
	File[] files = cd.listFiles();
	for(File f: files) {
		if(f.getName().equals("shapes.txt")){
			try(FileInputStream is = new FileInputStream(f)){
				InputStreamReader ir = new InputStreamReader(is);
				BufferedReader rdr = new BufferedReader(ir);
				String line = rdr.readLine();
				while (line!= null){
					if(line.contains("circle: ")){
						if(id < 10)
						length = line.charAt(10);
						colorFind = line.charAt(12);
						if (colorFind == 'y')
						{
							color = "yellow";
						}
						else if (colorFind == 'g'){
							color = "green";
						}
						else if (colorFind =='r'){
							color = "red";
						}
						else if (colorFind== 'b'){
							colorFind = line.charAt(14);
							if(colorFind =='u'){
								color = "blue";
							}
							else if (colorFind =='a' ){
								color ="black";
							}	
						}
						else if ( id >= 10){
							length = line.charAt(11);
							colorFind = line.charAt(13);
							if (colorFind == 'y')
							{
								color = "yellow";
							}
							else if (colorFind == 'g'){
								color = "green";
							}
							else if (colorFind =='r'){
								color = "red";
							}
							else if (colorFind== 'b'){
								colorFind = line.charAt(15);
								if(colorFind =='u'){
									color = "blue";
								}
								else if (colorFind =='a' ){
									color ="black";
								}	
							}
						}
						
						kind = "Circle";
						Circle c = new Circle(kind,id,length,color);
						circles.add(c);
						id++;
					}
					else if (line.contains("rectangle: ")){
						width = line.charAt(17);
						length = line.charAt(15);
						colorFind = line.charAt(19);
						if (colorFind == 'y')
						{
							color = "yellow";
						}
						else if (colorFind == 'g'){
							color = "green";
						}
						else if (colorFind =='r'){
							color = "red";
						}
						else if (colorFind== 'b'){
							colorFind = line.charAt(21);
							if(colorFind =='u'){
								color = "blue";
							}
							else if (colorFind =='a' ){
								color ="black";
							}	
						}	
						kind = "Rectangle";
						Rectangle r = new Rectangle(kind,idr,length,width,color);
						rectangles.add(r);
						idr++;
					}
				else if (line.contains("square:")){
						length = line.charAt(12);
						colorFind = line.charAt(15);
						if (colorFind == 'y')
						{
							color = "yellow";
						}
						else if (colorFind == 'g'){
							color = "green";
						}
						else if (colorFind =='r'){
							color = "red";
						}
						else if (colorFind== 'b'){
							colorFind = line.charAt(17);
							if(colorFind =='u'){
								color = "blue";
							}
							else if (colorFind =='a' ){
								color ="black";
							}	
						}	
						kind = "Square";
						Square s = new Square(kind,ids,length,color);
						squares.add(s);
						ids++;
					}
					else if (line.contains("triangle: ")){
						length = line.charAt(14);
						width = line.charAt(16);
						side=line.charAt(18);
						colorFind = line.charAt(20);
						if (colorFind == 'y')
						{
							color = "yellow";
						}
						else if (colorFind == 'g'){
							color = "green";
						}
						else if (colorFind =='r'){
							color = "red";
						}
						else if (colorFind== 'b'){
							colorFind = line.charAt(22);
							if(colorFind =='u'){
								color = "blue";
							}
							else if (colorFind =='a' ){
								color ="black";
							}	
						}	
						kind = "Triangle";
						Triangle t = new Triangle(kind,idt,length,width,side,color);
						triangles.add(t);
						idt++;
					}
					line = rdr.readLine();
					
			}
				for(int i =0;i<circles.size();i++){
					System.out.printf("%s.%d, %c%s\n",circles.get(i).kind,circles.get(i).id,circles.get(i).length,circles.get(i).color);
					
				}
				for (int i = 0; i <rectangles.size();i++){
					System.out.printf("%s,%d,%c,%c,%s\n", rectangles.get(i).kind,rectangles.get(i).id,rectangles.get(i).length,rectangles.get(i).width,rectangles.get(i).color);
				}
				for (int i = 0; i <squares.size();i++){
					System.out.printf("%s,%d,%c,%s\n", squares.get(i).kind,squares.get(i).id,squares.get(i).length,squares.get(i).color);
				}
				for (int i = 0; i <triangles.size();i++){
					System.out.printf("%s,%d,%c,%c,%c,%s\n", triangles.get(i).kind,triangles.get(i).id,triangles.get(i).length,triangles.get(i).width,triangles.get(i).side,triangles.get(i).color);
				}
				
		}
		catch(Exception ex){System.out.printf("Failed: %s\n",ex.getMessage());}
	}
}
	NoteReader n = new NoteReader();
}
}
