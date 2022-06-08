import java.util.Scanner;

class UsernameException extends Exception {
 
 public UsernameException(String msg) {
  super(msg);
 }
}

public class positiveinput {

 public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
 Double integer,avg,sum=0.0;
int no,n;

 
  System.out.print("Enter the no of integers ");
  no = s.nextInt();
  n=no;

  for(int i=1;i<=no;i++){  
  System.out.print("Enter the integer "+i+":");
  integer = s.nextDouble();
  sum=sum+integer;
  


 try {
   if(integer < 0)
    throw new UsernameException("No negative inputs");
  
   }

  catch (UsernameException u) {
   u.printStackTrace();
  }
 if(integer < 0)
{
 sum=sum-integer;
 n=n-1;
}

 }

 avg=sum/n;
 System.out.println("sum is "+sum);
 System.out.println("count is "+n);
  System.out.println("average is "+avg); 
 }
}