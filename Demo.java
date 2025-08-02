package pack1;

public class Math1
{
 public void add(int a,int b)
{
int c;
c= a+b;
System.out.println("c= "+c);
}
}


package pack2;

public class Math2{

public void sub(int a,int b)
{
int c;
System.out.println("c= "+(a-b));
}
}


demo.java
import pack1.*;
import pack2.*;
import java.util.*;

class demo{
public static void main(String args[])
{
Math1 m1 = new Math1();
Math2 m2 = new Math2();

m1.add(10,3);
m2.sub(5,2);
}
}
