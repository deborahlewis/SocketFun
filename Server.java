/*
 *Learning about Sockets
 */
package socketfun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import javax.swing.JFrame;

public class Server {

    public static void main(String[] args) throws IOException {
        
        //create server control GUI
        JFrame window = new JFrame("server control");
        window.setBounds(100, 50, 100, 50);
        window.setVisible(true);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        System.out.println("Starting Up"); //testing
        //create new server socket
        ServerSocket ss = new ServerSocket(67);

        while (true) {
            //listener
            Socket socket = ss.accept();

            System.out.println("Got a Connection"); //testing
            //receive text
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            //create writer
            PrintWriter out = new PrintWriter(socket.getOutputStream());

            //read the text
            String line = in.readLine(); //read one line
            while (line != null) { //while the line isn't null
                System.out.println(line); //display line
                out.println("Thanks for your comments!"); //acknowlege receipt of message

                //flush stream
                out.flush();

                line = in.readLine(); //read next line
            }
        } //end while  
        
        //close socket
 //       ss.close();

    } //end main

} //end server class
