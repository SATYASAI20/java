package Demo;
import java.util.Scanner;
public class task_32_do_while_loop_multiplication_table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int i=1;
		do {
			System.out.println(a+" * "+i+" = "+a*i);
			i++;
		}while(i<=10);
	}

}
