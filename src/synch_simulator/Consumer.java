package synch_simulator;

public class Consumer extends Thread{ 
   /* This is a Consumer Class , Here the balls are taken out of the box */
      public int threadNo;
    public Consumer(int threadNo ) 
    {
        this.threadNo = threadNo;
    }
    /*Override Method , which the Consuming process is carried out*/
   @Override
   public void run() {
   Shared_Data.numberOfBalls --;
  }
}
