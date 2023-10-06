package Demo;

public class task44_sum_of_n_numbers_up_50 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=50,sum=0;
		for(int i=1;i<=n;i++) {
			if(i<=50) {
				sum+=i;
			}
		}
		System.out.println(sum);
	}

}
