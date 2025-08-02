
import java.util.*;
import java.lang.*;
class Two extends Thread
{
int x=2;
public void run()
{
for(int i=1;i<=10;i++)
{
System.out.println(x*i);
}
}
}

class Ten extends Thread
{
int x=10;
public void run()
{
for(int i=1;i<=10;i++)
{
System.out.println(x*i);
}
}
}

public class Multithreading
{
	public static void main(String args[]){
	Two t1 = new Two();
	Ten t2 = new Ten();
	t1.start();
	t2.start();
	}
}
