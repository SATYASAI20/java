package Demo;
import java.util.Scanner;

public class Task_13_Number_of_days_in_a_month {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter a Month Number : 1. January , 2.February 3.March, 4.April, 5.May , 6.June, 7.July, 8.August, 9.September, 10.October , 11.November, 12.December");
		System.out.println();
		int a = sc.nextInt();
		if(a== 1 ||  a == 3|| a== 5||a==7||a==8|| a==10|| a==12) {
			System.out.println("The Number of day in the Month is : 31");
		}else if(a== 2) {
			System.out.println("The Number of days in the Month is : 29");
		}else if( a==4 || a==6 || a==9|| a==11) {
			System.out.println("The Number of days in the Month is : 30");
		}else {
			System.out.println("Please Enter a valid Number!!!");
		}
		
		
	}

}
