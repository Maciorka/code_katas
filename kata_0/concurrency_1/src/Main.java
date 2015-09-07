package ProducerConsumer;

import java.awt.List;
import java.util.ArrayList;

public class Main
{
   public static void main(String[] args)
   {
      ArrayList<Integer> taskQueue = new ArrayList<Integer>();
      int MAX_CAPACITY = 5;
      Thread tProducer = new Thread(new Producer(taskQueue, MAX_CAPACITY), "Producer");
      Thread tConsumer = new Thread(new Consumer(taskQueue, "Consumer");
      tProducer.start();
      tConsumer.start();
   }
}