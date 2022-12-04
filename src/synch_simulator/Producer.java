package synch_simulator;

public class Producer extends Thread {
     /* This is a Producer Class , Here the balls are Added into the box */
    private int threadNo;
    public Producer(int threadNo ) 
    {
        this.threadNo = threadNo;
    }
    /*Override Method , which the Produing process is carried out*/
   @Override
  public void run() {
   Shared_Data.numberOfBalls ++;
  }
}
