import java.util.Scanner;
class fibo implements Runnable
	{
		public void run()
		{
			int f=0,s=1,r=0,i=0,n;
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter Limit for Fibonacci Series: ");
			n=sc.nextInt();
			System.out.println("Fibonacci Series: ");
			while(i<n)
			{
				System.out.println(r);
				f=s;
				s=r;
				r=f+s;
				i++;
			}

		}
	}

class even implements Runnable
	{
		public void run()
		{
			int n,i;
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter Range for checking even numbers: ");
			n=sc.nextInt();
			System.out.println("Even numbers are: ");
			for(i=0;i<=n;i++)
			{
				if(i%2==0)
				{
					System.out.println(i);
				}
			}
		}
	}

class RunnableInt
{
	public static void main(String args[])
	{
		fibo f=new fibo();
		Thread t=new Thread(f);
		even e=new even();
		Thread t2=new Thread(e);
		t2.start();
		t.start();
	}
}