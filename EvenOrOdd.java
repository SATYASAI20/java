package Demo;
import java.util.Scanner;

//Check the number is even or odd task 2
public class EvenOrOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		if(a%2==0) {
			System.out.println("Even");
		}else {
			System.out.println("odd");
		}
		
	}

}
