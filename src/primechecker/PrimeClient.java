package primechecker;

import java.io.*;
import java.net.*;

public class PrimeClient {
	
    public static void main(String[] args) throws IOException {
        
    	String hostName = "localhost";
        int port = 12345;

        try (Socket clientSocket = new Socket(hostName, port);
             BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
             PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
             BufferedReader stdIn = new BufferedReader(new InputStreamReader(System.in));) {

            System.out.print("Enter a number to check if it's prime: ");
            
            String input = stdIn.readLine();
            out.println(input);

            String response = in.readLine();
            System.out.println("The server responded: " + response);
            
        }
    }
}
