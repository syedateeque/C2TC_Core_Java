package Collection_Framework;


import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class Buffer
{
	private Queue<Integer> clQueue = new ConcurrentLinkedQueue<Integer>();

	public void get()
	{
		System.out.println("Consumer received - " + clQueue.poll());
	}

	public void put(int i) 
	{
		clQueue.add(i);
		System.out.println("Producer Produced - " + i);
	}
}
