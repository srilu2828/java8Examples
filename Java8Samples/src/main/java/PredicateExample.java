import java.util.function.Predicate;

public class PredicateExample {
public static void main(String[] args) {
	
	String[] snames = {"raju","balu","srilu","pranav","sumalatha"};
	
	Predicate<String> p= s->s.charAt(0) =='s';
	Predicate<String> p1= s->s.length()>4;
	System.out.println("Names starts with s  and length greaterthan  4 is  ");
	for(String sn:snames) {
		if(p.and(p1).test(sn))
			System.out.println(sn);
	}
			
}
}
