import java.io.File;
import java.util.Scanner;
import java.io.FileWriter;
class FileOp
{
	public static void main(String args[])
	{
		try
		{
			FileWriter f=new FileWriter("test.txt");
			System.out.println("File Created");
			f.write("everything is fine \n");
			f.write("its alright");
			f.close();
			
			File ob=new File("test.txt");
			System.out.println("The Contents of the File are: ");
			Scanner sc=new Scanner(ob);
			while(sc.hasNextLine())
			{
				String data=sc.nextLine();
				System.out.println(data);
			}
			
		}
		catch(Exception e)
		{
                                System.out.println("error ");
		}
	}
}