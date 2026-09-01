package day_10;

import java.util.PriorityQueue;

public class p8 {
	
	public static void main(String[] args) {

		PriorityQueue<Integer> pq = new PriorityQueue<>();

		pq.add(30);
		pq.add(10);
		pq.add(20);
		pq.add(5);
		System.out.println(pq);

		int n = pq.size();
		double median = 0;

   
		for (int i = 0; i < n / 2 - 1; i++) {
			pq.poll();
		}

		if (n % 2 == 0) {

			int first = pq.poll();
			int second = pq.poll();

			median = (first + second) / 2.0;

		} else {

			for (int i = 0; i < n / 2; i++) {
				pq.poll();
        }

			median = pq.peek();
    }

    System.out.println("Median: " + median);
}


}
