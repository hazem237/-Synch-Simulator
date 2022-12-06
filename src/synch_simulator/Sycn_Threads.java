package synch_simulator;

import java.util.Random;
import java.util.concurrent.Semaphore;

class Sycn_Threads extends Thread {

    Random rand = new Random();
    int rand_time = rand.nextInt(16);

    Semaphore lock;
    String threadName;

    public Sycn_Threads(Semaphore sem, String threadName) {
        super(threadName);
        this.lock = sem;
        this.threadName = threadName;
    }

    @Override
    public void run() {

        // Run by thread Producer
        if (this.getName().equals("Producer")) {
            // System.out.println("Starting " + threadName);
            try {
                // First, get a permit.
                System.out.println(threadName + " is waiting for a permit.");
                // acquiring the lock
                lock.acquire();
                System.out.println(threadName + " got a permit.");
                // Now, accessing the shared resource.
                // other waiting threads will wait, until this 
                // thread release the lock

                Shared_Data.numberOfBalls++;
                System.out.println(threadName + " Working: " + Shared_Data.numberOfBalls);
               // Thread.sleep(10);

            } catch (InterruptedException exc) {
                System.out.println(exc);
            }
            // Release the permit.
            System.out.println(threadName + " releases the permit.");
            lock.release();
        } // run by thread Consumer
        else {
            //  System.out.println("Starting " + threadName);
            try {
                // First, get a permit.
                System.out.println(threadName + " is waiting for a permit.");
                // acquiring the lock
                lock.acquire();
                System.out.println(threadName + " got a permit.");
                // Now, accessing the shared resource.
                // other waiting threads will wait, until this 
                // thread release the lock

                Shared_Data.numberOfBalls--;
                System.out.println(threadName + " Working: " + Shared_Data.numberOfBalls);
               // Thread.sleep(10);

            } catch (InterruptedException exc) {
                System.out.println(exc);
            }
            // Release the permit.
            System.out.println(threadName + " releases the permit.");
            lock.release();
        }
    }
}
