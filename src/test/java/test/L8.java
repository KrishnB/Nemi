package test;

import java.util.Arrays;
import java.util.List;

import org.testng.annotations.Test;

public class L8 {
	int i=1;
	//@Test
	public void test() {
		List<Integer> intList = Arrays.asList(1,2,3,4,5);
		
		intList.forEach(
				(Integer x) -> {System.out.println(x);
				x=x+5;
				System.out.println(x);
				}
				);
	}
	
	@Test
	public void test1() {
		
		PasswordEncoder encoder = updatePassword();
		doSomething(encoder);
		doSomething1(encoder);
	}
	
	private PasswordEncoder updatePassword() {

		return (password, salt) ->  password.toUpperCase();
	}
	
	private void doSomething(PasswordEncoder encoder) {
		String salted = encoder.encode("Krishna", "Janaki");
		
		System.out.println(salted);
	}
	private void doSomething1(PasswordEncoder encoder) {
		String salted1 = encoder.encode("Janaki", "Krishna");
		System.out.println(salted1);
	}

}
