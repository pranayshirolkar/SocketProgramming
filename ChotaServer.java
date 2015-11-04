import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
public class ChotaServer
{
    public static void main(String gg[]) throws IOException
    {
        ServerSocket listener=new ServerSocket(9090);
        int i=0;
        try
        {
            while(true)
            {
		System.out.println("Server ready.. listenening");
                Socket socket=listener.accept();
		System.out.println("Got a connection..");
                try
                {
                    PrintWriter out=new PrintWriter(socket.getOutputStream(),true);
                    out.println("God is Great" + i);
                    i++;
                }
                finally
                {
                    socket.close();
                }
            }
        }
        finally
        {
            listener.close();
        }
    }
}
