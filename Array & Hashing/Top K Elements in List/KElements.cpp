#include <iostream>
#include <queue>
#include <unordered_map>
#include <vector>

using namespace std;

class Solution {
 public:
  vector<int> topKFrequent(const vector<int> &nums, int k) {
    unordered_map<int, int> frequencyMap;
    for (int num : nums) {
      frequencyMap[num]++;
    }

    auto cmp = [](const pair<int, int> &a, const pair<int, int> &b) {
      return a.second > b.second;
    };
    priority_queue<pair<int, int>, vector<pair<int, int>>, decltype(cmp)>
        minHeap(cmp);

    for (const auto &entry : frequencyMap) {
      minHeap.push(entry);
      if (minHeap.size() > k) {
        minHeap.pop();
      }
    }

    vector<int> result(k);
    int index = 0;
    while (!minHeap.empty()) {
      result[index++] = minHeap.top().first;
      minHeap.pop();
    }

    return result;
  }
};

int main() {
  Solution obj;
  int tc;
  cin >> tc;

  while (tc-- > 0) {
    int n;
    cin >> n;
    vector<int> nums(n);

    for (int i = 0; i < n; ++i) {
      cin >> nums[i];
    }

    int k;
    cin >> k;

    vector<int> result = obj.topKFrequent(nums, k);

    for (int x : result) {
      cout << x << " ";
    }
    cout << endl;
  }

  return 0;
}
