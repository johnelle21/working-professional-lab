import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import working_lib.PlumbingProfessional;

@SuppressWarnings("unused")
public class PlumbingProfessionalTest {// test code used to check if the method fix pipes is working 
	@Test
 public void shouldFixPipes()
 {
		PlumbingProfessional plumber = new PlumbingProfessional(1,"jon");
		
		boolean results = plumber.fixPipe(null, null);
		assertTrue(results);
	 
 }
}
