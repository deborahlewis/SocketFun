/*
 * Deborah Lewis
 * Basic Java Program to learn about Web Sockets
 * Demo from https://www.youtube.com/watch?v=6UfL9YW9z_Y&list=PLfkYWLGFGjwHkG-xTX_5gubwIf6S-wFRJ&index=2 
 */
package socketfun;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;


public class Server {


    public static void main(String[] args) throws IOException {
        
        ServerSocket ss = new ServerSocket(67); //create new server socket
        Socket socket = ss.accept(); //listens to server request
        
        
    }
    
}
