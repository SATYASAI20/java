package Demo;
import java.util.Scanner;
public class task_17_sum_of_all_even_numbers_btw_n {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum=0;
		for(int i=1;i<=n;i++) {
			if(i%2==0) {
				sum+=i;
			}
		}
		System.out.println(sum);
	}

}
