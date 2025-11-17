// Create a file and write a sentence and display the number of Vowels and words that are present in file.......... 
import java.io.*;
class B
{
	public static void main(String[]arg) throws IOException
	{
		File f=new File("D:\\SK SAHIL\\Documents\\java\\Collections\\files2.1.java");
		f.createNewFile();
		FileWriter fw=new FileWriter(f);
		fw.write("Hello hi bye bye"+"\nHiii broo i am Ghost of the uchiha");
		fw.flush();
		fw.close();
		FileReader fr=new FileReader(f);
		BufferedReader br=new BufferedReader(fr);
		String s="";
		int c=0,v=0;
		while((s=br.readLine())!=null)
		{	
			c++;
			for(int i=0;i<s.length();i++)
			{
				char ch=s.charAt(i);
				if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'||ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
				{
					v++;
				}
			}
		}
		System.out.print(c+"   "+v);
		
	}
}