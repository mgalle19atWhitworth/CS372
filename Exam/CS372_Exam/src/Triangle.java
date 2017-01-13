

	import java.util.ArrayList;

	public class Triangle implements Shape  {
		String kind;
		int id;
		char length;
		char width;
		char side;
		int side1;
		int side2;
		int side3;
		String color;
		double area;
		int perimeter;
		Triangle(String k,int id2, char l,char w,char s,String c){
			kind = k;
			id = id2;
			color = c;
			length = l;
			width = w;
			side = s;
			getSide();
			getSide2();
			getSide3();
			perimeter = side1+side2+side3;
			area = .5*side2*side1;
		}
		public String toString(){return kind;};
		public String getKind(){return kind;};
		public ArrayList<Object> getDetailString(){
			 ArrayList<Object> Detail = new ArrayList<Object>();
			 Detail.add(kind);
			 Detail.add(color);
			 Detail.add(id);
			 Detail.add(side1);
			 Detail.add(side2);
			 Detail.add(side3);
			 Detail.add(area);
			 Detail.add(perimeter);
			 return Detail;
		};
		public int getID(){return id;};
		public void getSide(){
			if(length == '1')
				side1 = 1;
			else if(length == '2')
				side1= 2;
			else if(length == '3')
				side1 = 3;
			else if(length == '4')
				side1 = 4;
			else if(length == '5')
				side1 = 5;
			else if(length == '6')
				side1 = 6;
			else if(length == '7')
				side1 = 7;
			else if(length == '8')
				side1 = 8;
			else if(length == '9')
				side1 = 9;
			
		}
		public void getSide2(){
			if(width == '1')
				side2 = 1;
			else if(width == '2')
				side2 = 2;
			else if(width == '3')
				side2 = 3;
			else if(width == '4')
				side2 = 4;
			else if(width == '5')
				side2 = 5;
			else if(width == '6')
				side2 = 6;
			else if(width == '7')
				side2 = 7;
			else if(width == '8')
				side2 = 8;
			else if(width == '9')
				side2 = 9;
			
		}
		public void getSide3(){
			if(length == '1')
				side3 = 1;
			else if(length == '2')
				side3 = 2;
			else if(length == '3')
				side3 = 3;
			else if(length == '4')
				side3 = 4;
			else if(length == '5')
				side3 = 5;
			else if(length == '6')
				side3 = 6;
			else if(length == '7')
				side3 = 7;
			else if(length == '8')
				side3 = 8;
			else if(length == '9')
				side3 = 9;
			
		}
	}