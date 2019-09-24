package working_lib;

import java.util.List;

public class NetworkingProfessional extends Professional implements INetworkingProfessional {

	public NetworkingProfessional( int id, String name, float salary, List<Certification> certlist) 
	{
		super( name);
		// TODO Auto-generated constructor stub
	}
	public NetworkingProfessional( ) 
	{
		super( );
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
	
	public boolean fixRouter(Router a, Tool v) {//fix router method used by netProfesses only 
		
		System.out.println("The "+v+" is being used to fix the "+a);
		if (a == null || v == null) {
			return true;
		}
		return false;
	}

}
