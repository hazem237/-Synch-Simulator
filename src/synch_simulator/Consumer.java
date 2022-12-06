package synch_simulator;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Consumer extends Thread {

    /* This is a Consumer Class , Here the balls are taken out of the box */
    public int threadNo;

    public Consumer(int threadNo) {
        this.threadNo = threadNo;
    }

    /*Override Method , which the Consuming process is carried out*/
    @Override
    public void run() {
     
        Shared_Data.numberOfBalls--;
        System.out.println("Consumer Working" + ": " + Shared_Data.numberOfBalls);
         try {
            Thread.sleep(10);
        } catch (InterruptedException ex) {
            Logger.getLogger(Producer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

