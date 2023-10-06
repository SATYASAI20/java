package Demo;
import java.util.Scanner;

public class Number_DivisibleBy_3_5_task4 {
	
	static String  divisibleOrNot(int a) {
		if(a%3==0 && a%5==0) {
			return "Given number is divisible by 3 and 5";
		}else {
			return "Given number is not divisible by 3 and 5";
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		System.out.println(divisibleOrNot(a));
	}

}
