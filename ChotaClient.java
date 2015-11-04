import java.io.IOException;
import java.net.Socket;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import javax.swing.JOptionPane;
public class ChotaClient
{
    public static void main(String gg[]) throws IOException
    {
        String serverAddress=JOptionPane.showInputDialog("Enter IP Address of server machine: ");
        Socket s=new Socket(serverAddress,9090);
        BufferedReader input=new BufferedReader(new InputStreamReader(s.getInputStream()));
        String answer=input.readLine();
        JOptionPane.showMessageDialog(null,answer);
        System.exit(0);
    }
}