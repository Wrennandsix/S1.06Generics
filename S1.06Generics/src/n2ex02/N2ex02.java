package n2ex02;

import java.util.ArrayList;

import n2ex01.Person;

public class N2ex02 {

	public static void main(String[] args) {
		ArrayList<Object> list = new ArrayList<>();
		Person person1 = new Person("Juan", "Magan", 45);
		list.add(person1);
		list.add("Salchichon Iberico");
		list.add(5);
		list.add(2.7);
		System.out.println(list);
	}

}
