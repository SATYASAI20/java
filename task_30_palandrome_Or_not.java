package Demo;
import java.util.*;
public class task_30_palandrome_Or_not {
	
	static void ispalandrome(String a) {
		int l = a.length();
		String rem="";
		for(int i=l-1;i>=0;i--) {
			 rem += a.charAt(i);
		}
		if(rem.equals(a)) {
			System.out.println("Number is palandrome");
		}else {
			System.out.println("Number is not a palandrome");
		}
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		ispalandrome(a);

	}

}
