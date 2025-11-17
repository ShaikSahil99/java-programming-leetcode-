import java.util.*;
import java.io.*;
class A
{
	public static void main(String[]arg) throws IOException
	{
		File f=new File("D:\\SK SAHIL\\Documents\\java\\Collections\\files1.1.java");
		f.createNewFile();
		FileWriter fw=new FileWriter(f);            // or can send path String as paramenter ("D:\\SK SAHIL\\Documents\\java\\Collections\\filename.filetype")
		fw.write("Hiii brooo");
		fw.flush();    // used to send all data without any memory leakages
		fw.close();	// after closing you can't write again
		FileReader fr=new FileReader(f);
		BufferedReader br=new BufferedReader(fr);
		String s="";
//		while((s=br.readLine())!=null)
//		{
//			System.out.print(s);
//		}
//		br.close();
		     // or
		while(true)
		{		
			s=br.readLine();
			if(s==null)
			{
				break;
			}
			System.out.print(s);
		}
		     // or
		Scanner sc=new Scanner(f);
		while(sc.hasNextLine())
		{
			System.out.print(sc.nextLine());
		}
		sc.close();
	}
}