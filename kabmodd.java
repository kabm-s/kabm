import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int a;
		Scanner v=new Scanner(System.in);
a=v.nextInt();
if(a<0)
{
	System.out.println("Invalid");
 
	}
	else if(a%2==0)
	{
		System.out.println("even");
	}
else
{
	System.out.println("odd");
}
}
}
