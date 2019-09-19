package working_lib;

public class Certification {
	private int number;
	private String name;

	public Certification(int number, String name) {
		this.number = number;
		this.name = name;
	}

	public Certification() {
		number = 0;
		name = "";
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
