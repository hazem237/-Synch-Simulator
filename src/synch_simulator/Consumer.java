package synch_simulator;

public class Consumer extends Thread{ 
    /* This is a Consumer Class , Here the balls are taken out of the box */
      public int treadNo;
    public Consumer(int treadNo ) 
    {
        this.treadNo = treadNo;
    }
    /*Override Method , which the Consuming process is carried out*/
     @Override
   public void run() {
     //   System.out.println ("Consumer !!");
 //  System.out.println(Shared_Data.numberOfBalls);
 //  System.out.println(Shared_Data.TheWeightOfBox());
   Shared_Data.numberOfBalls --;
  // System.out.println(Shared_Data.numberOfBalls);
  // System.out.println(Shared_Data.TheWeightOfBox());
   // System.out.println (" C Thread : "+ this.treadNo);
  }
}
