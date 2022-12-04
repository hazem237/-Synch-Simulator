
package synch_simulator;
public class Synch_simulator {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
     for (int i = 0 ; i<32 ; i++)
     {
           Consumer c1 = new Consumer(i);
           Producer p1 = new Producer (i);    
            c1.start();
            p1.start();  
     }

      
      System.out.println("Finally : ");
      System.out.println(Shared_Data.numberOfBalls);
System.out.println(Shared_Data.TheWeightOfBox());      
      
    }
    
}
