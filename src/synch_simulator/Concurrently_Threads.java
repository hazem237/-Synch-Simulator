package synch_simulator;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Concurrently_Threads extends Thread {
    Random rand = new Random();
    int rand_time = rand.nextInt(16);
    
    String threadName;

    public Concurrently_Threads(String threadName) {
        super(threadName);
        this.threadName = threadName;
    }

    @Override
    public void run() {

         // Run by thread Producer
        if (this.getName().equals("Producer")) {
            System.out.println("Starting " + threadName);
            System.out.println(threadName + " got a permit.");
            // Now, accessing the shared resource.
            // other waiting threads will wait, until this
            // thread release the lock
            for (int i = 0; i < 5; i++) {
                Shared_Data.numberOfBalls++;
                System.out.println(threadName + ": " + Shared_Data.numberOfBalls);
                     
            }     
        } // run by thread Consumer
        else {
            System.out.println("Starting " + threadName);
            System.out.println(threadName + " got a permit.");
            // Now, accessing the shared resource.
            // other waiting threads will wait, until this
            // thread release the lock
            for (int i = 0; i < 5; i++) {
                Shared_Data.numberOfBalls--;
                System.out.println(threadName + ": " + Shared_Data.numberOfBalls);
                
            }
        }
    }
}
