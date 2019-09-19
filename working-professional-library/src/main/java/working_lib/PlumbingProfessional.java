package working_lib;

public class PlumbingProfessional extends Professional implements IPlumbingProfessional{

	public PlumbingProfessional(int id, String name) {
		super(id, name);
		// TODO Auto-generated constructor stub
	}

	public boolean fixPipe(Pipe a, Tool v) {
		if ( a == null||v==null)
		{
			return true;
		}
		return false;
	}

	
}
