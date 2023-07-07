package demo_package;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(genericLibraries.ListenerIplementation.class)
public class ListenerTC3 {
	
	@Test
	public void demoListenerListenerTC3() {
		System.out.println("Ths is testcase1");
		
	}
	@Test
	public void demoListener1ListenerTC3() {
		System.out.println("Ths is testcase2");
		assertEquals(false, true);
		
	}
}
