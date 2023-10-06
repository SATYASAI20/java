package Demo;

public class task_45_n_primes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=30;
		for(int i=1;i<=n;i++) {
			int count=0;
			for(int j=1;j<=i;j++) {
				if(i%j==0) {
					count+=1;
				}
			}
			if(count==2) {
				System.out.print(i+" ");
			}
		}
	}

}
