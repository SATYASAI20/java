package Demo;
import java.util.Scanner;
public class task_40_10_numbers_min_max_avg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] a = new int[10];
		for(int i=0;i<10;i++) {
			int numbers = sc.nextInt();
			a[i]=numbers;
		}
		

		int max=a[0],min=a[0],sum=0; 
		for(int i=0;i<a.length;i++) {
			sum+=a[i];
			if(a[i]<min) { /
				min=a[i];
			}else if(a[i]>max){
				max = a[i];
			}
		}
		System.out.println(sum/a.length+" "+min+" "+max);
		
			
		
	}

}
