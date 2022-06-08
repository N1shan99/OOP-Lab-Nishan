package graphics;
import java.util.Scanner;



public class square implements inter
{
Scanner sc=new Scanner(System.in);	
double l;

public void area()
{


System.out.println("enter the length");
 l=sc.nextDouble();


System.out.println("area is"+l*l);
}
}