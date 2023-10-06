package Demo;
import java.util.Scanner;
public class task_8_biggest_Of_two {
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		if(a>b) 
			System.out.print(a+" is bigger then"+b);
		System.out.print(b+" is bigger then"+a);
		
	}
}
