package graphics;
import java.util.Scanner;



public class rectamgle implements inter
{
Scanner sc=new Scanner(System.in);	
double l,b;

public void area()
{


System.out.println("enter the length");
 l=sc.nextDouble();
System.out.println("enter the breadth");
 b=sc.nextDouble();


System.out.println("area is"+l*b);
}
}