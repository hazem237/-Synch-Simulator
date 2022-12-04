package synch_simulator;

import java.util.Random;

public class Synch_simulator {

    public static void main(String[] args) {
        /* Welcome to Synchronization System to solve the problem of bowling ball box
        Student Name : Hazem Azzam Haddad  && 201082 */
        execution_without_sycn();

    }

    public static void execution_without_sycn() {
        /*startTime here to calculate method's time execution*/
        long startTime = System.nanoTime();
        System.out.println("Executing threads without sync");
        System.out.println("******************************");
        /*Random number generator from 0 to  1000*/
        Random rand = new Random();
        int rand_time = rand.nextInt(1000);
        /*Executon  The operations ( consuming &&  producing ) without Any sync*/
        for (int i = 0; i < rand_time; i++) {
            Consumer consumer = new Consumer(i);
            Producer producer = new Producer(i);
            /*Thread.start () =>  The run () function is executed in concurrently*/
            consumer.start();
            producer.start();
        }
        System.out.println("Threads Execution is done , Here's some Infomation : ");
        System.out.println("Number of times: " + rand_time);
        System.out.println("The Expected Number of Balls: 10 ");
        System.out.println("The Expected Weight of The Box : 72.5 KG ");
        System.out.println("The Number of Balls after this Time: " + Shared_Data.numberOfBalls);
        System.out.println("The Weight of Box after this Time: " + Shared_Data.TheWeightOfBox());
        /*calculate method's time execution*/
        long endTime = System.nanoTime();
        long duration = ((endTime - startTime) / 1000000);
        System.out.println("Time Execution : " + duration + " ms");
        System.out.println("******************************");

    }

}
