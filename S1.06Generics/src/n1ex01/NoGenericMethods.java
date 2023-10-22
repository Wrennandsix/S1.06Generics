package n1ex01;
import java.util.ArrayList;


public class NoGenericMethods {
	
	private ArrayList<ChipPotatoes> store = new ArrayList<ChipPotatoes>();

	public NoGenericMethods(ChipPotatoes lays, ChipPotatoes matutano, ChipPotatoes grefusa) {
		super();
		store.add(lays);
		store.add(matutano);
		store.add(grefusa);
	}
	
	public ChipPotatoes getChips1() {
		return store.get(0);
	}
	
	public ChipPotatoes getChips2() {
		return store.get(1);
	}
	
	public ChipPotatoes getChips3() {
		return store.get(2);
	}
	
	
	public void setChips1(ChipPotatoes newChips1) {
		store.set(0, newChips1);
	}
	
	public void setChips2(ChipPotatoes newChips2) {
		store.set(1, newChips2);
	}
	
	public void setChips3(ChipPotatoes newChips3) {
		store.set(2, newChips3);
	}

	@Override
	public String toString() {
		return "NoGenericMethods items at the store: [strings=" + store + "]";
	}
}