package Examples;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class StreamEx {
	public static void main(String[] args) {

		ArrayList<Integer> values = new ArrayList<>();
		for(int i=1;i<=3;i++) {
			values.add(i);
		}
		
		
		System.out.println(values.stream().map(i->i*2).reduce(0,(c,e)->c+e));
	}
}
