package ro.mta.ip.lab3JAVA.scthreads;

// Java implementation of  Server side
// It contains two classes : Server and ClientHandler
// Save file as Server.java

// Java implementation of  Server side
// It contains two classes : Server and ClientHandler
// Save file as Server.java

import java.io.*;
import java.text.*;
import java.util.*;
import java.net.*;

// Server class
public class Server
{
    public static void main(String[] args) throws IOException
    {
        // server is listening on port 5056
        ServerSocket ss = new ServerSocket(9876);

        // running infinite loop for getting
        // client request
        while (true)
        {
            Socket s = null;

            try
            {
                // socket object to receive incoming client requests
                s = ss.accept();

                System.out.println("A new client is connected : " + s);



                System.out.println("Assigning new thread for this client");

                // create a new thread object
                Thread t = new ClientHandler(s);

                // Invoking the start() method
                t.start();

            }
            catch (Exception e){
                s.close();
                e.printStackTrace();
            }
        }
    }
}

// ClientHandler class
class ClientHandler extends Thread
{


    final Socket s;


    // Constructor
    public ClientHandler(Socket s)
    {
        this.s = s;

    }

    @Override
    public void run()
    {
        ArrayList<Human> list = new ArrayList<>();

        try {

            PrintWriter out =
                    new PrintWriter(s.getOutputStream(), true);
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(s.getInputStream()));
            BufferedReader stdIn = new BufferedReader(
                    new InputStreamReader(System.in));
            out.println("Server: Conexiune realizata");

            String inputLine,outputLine;
            while ((inputLine = in.readLine()) != null) {
                String[] arrOfStr = inputLine.split(" ");
                String titlu = arrOfStr[0];
                if(titlu.equals("Student")) {
                    list.add(new Student(inputLine));
                }
                else {
                    list.add(new Profesor(inputLine));
                }

                outputLine = stdIn.readLine();
                out.println(outputLine);

                if (outputLine.equals("Bye.")) {
                    System.out.println("Client " + this.s + " sends exit...");
                    System.out.println("Closing this connection.");
                    this.s.close();
                    System.out.println("Connection closed");

                    Collections.sort(list);

                    for(int i=0;i<list.size(); i++)
                    {
                        System.out.println(list.get(i).toString());
                    }
                    break;

                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}