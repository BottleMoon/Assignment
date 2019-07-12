import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Figures {

	public static void main(String[] args) throws IOException {
		if(!(args[1].equals("print_info")||args[1].equals("print")||(args[1].equals("sort")&&args[2].equals("area"))||(args[1].equals("sort")&&args[2].equals("type")))){
			if(args[1].equals("sort")) System.out.println("sort 명령어 오류");
			else System.out.println("없는 명령어");
			System.exit(1);
		}

		if(args[1].equals("print")){
			int count = 0;
			for(int i = 0; i < args.length-2; i ++){
				if(args[i+2].equals("원")) count ++;
				else if(args[i+2].equals("타원"))count ++;
				else if(args[i+2].equals("사각형"))count ++;
				else if(args[i+2].equals("삼각형"))count ++;
				else if(args[i+2].equals("사다리꼴"))count ++;
			}
			if(count!= args.length-2||args.length < 3||args.length>6){
				System.out.println("도형 종류 오류");
				System.exit(1);
			}
		}				//에러


		File f = new File(args[0]);
		Scanner s = new Scanner(f);
		Scanner s2;
		String check;
		int i = 0;
		int count = 0;
		float avg = 0;
		Figure[] figures;


		while (s.hasNext()) {
			check = s.nextLine();
			i++;
		}
		s.close();
		s = new Scanner(f);
		figures = new Figure[i];

		i = 0;
		while (s.hasNext()) {
			check = s.nextLine();
			s2 = new Scanner(check);
			check = s2.next();
			if (check.equals("원")) {
				figures[i] = new Circle(s2.nextInt(), s2.nextInt(), s2.nextInt());

			} else if (check.equals("타원")) {
				figures[i] = new Oval(s2.nextInt(), s2.nextInt(), s2.nextInt(), s2.nextInt());

			} else if (check.equals("사각형")) {
				figures[i] = new Rectangle(s2.nextInt(), s2.nextInt(), s2.nextInt(), s2.nextInt());

			} else if (check.equals("삼각형")) {
				figures[i] = new Triangle(s2.nextInt(), s2.nextInt(), s2.nextInt(), s2.nextInt());

			} else if (check.equals("사다리꼴")) {
				figures[i] = new Trapezoid(s2.nextInt(), s2.nextInt(), s2.nextInt(), s2.nextInt(), s2.nextInt());
			}
			s2.close();
			i++;
		}            //figure 참조

		float large = 0, small = Float.MAX_VALUE;
		for (int j = 0; j < figures.length; j++) {
			if (figures[j].area > large) large = figures[j].area;
			if (figures[j].area < small) small = figures[j].area;
		}
		for (int j = 0; j < figures.length; j++) {
			if (figures[j].area == large) figures[j].l_s = "L ";
			if (figures[j].area == small) figures[j].l_s = "S ";
		}

		if (args[1].equals("print_info")) {
			for (Figure x : figures) {
				System.out.println(x);
				avg += x.area;
				count ++;
			}
		} else if (args[1].equals("sort")) {
			if (args[2].equals("type")) {
				sort_t(figures);
				for (Figure x : figures) {
					System.out.println(x);
					avg += x.area;
					count ++;
				}

			} else if (args[2].equals("area")) {
				sort(figures);
				for (Figure x : figures) {
					System.out.println(x);
					avg += x.area;
					count ++;
				}
			}
		} else if (args[1].equals("print")) {
			sort_t(figures);
			for (Figure x : figures) {
				for (i = 0; i < args.length - 2; i++) {
					if (args[i + 2].equals(x.type)) {
						System.out.println(x);
						avg += x.area;
						count++;
					}
				}
			}
		}
		System.out.println(String.format("\n평균 면적 : %.2f", avg/count));
	}

	static void swap(int i, int j, Figure[] figures) {
		Figure tmp;

		tmp = figures[i];
		figures[i] = figures[j];
		figures[j] = tmp;
	}

	static void sort(Figure[] figures) {
		int size = figures.length;
		boolean swapped = false;
		while (true) {
			for (int i = 0; i < size - 1; i++) {
				if (figures[i].area > figures[i + 1].area) {
					swap(i, i + 1, figures);
					swapped = true;
				} else if ((figures[i].area == figures[i + 1].area) && (figures[i].type.charAt(0) > figures[i + 1].type.charAt(0))) {
					swap(i, i + 1, figures);
					swapped = true;
				} else if ((figures[i].type.length()>1&&figures[i+1].type.length()>1)&&(figures[i].area == figures[i + 1].area) && (figures[i].type.charAt(0) == figures[i + 1].type.charAt(0)) && (figures[i].type.charAt(1) > figures[i + 1].type.charAt(1))) {
					swap(i, i + 1, figures);
					swapped = true;
				}
			}
			if (!swapped) break;
			swapped = false;
		}
	}        //sort by area

	static void sort_t(Figure[] figures) {
		int j = 1;
		int size = figures.length;
		boolean swapped = false;
		while (true) {
			for (int i = 0; i < size - 1; i++) {

				if (figures[i].type.charAt(0) > figures[i + 1].type.charAt(0)) {
					swap(i, i + 1, figures);
					swapped = true;
				} else if ((figures[i].type.length()>1&&figures[i+1].type.length()>1)&&(figures[i].type.charAt(0) == figures[i + 1].type.charAt(0)) && (figures[i].type.charAt(1) > figures[i + 1].type.charAt(1))) {
					swap(i, i + 1, figures);
					swapped = true;
				} else if (figures[i].type.equals(figures[i + 1].type) && figures[i].area > figures[i + 1].area) {
					swap(i, i + 1, figures);
					swapped = true;
				}

			}
			if (!swapped) break;
			swapped = false;
		}
	}        //sort by type
}
class Figure {
	protected 	int		x, y;
	protected 	float	area;
	protected	String	type;
	protected 	String 	l_s = "";
	
	Figure() {
		x = 0;
		y = 0;
		area = 0.0f;
		type = "도형";
	}
	
	Figure(int x, int y) {
		this.x = x;
		this.y = y;
		area = 0.0f;
		type = "도형";
	}
	
	public String toString() {
		return(String.format("%s%s-[X:%d, Y:%d]", l_s,type, x, y));
	}
	
	float	getArea() {
		return(area);
	}
	
	void	setType(String ty) {
		type = ty;
	}
}		//도형

class Circle extends Figure {
	protected	int			radius;		// 반지름
	protected 	static final float PI = 3.1415f;
	
	Circle() {
		super();
		radius = 0;
	}
	
	Circle(int x, int y, int r) {
		super(x, y);
		radius = r;
		setType("원");
		area = 2*r*PI;
	}
	
	public String toString() {
		String tmp = super.toString();
		if (this instanceof Oval) return (tmp + String.format(" 반지름[%d]", radius));
		else return (tmp + String.format(" 반지름[%d] 면적[%.2f]", radius, area));
	}
}		//원

class Oval extends Circle {
	protected	int		s_radius;	// 작은 반지름
	
	Oval(int x, int y, int r, int sr) {
		super(x,y,r);
		s_radius = sr;
		setType("타원");
		area = r*sr*PI;
	}
	
	public String toString() {
		String tmp = super.toString();
		
		return(tmp+String.format(" 짧은반지름[%d] 면적[%.2f]",s_radius, area));
	}
}			//타원

class Rectangle extends Figure {
	protected int width, height;

	Rectangle() {
		super();
		width = 0;
		height = 0;
	}

	Rectangle(int x, int y, int w, int h) {
		super(x, y);
		width = w;
		height = h;
		setType("사각형");
		area = w * h;
	}

	public String toString() {
		String tmp = super.toString();

		if (this instanceof Trapezoid) return (tmp + String.format(" 가로[%d]", width));
		else if (this instanceof Triangle) return (tmp);

		else return (tmp + String.format(" 가로[%d] 세로[%d] 면적[%.2f]", width, height, area));
	}
}	//사각형

class Trapezoid extends Rectangle {
	protected	int		s_width;	// 짧은 가로
	
	Trapezoid(int x, int y, int w, int s_w, int h) {
		super(x,y,w,h);
		s_width = s_w;
		setType("사다리꼴");
		area = (w+s_w)*0.5f*h;
	}
	
	public String toString() {
		String tmp = super.toString();
		
		return(tmp+String.format(" 짧은가로[%d] 높이[%d] 면적[%.2f]", s_width, height,area));
	}
}	//사다리꼴

class Triangle extends Rectangle {
	Triangle(int x, int y, int w, int h) {
		super(x, y, w, h);
		setType("삼각형");
		area = w*h*0.5f;
	}
	
	public String toString() {
		String tmp = super.toString();
		return(tmp + String.format(" 밑변[%d] 높이[%d] 면적[%.2f]",width,height,area));
	}
}	//삼각형