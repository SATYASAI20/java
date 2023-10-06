package Demo;
import java.util.Scanner;

//program to take the number at runtime and check positive or negative

public class PositiveOrNegaticeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		if(a>0){
			System.out.print("Number is positive");
			
		}else if(a<0){
			System.out.print("Number is negative");
			
		}else {
			System.out.println("Number is Zero");
		}
		
	}

}
