import working_lib.CiscoRouter;
import working_lib.NetworkingProfessional;
import working_lib.Pipe;
import working_lib.Pliers;
import working_lib.PvcPipe;
import working_lib.Router;
import working_lib.Tool;

//import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;


public class NetworkingProfessionalTest { // test code used to check if the method fixRouter is working 
	@Test
	public void shouldFixRouter()
	 {
		NetworkingProfessional k = new NetworkingProfessional( 0, null, 0, null);
		
		 Tool x = new Pliers();
			Router y = new CiscoRouter();
			
			 boolean result = k.fixRouter(y, x);
		 
		// assertEquals(false,result,0);
		 assertTrue(result);
		 
	 }

}
