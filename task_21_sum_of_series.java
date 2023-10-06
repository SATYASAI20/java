package Demo;
import java.util.Scanner;
public class task_21_sum_of_series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		double sum=0;
		for(int i=1;i<=n;i++) {
			sum+=(double)1/i;
		}
		System.out.println(sum);
	}

}
