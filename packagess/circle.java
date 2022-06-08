package graphics;
import java.util.Scanner;



public class circle implements inter
{
Scanner sc=new Scanner(System.in);	
double r,ar;
public void area()
{

System.out.println("enter the radius");
 r=sc.nextDouble();
ar=3.14*r*r;
System.out.println("area is"+ar);
}
}
