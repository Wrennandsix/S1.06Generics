package n2ex01;

public class GenericMethod {
	
	public static <E> void genericMethod(Person person1, E argument2, E argument3) {
		
		System.out.println(person1);
		System.out.println(argument2);
		System.out.println(argument3);
	}

}

