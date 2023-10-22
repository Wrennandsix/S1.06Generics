package n2ex01;

public class N2ex01 {

	public static void main(String[] args) {
		
		int fakeAge = 20;
		String fakeSurname = "Sanchez";
		
		Person person1 = new Person("Juan", "Magan", 45);
		
		GenericMethod.genericMethod(person1, fakeAge, fakeSurname);
		GenericMethod.genericMethod(person1, fakeSurname, fakeAge);
				
	// Ahora no se pueden pasar en cualquier orden solo se puede cambiar el orden de los parametros genericos.	
		//GenericMethod.genericMethod(fakeAge, person1, fakeSurname);

	}

}
