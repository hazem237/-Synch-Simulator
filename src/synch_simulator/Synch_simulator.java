
package synch_simulator;
public class Synch_simulator {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Consumer c1 = new Consumer();
      Producer p1 = new Producer ();
      c1.run();
      p1.run();
      
      System.out.println("Finally : ");
      System.out.println(Shared_Data.numberOfBalls);
    }
    
}
