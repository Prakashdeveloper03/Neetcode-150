import java.util.Collections;
import java.util.PriorityQueue;

class MedianFinder {
  PriorityQueue<Integer> maxHeap;
  PriorityQueue<Integer> minHeap;

  public MedianFinder() {
    maxHeap = new PriorityQueue<Integer>(Collections.reverseOrder());
    minHeap = new PriorityQueue<Integer>();
  }

  public void addNum(int num) {
    if (maxHeap.isEmpty() || maxHeap.peek() >= num) {
      maxHeap.add(num);
    } else {
      minHeap.add(num);
    }

    if (maxHeap.size() > minHeap.size() + 1) {
      minHeap.add(maxHeap.remove());
    } else if (maxHeap.size() < minHeap.size()) {
      maxHeap.add(minHeap.remove());
    }
  }

  public double findMedian() {
    if (maxHeap.size() > minHeap.size()) {
      return (double) maxHeap.peek();
    } else {
      return ((double) maxHeap.peek() + (double) minHeap.peek()) / 2.0;
    }
  }
}
