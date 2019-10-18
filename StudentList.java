import java.io.*;
import java.text.*;
import java.util.*;
public class StudentList 
{
	public static void main(String[] args) 
	{


/* Check arguments */
            if (args == null || args.Length != 1)
            {
                Console.WriteLine("not text");
                return; // Exit early.
			}
		if(args[0].equals("a")) 
		{
			System.out.println("Loading data ...");			
			try 
			{
			BufferedReader fileStream = new BufferedReader(
					new InputStreamReader(
							new FileInputStream("students.txt"))); 
			String reader = fileStream.readLine();
			String word[] = reader.split(",");			
			for(String words : word) 
			{ 
		System.out.println(word); 
			}
			} 
			catch (Exception e)
			{} 
			System.out.println("Data Loaded.");
		}
		else if(args[0].equals("r")) 
		{
			System.out.println("Loading data ...");			
			try 
			{
			BufferedReader fileStream = new BufferedReader(
					new InputStreamReader(
							new FileInputStream("students.txt"))); 
			String reader = fileStream.readLine();
		
			String word[] = reader.split(",");	
			Random rand = new Random();
				int randomindex = read.nextInt(word.length);
					System.out.println(word[words]);
			} 
			catch (Exception e)
			{} 
			System.out.println("Data Loaded.");			
		}
		else if(args[0].contains("+"))
		{
			System.out.println("Loading data ...");			
			try 
			{
			BufferedWriter fileStream = new BufferedWriter(
					new FileWriter("students.txt", true));
			String  = args[0].substring(1);
	        Date d = new Date();
	        String df = "dd/mm/yyyy-hh:mm:ss a";
	        DateFormat dateFormat = new SimpleDateFormat(df);
	        String fd= dateFormat.format(d);
			fileStream.write(", "+t+"\nList last updated on "+fd);
			fileStream.close();
			} 
			catch (Exception e)
			{}
							
			System.out.println("Data Loaded.");	
		}
		else if(args[0].contains("?")) 
		{
			System.out.println("Loading data ...");			
			try 
			{
			BufferedReader fileStream = new BufferedReader(
					new InputStreamReader(
							new FileInputStream("students.txt"))); 
			String reader = fileStream.readLine();
			String word[] = r.split(",");	
			boolean done = false;
			String t = args[0].substring(1);
			for(int idx = 0; idx<i.length && !done; idx++) 
			{
				if(i[idx].equals(t)) 
				{
					System.out.println("We found it!");
						done=true;
				}
			}
			}
			catch (Exception e)
			{} 
			System.out.println("Data Loaded.");				
		}
		else if(args[0].contains("c")) 
		{
			System.out.println("Loading data ...");			
			try 
			{
			BufferedReader fileStream = new BufferedReader(
					new InputStreamReader(
							new FileInputStream("students.txt"))); 
			String D = fileStream.readLine();
			char a[] = D.toCharArray();			
			boolean in_word = false;
			int count=0;
			for(char c:a) 
			{
				if(c ==' ') 
				{
					if (!in_word) {	count++; in_word =true;
					}
					else 
					{ 
				in_word=false;
				}			
				}
			}
			System.out.println(count +" word(s) found " + a.length);
			} 
			catch (Exception e)
			{} 
			System.out.println("Data Loaded.");				
		}
	}
}