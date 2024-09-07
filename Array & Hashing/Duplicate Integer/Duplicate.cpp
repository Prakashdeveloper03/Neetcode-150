#include <iostream>
#include <unordered_map>
#include <vector>
using namespace std;

class Solution {
 public:
  bool hasDuplicate(vector<int> &nums) {
    unordered_map<int, int> mp;
    for (int x : nums) {
      if (mp[x] == 1) {
        return true;
      } else {
        mp[x]++;
      }
    }
    return false;
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
    for (int i = 0; i < n; i++) {
      cin >> nums[i];
    }
    cout << (Solution().hasDuplicate(nums) ? "true" : "false") << endl;
  }
  return 0;
}