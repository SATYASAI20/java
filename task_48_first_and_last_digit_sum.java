package Demo;

public class task_48_first_and_last_digit_sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=123;
		int first=n%10,last=0;
		while(n!=0) {
			last=n%10;
			n=n/10;
			
		}
		System.out.print(first+last);
		
	}

}
