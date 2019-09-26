import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import working_lib.NetworkingProfessional;
import working_lib.Pipe;
import working_lib.Pliers;
import working_lib.PlumbingProfessional;
import working_lib.PvcPipe;
import working_lib.Tool;

@SuppressWarnings("unused")
public class PlumbingProfessionalTest { // test code used to check if the method fixRouter is working 
	@Test
	public void shouldFixPipe()
	 {
		PlumbingProfessional k = new PlumbingProfessional(0,"",0f,null);
		
		Tool x = new Pliers();
		Pipe y = new PvcPipe();
		
		 boolean result = k.fixPipe(y, x);
		 
		// assertEquals(false,result,0);
		 assertTrue(result);
		 
	 }

}
