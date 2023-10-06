package Demo;
import java.util.*;
public class reapting_char_in_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "saatyaass";
		HashMap<Character,Integer> map= new HashMap<>();
		char ch;
		for(int i=0;i<s.length();i++) {
			ch=s.charAt(i);
			map.put(ch, map.getOrDefault(ch,0)+1);
			
		}
		System.out.println(map);
	}

}
