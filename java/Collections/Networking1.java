import java.net.*;
import java.io.*;
class Client
{
	public static void main(String[]arg) throws IOException
	{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		Socket s=new Socket("localhost",6666);
		DataOutputStream dout=new DataOutputStream(s.getOutputStream());
		DataInputStream din=new DataInputStream(s.getInputStream());
		dout.writeUTF("Hello");
		dout.flush();
		System.out.println("Server Says -> "+din.readUTF());
		dout.close();
	}
}