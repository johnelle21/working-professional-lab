package working_lib;

public abstract class Pipe implements IBreakableItem {
	protected float length;
	protected float diameter;
	protected String name ;

	public Pipe(float length, float diameter) {

		this.length = length;
		this.diameter = diameter;
		name="Pipe";
	}

	public String getName() {
		return name;
	}


	public Pipe() {
		length = 0;
		diameter = 0;
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

	public void updateDamage(float u) {
		System.out.println(" the damage log has been updated with file number "+u);
	}
}
