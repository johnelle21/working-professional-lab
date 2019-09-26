package working_lib;

import java.util.List;

public class PlumbingProfessional extends Professional implements IPlumbingProfessional {

	
	

	public PlumbingProfessional(int id, String name, float salary, List<Certification> certlist) {
		super(id, name, salary, certlist);
		// TODO Auto-generated constructor stub
	}
	
	public PlumbingProfessional() {
		super();
		// TODO Auto-generated constructor stub
	}


	@SuppressWarnings("unused")
	public boolean fixPipe(Pipe a, Tool v) {
		System.out.println("The " + v.getBrand() + " is being used to fix the " + a.getName());
		
		return true;
	}

}
