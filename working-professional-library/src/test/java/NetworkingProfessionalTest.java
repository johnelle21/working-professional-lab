import working_lib.NetworkingProfessional;
//import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;


public class NetworkingProfessionalTest { // test code used to check if the method fixRouter is working 
	@Test
	public void shouldFixRouter()
	 {
		NetworkingProfessional k = new NetworkingProfessional( 0, null, 0, null);
		
		 boolean result = k.fixRouter(null, null);
		 
		// assertEquals(false,result,0);
		 assertTrue(result);
		 
	 }

}
