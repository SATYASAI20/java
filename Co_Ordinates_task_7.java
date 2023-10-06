package Demo;
import java.util.Scanner;

public class Co_Ordinates_task_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		if(x==0 && y==0) {
			System.out.println("Origin");
		}else if(x==0) {
			System.out.println("x-axis");
		}else if(y==0) {
			System.out.println("y-axix");
		}
	}

}
