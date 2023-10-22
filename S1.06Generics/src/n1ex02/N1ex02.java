package n1ex02;

public class N1ex02 {

	public static void main(String[] args) {
		
		int fakeAge = 20;
		String fakeSurname = "Sanchez";
		
		Person person1 = new Person("Juan", "Magan", 45);
		
		GenericMethod.genericMethod(person1, fakeAge, fakeSurname);
		// prova de que els arguments es poden posar en qualsevol posicio i tipus de parametre.
		GenericMethod.genericMethod(fakeAge, person1, fakeSurname);

	}

}
