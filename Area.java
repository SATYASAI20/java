package Demo;
import java.util.Scanner;
//task13

public class Area {
//	int length,breadth;
//	Area(int length,int breadth){
//		this.length = length;
//		this.breadth = breadth;
//	}
	
	int returnArea(int length, int breadth) {
		return length*breadth;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int length = sc.nextInt();
		int breadth = sc.nextInt();
		Area obj = new Area();
		System.out.print(obj.returnArea(length, breadth));
		
		
		
	}

}
