package ch.fhnw.mas.wuvo;

public class MathUtil {

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
