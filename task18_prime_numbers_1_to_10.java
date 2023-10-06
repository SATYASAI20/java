package Demo;
public class task18_prime_numbers_1_to_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=10;i++) {
			int count=0;
			for(int j=2;j<=(10/2+1);j++) {
				
				if(i%j==0) {
					count+=1;
				}
				
			}
			if(count==1) {
				System.out.println(i);
			}
			
		}
	}

}
 