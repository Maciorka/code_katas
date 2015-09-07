package ProducerConsumer;

import java.util.List;
import java.util.ArrayList;

public class Main
{
   public static void main(String[] args)
   {
      ArrayList<Integer> taskQueue = new ArrayList<Integer>();
      int MAX_CAPACITY = 5;
      Thread tProducer = new Thread(new Producer(taskQueue, MAX_CAPACITY));
      Thread tConsumer = new Thread(new Consumer(taskQueue));
      tProducer.start();
      tConsumer.start();
   }
}
