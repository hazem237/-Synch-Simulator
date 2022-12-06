package synch_simulator;

import java.util.Random;
import java.util.concurrent.Semaphore;

public class Synch_simulator {

    public static void main(String[] args) throws InterruptedException {
        /* Welcome to Synchronization System to solve the problem of bowling ball box
        Student Name : Hazem Azzam Haddad  && 201082 */
        execution_with_sycn();
        
    }

        public static void execution_without_sycn()  {
        /*startTime here to calculate method's time execution*/
        
        System.out.println("Executing threads without sync");
        System.out.println("******************************");
        /*Executon  The operations ( consuming &&  producing ) without Any sync*/
           for (int i = 0; i < Shared_Data.rand_time; i++) {
            Consumer consumer = new Consumer(i);
            Producer producer = new Producer(i);
            /*Thread.start () =>  The run () function is executed in concurrently*/
            consumer.start();
            producer.start();
        }
      
        System.out.println("Threads Execution is done , Here's some Infomation : ");
        System.out.println("Number of times Running Concurrently_Threads: " + Shared_Data.rand_time);
        System.out.println("The Expected Number of Balls: 10 ");
        System.out.println("The Expected Weight of The Box : 72.5 KG ");
        System.out.println("The Number of Balls after this Time: " + Shared_Data.numberOfBalls);
        System.out.println("The Weight of Box after this Time: " + Shared_Data.TheWeightOfBox());
        System.out.println("******************************");
       
    }

    public static void execution_with_sycn() throws InterruptedException {
        /*Welcom To My Sycn Method , You will have Fun :) */
         System.out.println("Executing threads with sync");
        System.out.println("******************************");

 /*Shared Lock*/
        Semaphore sem = new Semaphore(1);
        for(int i =0 ; i< Shared_Data.rand_time ;i++)
        {
        /*Create a Producer + Consumer */
        Sycn_Threads Producer = new Sycn_Threads(sem, "Producer");
        Sycn_Threads Consumer = new Sycn_Threads(sem, "Consumer");

        // stating threads Producer and Consumer 
        Producer.start();
        Consumer.start();

        // waiting for threads Producer and Consumer  to Die , Then Show The result
        Producer.join();
        Consumer.join();
        }

        // Number Of balls here will always remain 10 balls after
        // both threads will complete their execution
        System.out.println("******************************");
        System.out.println("Threads Execution is done , Here's some Infomation : ");
        System.out.println("Number of times Running Sycn Threads:  "+ Shared_Data.rand_time);
        System.out.println("The Expected Number of Balls: 10 ");
        System.out.println("The Expected Weight of The Box : 72.5 KG ");
        System.out.println("The Number of Balls after this Time: " + Shared_Data.numberOfBalls);
        System.out.println("The Weight of Box after this Time: " + Shared_Data.TheWeightOfBox());
        System.out.println("******************************");

    }
    public static void execution_without_sycn2() throws InterruptedException {
        /*Welcom To My Concurrently Method , You will have Fun :) */

        System.out.println("Executing threads without sync");
        System.out.println("******************************");
        /*Create a Producer + Consumer */
        Concurrently_Threads Producer = new Concurrently_Threads("Producer");
        Concurrently_Threads Consumer = new Concurrently_Threads("Consumer");

        // stating threads Producer and Consumer 
        Producer.start();
        Consumer.start();


        // Number Of balls here will always remain 10 balls after
        // both threads will complete their execution
        System.out.println("******************************");
        System.out.println("Threads Execution is done , Here's some Infomation : ");
        System.out.println("Number of times Running Concurrently_Threads: " + Shared_Data.rand_time);
        System.out.println("The Expected Number of Balls: 10 ");
        System.out.println("The Expected Weight of The Box : 72.5 KG ");
        System.out.println("The Number of Balls after this Time: " + Shared_Data.numberOfBalls);
        System.out.println("The Weight of Box after this Time: " + Shared_Data.TheWeightOfBox());
        System.out.println("******************************");

    }
    

}
