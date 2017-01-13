

	import java.util.ArrayList;

	public class Rectangle implements Shape  {
		String kind;
		int id;
		char length;
		int side;
		int side2;
		char width;
		String color;
		int area;
		int perimeter;
		Rectangle(String k,int id2, char l,char w,String c){
			kind = k;
			id = id2;
			color = c;
			length = l;
			width = w;
			getSide();
			getSide2();
			perimeter = 2*side +2*side2;
			area = side * side2;
		}
		public String toString(){return kind;};
		public String getKind(){return kind;};
		public ArrayList<Object> getDetailString(){
			 ArrayList<Object> Detail = new ArrayList<Object>();
			 Detail.add(kind);
			 Detail.add(color);
			 Detail.add(id);
			 Detail.add(side);
			 Detail.add(side2);
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
	}


