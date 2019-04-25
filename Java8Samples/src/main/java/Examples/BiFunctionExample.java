package Examples;

import java.util.function.BiFunction;

/*Bi Function takes 2 input arguments and return only one value
 * 
 * 
 * */
public class BiFunctionExample {
	public static void main(String[] args) {

		BiFunction<Integer, Integer, Integer> bf = (a,b)->a+b;
		System.out.println(bf.apply(3,4));
	}
}
