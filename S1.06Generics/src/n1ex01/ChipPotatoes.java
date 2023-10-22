package n1ex01;

public class ChipPotatoes {
	private String brand;

	public ChipPotatoes(String brand) {
		super();
		this.brand = brand;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	@Override
	public String toString() {
		return "ChipPotatoes [brand=" + brand + "]";
	}

}