package working_lib;

import java.util.ArrayList;

public class Professional {
	private int id;
	private String name;
	private float salary;
	private ArrayList<Certification> certifications;

	public Professional(int id, String name ) {
		this.id = id;
		this.name = name;
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public ArrayList<Certification> getCertifications() {
		return certifications;
	}

	public void setCertifications(ArrayList<Certification> certifications) {
		this.certifications = certifications;
	}

	public void addCertification(Certification k) {
		// for (int i=0;i<Certification.length)
		// consider method to add on to an array list
	}

}
