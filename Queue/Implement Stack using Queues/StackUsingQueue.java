import java.util.LinkedList;
import java.util.Queue;

class MyStack {
  private Queue<Integer> s1;
  private Queue<Integer> s2;

  public MyStack() {
    s1 = new LinkedList<>();
    s2 = new LinkedList<>();
  }

  public void push(int x) {
    s2.offer(x);
    while (!s1.isEmpty()) {
      s2.offer(s1.poll());
    }
    Queue<Integer> temp = s1;
    s1 = s2;
    s2 = temp;
  }

  public int pop() {
    if (s1.isEmpty()) return -1;
    return s1.poll();
  }

  public int top() {
    if (s1.isEmpty()) return -1;
    return s1.peek();
  }

  public boolean empty() {
    return s1.isEmpty();
  }
}
