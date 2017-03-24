package ch.fhnw.mas.wuvo;

/**
 * 
 * @author chvoser
 * This class calculate the faculty of the number which
 * was entered by the user.
 */

public class MathUtil {

	/**
	 * 
	 * @param n input value for calculation
	 * @return the faculty result 
	 */
	public static long faculty(int n)
	{
		long result = 1;
		
		for(int i = 2; i<=n; i++)
		{
			
			result = result * i;
								
		}
		
	return result;
			
				
	}
	
}
