import java.util.Scanner;
class fibo implements Runnable {
int f=0,s=1,r=0,i=0,n;
Scanner sc=new Scanner(System.in);
public void run()
{
System.out.println("Enter the limit for fibanocci series:");
n=sc.nextInt();
System.out.println("Fibonacci series:");
while(i<n)
{
System.out.print(r+" ");
f=s;
s=r;
r=f+s;
i++;
}
}
}


class even implements Runnable {
	int n,i;
	Scanner sc=new Scanner(System.in);
public void run()
{
System.out.println("Enter the limit for even number:");
n=sc.nextInt();
System.out.println("Even numbers:");
for(i=2;i<=n;i++)
{
if(i%2==0)
	System.out.print(i+" ");
}
}
}

class fibo_even {
	public static void main(String args[])
	{
fibo f=new fibo();
Thread t1=new Thread(f);
even e=new even();
Thread t2=new Thread(e);
t1.start();
t2.start();
	}
}