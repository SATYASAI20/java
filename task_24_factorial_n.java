package Demo;
import java.util.Scanner;
public class task_24_factorial_n {
	
	static int fact(int i) {
		if(i==1) {
			return 1;
		}else if(i==0) {
			return 0;
		}else {
			return i*fact(i-1);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		System.out.println(fact(a));
	}

}
