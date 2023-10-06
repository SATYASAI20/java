package Demo;
import java.util.Scanner;
public class Leap_Year3 {
	
//	int year;
//	Leap_Year3(int year){
//		this.year = year;
//	}
//	
	static String leap_Year(int year) {
		if(year%400==0|| (year%4==0 && year%100!=0) ) {
			return "Given year is leap year";
		}else {
			return "Given year is  not a leap year";
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		Leap_Year3 obj = new Leap_Year3();
		System.out.println(leap_Year(a));
		
		
	}

}
