package Examples;

import java.util.Scanner;
import java.util.function.Predicate;

public class AuthenticationByPredicate {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter user name");
		String uname =sc.next();
		System.out.println("Enter password");
		String password = sc.next();
		User user1 = new User(uname,password);
		Predicate<User> UserAuthentication =user-> user.uname.equals("srilu")&& user.password.equals("software");
		if(UserAuthentication.test(user1))
			System.out.println("Autheticated user");
		else
			System.out.println("UnAuthorized");
		
	}
}
