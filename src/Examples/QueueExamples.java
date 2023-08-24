package Examples;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<String> priorQueue = new PriorityQueue<String> (); 
		Queue<String> linkedQueue = new LinkedList<String> (); 
		
		priorQueue.add("Task POST");
		priorQueue.add("Task GET");
		priorQueue.add("Task Delete");
		priorQueue.add("Task PUT");
		
		linkedQueue.add("Running");
		linkedQueue.add("Standing");
		linkedQueue.add("Hiking");
		linkedQueue.add("Crawling");
		
		System.out.print(priorQueue);
		System.out.print(linkedQueue);
	}

}
