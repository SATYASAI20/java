package Demo;
import java.util.*;

public class task_41_occurance_of_digit_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,Integer> map = new HashMap<>();
		int temp=12370;
		
		int last;
		while(temp!=0) {
			last=temp%10;
			map.put(last, map.getOrDefault(last, 0)+1);
			temp=temp/10;
		}
		System.out.println(map);
		for(int i=0;i<10;i++) {
			if(map.get(i)==null) {
				continue;
			}else {
				System.out.println(i+" "+map.get(i));
			}
			
			
		}
	}

}
