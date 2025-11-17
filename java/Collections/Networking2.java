import java.net.*;
import java.io.*;
class Server
{
		public static void main(String[]arg) throws IOException
		{
			BufferedReader br= new BufferedReader(new InputStreamReader(System.in));   // can be used to take dynamic inputs
			ServerSocket ss=new ServerSocket(6666);
			Socket s=ss.accept();
			DataInputStream din=new DataInputStream(s.getInputStream());
			DataOutputStream dout=new DataOutputStream(s.getOutputStream());
			dout.writeUTF("Yoshiiiii");
			System.out.println("Client says -> "+din.readUTF());
			
			
			
		
		
		
		}
}