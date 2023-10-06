package Demo;
import java.util.Scanner;
public class task_31_fibnocci_series {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int n1=0,n2=1,n3,i;
		
		if(a==0 || a==1) {
			System.out.print(a+" ");
		}
		else{	
			System.out.print(n1+" "+n2);
				for(i=2;i<a;i++) {
					
					n3=n1+n2;
					System.out.print(n3+" ");
						n1=n2;
						n2=n3;
					}
				
				
			
			}
			
		}
				
				 
				 
			
			
		}
	
		
		
	


