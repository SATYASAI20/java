package Demo;
import java.util.Scanner;
public class task_22_sum_of_series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		double sum=1;
		for(int i=1;i<=n;i++) {
			sum+=(double)(1/Math.pow(2, i));
			
		}
		System.out.println(sum);
	}

}
