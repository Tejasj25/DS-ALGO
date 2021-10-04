package queue;

import java.util.*;

public class MainClass {

	public static void main(String[] args) {
		
        MyQueue<Integer> mq = new MyQueue<>();
		
		mq.enqueue(12);
		mq.enqueue(24);
		mq.enqueue(36);
		mq.enqueue(48);
		
		System.out.println(mq.dequeue());
		System.out.println(mq.dequeue());
		System.out.println(mq.dequeue());
		System.out.println(mq.dequeue());
		System.out.println(mq.dequeue());
		
		
		
//		q.add(12);
//		q.add(24);
//		q.add(36);
//		
//		q.offer(12);
//		q.offer(36);
//		System.out.println(q);
//		System.out.println(q.remove());
//		System.out.println(q.remove());
		
//		System.out.println(q.remove());
//		System.out.println(q.poll());
		
	}

}
