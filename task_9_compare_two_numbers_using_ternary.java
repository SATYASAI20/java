package Demo;
import java.util.Scanner;

public class task_9_compare_two_numbers_using_ternary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc  = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		String c = a>b ? a+" is bigger ": b+" is bigger";
		System.out.println(c);
	}

}
