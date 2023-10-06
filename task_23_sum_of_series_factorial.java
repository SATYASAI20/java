package Demo;
import java.util.Scanner;
public class task_23_sum_of_series_factorial {
//	static int fact(int i) {
//		if(i==1) {
//			return 1;
//		}else if(i==0) {
//			return 0;
//		}else {
//			return i*fact(i-1);
//		}
//	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		String s1 = "1+x^1/1!+";
		StringBuffer s = new StringBuffer(s1);
		for(int i=2;i<=a;i++) {
			s.append(("x^"+i)+"/"+(i+"!"));
			
		}
		System.out.print(s);
	}

}
