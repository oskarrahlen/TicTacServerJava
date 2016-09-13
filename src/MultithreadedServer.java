import java.io.IOException;
import java.net.ServerSocket;

/**
 * Created by Oskar on 2016-09-13.
 */
public class MultithreadedServer {

    private int portNumber = 1212;
    private ServerSocket serverSocket = null;
    private boolean isStopped    = false;
    private Thread runningThread = null;

    public MultithreadedServer(int portNumber){
        this.portNumber = portNumber;
    }

    public MultithreadedServer(){

    }

    public void run() throws IOException {
        synchronized (this){
            this.runningThread = Thread.currentThread();
        }
        openServerSocket();
        while(!isStopped()){

        }
    }


    private synchronized boolean isStopped(){
        return this.isStopped();
    }

    // start the server by open the serversocket
    public void openServerSocket(){
        try{
            this.serverSocket = new ServerSocket(portNumber);
        }catch(IOException exception){
            System.out.println("Couldn't open the server socket with the error ");
        }
    }
}
