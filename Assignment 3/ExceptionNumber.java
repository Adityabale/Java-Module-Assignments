/* Write a Java program that reads a string from the user and attempts to convert it to an integer
using Integer.parseInt(). If the input is not a valid integer, handle the NumberFormatException.
Additionally, handle NullPointerException if the input is null. Use a finally block to print
"Conversion attempt completed." */
import java.util.*;
class NumberException
{
	String input=null;
	Scanner sc=new Scanner(System.in);
	void findException()
	{
		
		try
		{
			System.out.println("Enter the input:");
			String input=sc.nextLine();
			int number=Integer.parseInt(input);
			System.out.println("Conversion is completed:"+number);
			
			
		}	
			
		catch(NumberFormatException e)
		{
			System.out.println("Input is Invalid");
		}
		catch(NullPointerException e)
		{
			System.out.println("Input was null");
		}
		finally
		{
			System.out.println("In Finally Block Conversion completed");
		}
			
	
		
	}
}
public class ExceptionNumber11 {
	public static void main(String args[])
	{
		NumberException n=new NumberException();
		n.findException();
		
	}

}
