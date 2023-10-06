package Demo;
import java.util.Scanner;
public class task_14_multiplication_table_for_a_given_number {
	int number;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number to print multiplication table : ");
		int number = sc.nextInt();
		for(int i=1;i<=10;i++) {
			System.out.println(number+" "+"*"+" "+ i +" "+"= " + number*i);
		}
		
	}

}
