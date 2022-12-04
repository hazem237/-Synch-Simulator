package synch_simulator;

public class Producer extends Thread {
     /* This is a Producer Class , Here the balls are Added into the box */
    
    /*Override Method , which the Produing process is carried out*/
   @Override
  public void run() {
         System.out.println ("Producer !!");
   System.out.println(Shared_Data.numberOfBalls);
   System.out.println(Shared_Data.TheWeightOfBox());
   Shared_Data.numberOfBalls ++;
   System.out.println(Shared_Data.numberOfBalls);
   System.out.println(Shared_Data.TheWeightOfBox());
  }
}
