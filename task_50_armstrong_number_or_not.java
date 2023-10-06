package Demo;
import java.util.*;
public class task_50_armstrong_number_or_not {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int temp,sum=0,last,digit=0;
		temp=a;
		while(temp>0) {
			temp=temp/10;
			digit++;
		}
		temp=a;
		while(temp>0) {
			last=temp%10;
			sum+=Math.pow(last, digit);
			temp=temp/10;
		}
		if(sum==a) {
			System.out.print("true");
		}else {
			System.out.print("Not a armstrong");
		}
		
	}

}
