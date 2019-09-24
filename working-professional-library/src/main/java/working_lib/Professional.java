package working_lib;

import java.util.ArrayList;
import java.util.List;

public class Professional {
	private int id;
	private String name;
	private float salary;
	private List<Certification> certifications;

	public Professional( String name ) {
		this.name = name;
		
	}
	

	public Professional(int id, String name, float salary, List<Certification> certlist) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.certifications = certlist;
	}

	public Professional() {
		super();
		id = 0;
		name = "name";
		salary=0.0f;
		certifications = null;
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

	public List<Certification> getCertifications() {
		return certifications;
	}

	public void setCertifications(ArrayList<Certification> certifications) {
		this.certifications = certifications;
	}

	public void addCertification(Certification k) {// supposed to add certificates to the person list
		List<Certification>list = new ArrayList<Certification>();// creates an array list 
		list.add(k);
		
	}

}
