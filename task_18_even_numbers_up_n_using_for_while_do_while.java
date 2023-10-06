package Demo;
import java.util.Scanner;
public class task_18_even_numbers_up_n_using_for_while_do_while {
	//for loop
	static void using_for(int n) {
		for(int i=1;i<=n;i++) {
			if(i%2==0) {
				System.out.println(i+" ");
			}
		}
		using_while(n);
		
	}
	///while loop
	static void using_while(int n) {
		int i=1;
		while(i<=n) {
			if(i%2==0) {
				System.out.println(i+" ");
			}
		}
		using_do_while(n);
	}
	//while do while loop
	static void using_do_while(int n) {
		int j=2;
		do{
			if(j%2==0) {
				System.out.println(j+" ");
			}
			j++;
		}while(j<=n);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
//		task_18_even_numbers_up_n_using_for_while_do_while obj = new task_18_even_numbers_up_n_using_for_while_do_while();
		using_for(n);
//		using_do_while(n);
		
		
		
		
	}

}
