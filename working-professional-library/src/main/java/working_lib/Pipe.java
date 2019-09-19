package working_lib;

public abstract class Pipe implements IBreakableItem{
	protected float length;
	protected float diameter;
	
	public Pipe(float length, float diameter) {
		
		this.length = length;
		this.diameter = diameter;
	}
	
	public Pipe() {	
		length =0;
		diameter =0;
	}

	public float getLength() {
		return length;
	}

	public void setLength(float length) {
		this.length = length;
	}

	public float getDiameter() {
		return diameter;
	}

	public void setDiameter(float diameter) {
		this.diameter = diameter;
	}
	
	

}
