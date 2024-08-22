import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

class MedianFinder {
    PriorityQueue<Integer> minHeap = new PriorityQueue<>();
    PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

    public MedianFinder() {
    }

    public void addNum(int num) {
        maxHeap.offer(num);
        minHeap.offer(maxHeap.poll());
        if (minHeap.size() > maxHeap.size())
            maxHeap.offer(minHeap.poll());
    }

    public double findMedian() {
        if (maxHeap.size() > minHeap.size())
            return maxHeap.peek();
        return (minHeap.peek() + maxHeap.peek()) / 2.0d;
    }
}

public class Median {
    public static void main(String[] args) {
        MedianFinder medianFinder = new MedianFinder();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter numbers one by one. Type 'exit' to stop.");
        while (true) {
            System.out.print("Enter number: ");
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("exit")) {
                break;
            }
            try {
                int num = Integer.parseInt(input);
                medianFinder.addNum(num);
                System.out.println("Current median: " + medianFinder.findMedian());
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid integer.");
            }
        }
        scanner.close();
        System.out.println("Program terminated.");
    }
}
