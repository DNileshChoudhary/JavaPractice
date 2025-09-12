import java.io.FileWriter;
import java.io.IOException;
import java.io.File;
import java.io.BufferedReader;
import java.io.FileReader;

class FilePractice
{
	public static void main(String args[])
	{
		try
		{
			File folder = new File("MyFolder");
			folder.mkdir();
			File file = new File(folder,"MyFile.txt");
			
			FileWriter myW = new FileWriter(file,true);
			myW.write("\nHello Nilesh😊!\nHow is your day going with Java?");
			myW.close();
			System.out.println("Data appended successfully...");
			System.out.println("\nThe Content of File is : \n-----------------------------");
			FileReader myR = new FileReader(file);
			BufferedReader read = new BufferedReader(myR);
			String line ;

			while((line=read.readLine())!=null)
			{
				System.out.println(line);
			}
			read.close();
			file.delete();
			folder.delete();
		}
		catch(IOException e)
		{
			System.out.println("An Error Happened !!");
			e.printStackTrace();
		}
	}
}