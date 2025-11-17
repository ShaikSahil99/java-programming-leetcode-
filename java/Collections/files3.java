// Create a file and write a sentence and display the number of Vowels and words that are present in file.......... 
import java.io.*;
class B
{
	public static void main(String[]arg) throws IOException
	{
		File f=new File("D:\\SK SAHIL\\Documents\\java\\Collections\\files2.1.java");
		f.createNewFile();
		FileWriter fw=new FileWriter(f);
		fw.write("1000");
		fw.flush();
		fw.close();
		FileReader fr=new FileReader(f);
		BufferedReader br=new BufferedReader(fr);
		String s="";
		int c=0,v=0;
		while((s=br.readLine())!=null)
		{	
			System.out.println(Integer.parseInt(s));	
		}
	}
}