package working_lib;

public abstract class Router implements IBreakableItem{
private String brand ;
private float bandwidth;


public Router(String brand, float bandwidth) {
	super();
	this.brand = brand;
	this.bandwidth = bandwidth;
}

public Router() {
	super();
	brand = "";
	bandwidth = 0;
}

public String getBrand() {
	return brand;
}

public void setBrand(String brand) {
	this.brand = brand;
}

public float getBandwidth() {
	return bandwidth;
}

public void setBandwidth(float bandwidth) {
	this.bandwidth = bandwidth;
}

public void updateDamage(float u) {
	System.out.println(" the damage log has been updated with file number "+u);
}
}
