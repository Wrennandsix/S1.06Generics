package n2ex02;

import java.util.ArrayList;

public class GenericMethod {
	
	
	public static <T> void genericMethod(ArrayList<T> list) {
		
		for (Object o : list) {
			System.out.println(o);
		}
	}

}
