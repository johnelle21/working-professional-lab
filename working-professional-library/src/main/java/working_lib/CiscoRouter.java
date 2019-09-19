package working_lib;

public final class CiscoRouter extends Router{
	
	private int ciscoCode ;

	public int getCiscoCode() {
		return ciscoCode;
	}

	public void setCiscoCode(int ciscoCode) {
		this.ciscoCode = ciscoCode;
	}

	public CiscoRouter(String brand, float bandwidth, int ciscoCode) {
		super(brand, bandwidth);
		this.ciscoCode = ciscoCode;
	}
	public CiscoRouter() {
		super();
		ciscoCode = 0;
	}

	public void updateDamage(float u) {
		// TODO Auto-generated method stub
		
	}
	

}
