import java.util.Scanner;
class mult extends Thread
{
	int i;
	public void run()
	{

		System.out.println("Multiplication");
for(i=1;i<=10;i++)
	System.out.println(i+" * 5="+(i*5));
}
}


class prime extends Thread
{ 
	int c=0,i,j,n;
	Scanner sc=new Scanner(System.in);
	prime()
	{
		System.out.println("Enter the value for n:");	
		n=sc.nextInt();
	}
	public void run()
	{
	
		System.out.println("Prime numbers:");
		for(i=2;i<=n;i++)
		{
			for(j=1;j<=i;j++)
			{
				if(i%j==0)
				c++;
			}
			if(c==2)
				System.out.println(i);
			c=0;
		}

	}
}


class Multi_prime
{
public static void main(String args[])
{
	mult m=new mult();
	prime p=new prime();
	p.start();
	m.start();
}
}