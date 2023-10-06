package Demo;
import java.util.Scanner;
public class task_27_perfect_number {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		int sum=0;
		for(int i=1;i<=a/2;i++) {
			if(a%i==0) {
				sum+=i;
			}
		}
		
		if(sum==a) {
			System.out.println("yes a perfect Number");
		}else {
			System.out.println("not a perfect Number");
		}
	}

}
