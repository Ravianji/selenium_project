package demo_package;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(genericLibraries.ListenerIplementation.class)
public class ListenerTC2 {
	
	@Test
	public void demoListenerListenerTC2() {
		System.out.println("Ths is testcase1");
		
	}
	@Test
	public void demoListener1ListenerTC2() {
		System.out.println("Ths is testcase2");
		assertEquals(false, true);
		syo
	}
}
