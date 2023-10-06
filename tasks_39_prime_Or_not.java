package Demo;
import java.util.Scanner;
public class tasks_39_prime_Or_not {
	static String isPrime(int n) {
		if(n==1 ||n==0) {
			return "not prime";
		}
		else {
			int count=0;
			for(int i=2;i<=n/2;i++) {
				if(n%i==0) {
					count++;
				}
			}
			if(count==0) {
				return "prime";
			}
			
		}
		return "not prime";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int prime = sc.nextInt();
		System.out.println((isPrime(prime)));
	}

}
