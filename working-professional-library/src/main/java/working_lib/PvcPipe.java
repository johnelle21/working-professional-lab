package working_lib;

public class PvcPipe extends Pipe  {
	private String colour ;

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

	public void updateDamage(float u) {
		// TODO Auto-generated method stub
		
	}
	

}
