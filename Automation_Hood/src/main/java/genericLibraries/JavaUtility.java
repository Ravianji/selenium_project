package genericLibraries;

import java.util.Random;
/***
 * 
 * @author ravi
 *
 */
public class JavaUtility {
	/**
	 * This method is used to generate the random number 
	 * @return
	 */
	public int generatingRandomNumber() {
		Random random = new Random();
		return random.nextInt();
	}

}
