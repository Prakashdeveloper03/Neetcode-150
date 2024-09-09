#include <iostream>
#include <vector>
using namespace std;

class Solution {
 public:
  vector<int> productExceptSelf(vector<int>& nums) {
    int n = nums.size();
    vector<int> leftProduct(n, 1);
    vector<int> rightProduct(n, 1);
    vector<int> result(n);

    for (int i = 1; i < n; i++)
      leftProduct[i] = leftProduct[i - 1] * nums[i - 1];

    for (int i = n - 2; i >= 0; i--)
      rightProduct[i] = rightProduct[i + 1] * nums[i + 1];

    for (int i = 0; i < n; i++) result[i] = leftProduct[i] * rightProduct[i];

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
    for (int i = 0; i < n; i++) {
      cin >> nums[i];
    }
    vector<int> result = Solution().productExceptSelf(nums);
    for (int x : result) cout << x << " ";
    cout << endl;
  }
  return 0;
}