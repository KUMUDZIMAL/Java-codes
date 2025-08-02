import java.util.*;
class Calculate
{
	public void area(int l)
	{

	

            

		
		System.out.println("Area of Square is : "+(l*l));	
	}

	public void area(int l,int b)  
	{



		System.out.println("Area of Rectangle is : "+(l*b));
	}

	public void area(float b, float h)

	{


		System.out.println("Area of Triangle is : "+(0.5*b*h));
	}
}

public class Area
{
	public static void main(String arg[])
	{
		Calculate c1 = new Calculate();  
		
		c1.area(10);
		c1.area(8,9);
		c1.area((float)7,(float)6);
	}
}
