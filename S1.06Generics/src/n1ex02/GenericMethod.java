package n1ex02;

public class GenericMethod {
	
	public static <E> void genericMethod(E argument1, E argument2, E argument3) {
		
		System.out.println(argument1);
		System.out.println(argument2);
		System.out.println(argument3);
	}

}

