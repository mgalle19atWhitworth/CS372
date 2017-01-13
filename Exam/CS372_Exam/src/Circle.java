import java.io.PrintStream;
import java.util.ArrayList;

public class Circle implements Shape  {
	String kind;
	int id;
	char length;
	int side;
	String color;
	double area;
	double perimeter;
	Circle(String k,int id2, char l,String c){
		kind = k;
		id = id2;
		color = c;
		length = l;
		getSide();
		perimeter = 3.14*2*side;
		area = 3.14*side*side;
	}
	public String toString(){return kind;}
	public String getKind(){return kind;}
	public ArrayList<Object> getDetailString(){
		 ArrayList<Object> Detail = new ArrayList<Object>();
		 Detail.add(kind);
		 Detail.add(color);
		 Detail.add(id);
		 Detail.add(side);
		 Detail.add(area);
		 Detail.add(perimeter);
		 return Detail;
	};
	public int getID(){return id;};
	public void getSide(){
		if(length == '1')
			side = 1;
		else if(length == '2')
			side = 2;
		else if(length == '3')
			side = 3;
		else if(length == '4')
			side = 4;
		else if(length == '5')
			side = 5;
		else if(length == '6')
			side = 6;
		else if(length == '7')
			side = 7;
		else if(length == '8')
			side = 8;
		else if(length == '9')
			side = 9;
		
	}
}
