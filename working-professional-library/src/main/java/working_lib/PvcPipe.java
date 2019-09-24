package working_lib;

public class PvcPipe extends Pipe {
	private String colour;

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public PvcPipe(float length, float diameter, String colour) {
		super(length, diameter);
		this.colour = colour;
	}

	public PvcPipe() {
		super();
		colour = "";
	}

	public void updateDamage(float u) {
		System.out.println(" the damage log has been updated with file number "+u);
	}

	@Override
	public String toString() {
		return "PvcPipe [colour=" + colour + "]";
	}


}
