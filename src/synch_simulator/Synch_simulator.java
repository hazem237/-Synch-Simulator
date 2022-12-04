package synch_simulator;

import java.util.Random;
import java.util.Random;

public class Synch_simulator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* Welcome to Synchronization System to solve the problem of bowling ball box*/
 /*Student Name : Hazem Azzam Haddad  // 201082 */

 /*Random number generator from 0 to  1000*/
 /*Executon  The operations ( consuming &&  producing ) without Any sync*/
        execution_without_sycn();

    }

    public static void execution_without_sycn() {

        System.out.println("Executing threads without sync");
        System.out.println("******************************");
        Random rand = new Random();
        int rand_time = rand.nextInt(1000);
        for (int i = 0; i < rand_time; i++) {
            Consumer c1 = new Consumer(i);
            Producer p1 = new Producer(i);
            /*Thread.start () =>  The run () function is executed in concurrently*/
            c1.start();
            p1.start();
        }

        System.out.println("Threads Execution is done , Here's some Infomation : ");
        System.out.println("Number of times: " + rand_time);
        System.out.println("The Expected Number of Balls: 10 ");
        System.out.println("The Expected Weight of The Box : 72.5 KG ");
        System.out.println("The Number of Balls after this Time: " + Shared_Data.numberOfBalls);
        System.out.println("The Weight of Box after this Time: " + Shared_Data.TheWeightOfBox());
        System.out.println("******************************");

    }

}
