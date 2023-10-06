package Demo;

public class first_500_primes {
	static boolean isprime(int n) {
		for(int i=2;i<=n/2;i++) {
			if(n%i==0) {
				return false;
			}
			
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=1,i=2;
		int sum=0;
		while(count<=2) {
			if(isprime(i)) {
				sum+=i;
				count++;
			}
			i+=1;
		}
		System.out.print(sum);
	}

}
