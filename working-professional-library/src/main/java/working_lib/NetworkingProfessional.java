package working_lib;

public class NetworkingProfessional extends Professional implements INetworkingProfessional {

	public NetworkingProfessional(int id, String name) {
		super(id, name);
		// TODO Auto-generated constructor stub
	}
	

//	public boolean fixRouter(Router a, Tool g) {
//		
//		if (a.getBrand().equalsIgnoreCase(g.getBrand())) {
//			return true;
//		}
//		else
//		{
//			a.setBrand(g.getBrand());
//		}
//		
//		return false;
//	}
	
	public boolean fixRouter(Router a, Tool v) {
		if ( a == null||v==null)
		{
			return true;
		}
		return false;
	}

}
