import java.io.*;  
import java.net.*;  
public class MyClientProgram
{  
    public static void main(String[] args)
    {  
        try
        {      
            Socket s=new Socket("localhost",4444);  
            DataOutputStream dout=new DataOutputStream(s.getOutputStream());  
            dout.writeUTF("Hello Server");  
            dout.flush();  
            dout.close();  
            s.close();  
        }catch(Exception e){System.out.println(e);}  
    }  
}  
