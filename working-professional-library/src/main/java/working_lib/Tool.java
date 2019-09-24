package working_lib;

public  abstract class Tool {
	@Override
	public String toString() {
		return "brand=" + brand + " ";
	}

	private String brand;
	
	
	
	public Tool(String brand) {
		this.brand = brand;
	}

	public Tool() {
		brand = "brand";
	}

	public abstract boolean fix (IBreakableItem nh);

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

}
