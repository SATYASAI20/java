package Demo;
import java.util.Scanner;

public class task7 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float pi=3.14F;
		Scanner sc = new Scanner(System.in);
		int radius = sc.nextInt();
		int area = (int) (pi*radius*radius);
		System.out.println(area);
		int cube = radius*radius*radius;
		System.out.println(cube);
		
	}

}
