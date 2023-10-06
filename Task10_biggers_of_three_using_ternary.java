package Demo;
import java.util.Scanner;
public class Task10_biggers_of_three_using_ternary {
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		String max = (a>b)? (a>c?a+" is bigger":c+" is bigger") : (b>c ? b+" is bigger":c+" is bigger");
		System.out.println(max);
	}
}
