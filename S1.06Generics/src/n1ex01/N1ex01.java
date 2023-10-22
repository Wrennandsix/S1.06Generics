package n1ex01;

public class N1ex01 {

	public static void main(String[] args) {
		
		ChipPotatoes lays = new ChipPotatoes("Lay's");
		ChipPotatoes laysCampesinas = new ChipPotatoes("Lay's Campesinas");
		ChipPotatoes matutano = new ChipPotatoes("Matutano");
		
		// prova de que els arguments es poden posar en qualsevol posicio.
		NoGenericMethods object = new NoGenericMethods(lays, laysCampesinas, matutano);		
		NoGenericMethods object2 = new NoGenericMethods(laysCampesinas, matutano, lays);
		
		System.out.println(object);
		System.out.println(object2);
	}

}
