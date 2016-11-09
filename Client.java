/*
 *Learning about Sockets
 */
package socketfun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Client {

    public static void main(String[] args) throws IOException {
        
        System.out.println("Start Client"); //testing
        //create socket
        Socket socket = new Socket("localhost", 67);

        System.out.println("Open connection"); //testing
        //create writer
        PrintWriter out = new PrintWriter(socket.getOutputStream());
        //receive text
        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        
        //send text
        System.out.println("Send message"); //testing
        out.println("Hello Server");
        
        //flush stream
        out.flush();
        
        //read response from the server
        System.out.println("Receive response"); //testing
        String answer = in.readLine();
        System.out.println("Server says: " + answer);
        
        //close socket
        socket.close();

    } //end main    
} //end client
