package Demo;
import java.util.Scanner;
public class task_28_validate_input_1_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter a number in between 1 to 10 : ");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		if(a>=1 && a<=10) {
			System.out.println("number is valid");
		}else {
			System.out.println("Number is inValid");
		}
	}

}
