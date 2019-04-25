package Examples;

import java.util.function.DoubleUnaryOperator;
import java.util.function.IntUnaryOperator;
import java.util.function.LongUnaryOperator;
import java.util.function.UnaryOperator;

/* if input type and return type both are same those are unary operators
 * 
 * */

public class UnaryOperatorExample {

	public static void main(String[] args) {
		
		UnaryOperator<Integer> uo = i->i*i;
		System.out.println(uo.apply(10));
		System.out.println("Here the input type we provided is integer and result produced is integer so this is unaryOperator");
		System.out.println("");
		System.out.println("y to go for primitiveUnaryOperator ---");
		System.out.println("");
		System.out.println("In Unary operator the primitive value is converted to Integer , again converted to primitive while multiplying, again converted to Integer.");
		System.out.println("So we are going for primitive UnaryOperators");
		System.out.println("");
		System.out.println("-----Primitive versions of UnaryOperator");
		
		IntUnaryOperator iuo =i->i*i;
		LongUnaryOperator luo =i->i*i;
		DoubleUnaryOperator duo =i->i*i;
		
		System.out.print(iuo.applyAsInt(10));
		System.out.println("   when we are using primitive int value");
		System.out.print(luo.applyAsLong(10l));
		System.out.println("   when we are using primitive Long value");
		System.out.print(duo.applyAsDouble(10.2));
		System.out.println("   when we are using primitive double value");
		
		
		
		
		
	}
}
