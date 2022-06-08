import java.io.File;
import java.util.Scanner;
import java.util.String;
import java.io.FileWriter;
class FileOp
{
	public static void main(String args[])
	{
		try
		{
			FileWriter f=new FileWriter("test.txt");
			System.out.println("File Created");
                                                Scanner s=new Scanner();
                                               
                                                System.out.println("enter the no of integers");
                                                  int no=s.nextInt();
                                                   System.out.println("enter the  integers");
                                                   for(int i=1;i<=no;i++)
                                                   {
                                               
                                                 int integers=s.nextInt();
                                                      
			f.write(integers);
			}
			f.close();
			
			File ob=new File("test.txt");
			System.out.println("The Contents of the File are: ");
			Scanner sc=new Scanner(ob);
			while(sc.hasNextLine())
			{
				int data=sc.nextLine();
                                                           if(data % 2 == 0)
                                                           {  
				System.out.println(String.value(data));
                                                           }
			}
			
		}
		catch(Exception e)
		{
                                System.out.println("error ");
		}
	}
}