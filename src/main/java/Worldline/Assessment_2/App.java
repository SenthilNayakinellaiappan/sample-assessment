package Worldline.Assessment_2;

public class App 
{
	public static String play(int number) 
	{
        if (number % 2 == 0) 
        {
            return "EVEN";
        } 
        else  
        {
        	for (int i = 3; i <= Math.sqrt(number); i += 2) 
        	{
                if (number % i == 0) 
                {
                    return "ODD";
                }
            }
            return "PRIME"; 
        }
	}
}
