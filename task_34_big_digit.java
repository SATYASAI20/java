package Demo;
import java.util.Scanner;
public class task_34_big_digit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		String s = Integer.toString(a);
		int max =0; 
		for(int i=1;i<=s.length();i++) {
			if(max<i) { 
				max=i;	
			}else {
				continue;
			}
		}
		System.out.println(max);
	}

}
