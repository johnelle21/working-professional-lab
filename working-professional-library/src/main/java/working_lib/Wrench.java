package working_lib;

public class Wrench extends Tool {

	private float size;

	public Wrench(String brand, float size) {
		super(brand);
		this.size = size;
	}

	public float getSize() {
		return size;
	}

	public void setSize(float size) {
		this.size = size;
	}

	@Override
	public boolean fix(IBreakableItem nh) {
		// TODO Auto-generated method stub
		return false;
	}

}
