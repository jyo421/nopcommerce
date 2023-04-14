package noncommerce.utilities;

import nopcommerce.constant.Constantpage;

public class Staticwait {
	
	public static void staticShortWait() {
		try 
		{
			Thread.sleep(Constantpage.SHORT_WAIT);
		} 
		catch(InterruptedException e) 
		{
			e.printStackTrace();
		}
	}



}
