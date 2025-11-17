import java.util.*;

import java.io.*;
class A
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
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String s=s=br.readLine();	
		System.out.println(Integer.parseInt(s));			
	}
}