package synch_simulator;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Producer extends Thread {

    /* This is a Producer Class , Here the balls are Added into the box */
    private int threadNo;

    public Producer(int threadNo) {
        this.threadNo = threadNo;
    }

    /*Override Method , which the Produing process is carried out*/
    @Override
    public void run() {
       
        Shared_Data.numberOfBalls++;
         System.out.println("Producer Working" + ": " + Shared_Data.numberOfBalls);
        try {
            Thread.sleep(10);
        } catch (InterruptedException ex) {
            Logger.getLogger(Producer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

