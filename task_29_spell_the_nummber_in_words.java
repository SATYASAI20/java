package Demo;
import java.util.*;
public class task_29_spell_the_nummber_in_words {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		String s = Integer.toString(a);
		HashMap<Character,String> map = new HashMap<Character,String>();
		map.put('1', "one");
		map.put('2', "two");
		map.put('3', "three");
		map.put('4', "four");
		map.put('5', "five");
		map.put('6', "six");
		map.put('7', "seven");
		map.put('8', "eight");
		map.put('9', "nine"); 
		map.put('0', "zero");
//		int temp;
		for(int i=0;i<s.length();i++) {
			char s1= s.charAt(i);
			if(map.containsKey(s1)) {
				
					System.out.print( map.get(s1)+" ");
				
				
			}
			
		}
//		System.out.println( map.get(a)+" ");
		
		
	}

}
