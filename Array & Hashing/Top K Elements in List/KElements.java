import java.util.Map;
import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.Scanner;

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
       Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : nums) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        PriorityQueue<Map.Entry<Integer, Integer>> minHeap = new PriorityQueue<>(
            (a, b) -> Integer.compare(a.getValue(),b.getValue())
        );

        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            minHeap.offer(entry);
            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }

        int[] result = new int[k];
        int index = 0;
        while (!minHeap.isEmpty()) {
            result[index++] = minHeap.poll().getKey();
        }
        return result;
    }
}

public class KElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Solution obj = new Solution();
        int tc = sc.nextInt();
        while(tc-- > 0) {
            int n = sc.nextInt();
            int nums[] = new int[n];
            for(int i = 0; i < n; i++) {
                nums[i] = sc.nextInt();
            }
            int k = sc.nextInt();
            int result[] = obj.topKFrequent(nums, k);
            for (int x : result) {
                System.out.printf("%d ", x);
            }
            System.out.println();
        }
        sc.close();
    }
}