import java.io.*;
import java.text.*;
import java.util.*;
import static  ase.Constants.*; 
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
		if(args[0].equals(ShowAll)) 
		{
			System.out.println(StartDialog);			
			try 
			{
			BufferedReader fileStream = new BufferedReader(
					new InputStreamReader(
							new FileInputStream(DataFile))); 
			String reader = fileStream.readLine();
			String word[] = reader.split(",");			
			for(String words : word) 
			{ 
		System.out.println(word); 
			}
			} 
			catch (Exception e)
			{} 
			System.out.println(EndDialog);
		}
		else if(args[0].equals(ShowRandow)) 
		{
			System.out.println(StartDialog);			
			try 
			{
			BufferedReader fileStream = new BufferedReader(
					new InputStreamReader(
							new FileInputStream(DataFile))); 
			String reader = fileStream.readLine();
		
			String word[] = reader.split(",");	
			Random rand = new Random();
				int randomindex = read.nextInt(word.length);
					System.out.println(word[words]);
			} 
			catch (Exception e)
			{} 
			System.out.println(EndDialog);			
		}
		else if(args[0].contains(addWord))
		{
			System.out.println(StartDialog);			
			try 
			{
			BufferedWriter fileStream = new BufferedWriter(
					new FileWriter(DataFile , true));
			String  = args[0].substring(1);
	        Date d = new Date();
	        String df = "DateFormat;
	        DateFormat dateFormat = new SimpleDateFormat(df);
	        String fd= dateFormat.format(d);
			fileStream.write(", "+t+"\nList last updated on "+fd);
			fileStream.close();
			} 
			catch (Exception e)
			{}
							
			System.out.println(EndDialog);	
		}
		else if(args[0].contains(query)) 
		{
			System.out.println(StartDialog);			
			try 
			{
			BufferedReader fileStream = new BufferedReader(
					new InputStreamReader(
							new FileInputStream(DataFile))); 
			String reader = fileStream.readLine();
			String word[] = r.split(",");	
			
			String t = args[0].substring(1);
			for(int idx = 0; idx<i.length ; idx++) 
			{
				if(i[idx].equals(t)) 
				{
					System.out.println(Success );
						break;
				}
			}
			}
			catch (Exception e)
			{} 
			System.out.println(EndDialog );				
		}
		else if(args[0].contains(count)) 
		{
			System.out.println(StartDialog);			
			try 
			{
			BufferedReader fileStream = new BufferedReader(
					new InputStreamReader(
							new FileInputStream(DataFile ))); 
			String D = fileStream.readLine();
			String words[] = contents.split(","); 
			char a[] = D.toCharArray();			
System.out.println(words.length +" word(s) found Character" + a.length); 
				
			
			System.out.println(count +" word(s) found " + a.length);
			} else {  
  			System.out.println(InvalidMsg);  
  			return;
			}

			else {  
  			System.out.println(InvalidMsg);  
  			return;  
			}
			System.out.println(EndDialog);				
		}
	}
}