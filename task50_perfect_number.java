package Demo;

public class task50_perfect_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=7,sum=0;
		for(int i=1;i<=n;i++) {
			
				if(n%i==0) {
					sum+=i;
					
				}else {
					break;
				}
			
		}
		if(sum==n) {
			System.out.print("true");
		}else {
			System.out.print("fasle");
		}

	}

}
