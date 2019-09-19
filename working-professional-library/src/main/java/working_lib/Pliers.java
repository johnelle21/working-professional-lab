package working_lib;

public class Pliers extends Tool {

	private String colour;

	public Pliers(String brand, String colour) {
		super(brand);
		this.colour = colour;
	}

	public Pliers() {
		super();
		colour = "colour";
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	@Override
	public boolean fix(IBreakableItem nh) {
		// TODO Auto-generated method stub
		return false;
	}

}
