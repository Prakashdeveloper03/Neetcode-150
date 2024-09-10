#include <climits>
#include <iostream>
#include <vector>
using namespace std;

class Solution {
 public:
  int coinChange(vector<int>& coins, int amount) {
    vector<int> minCoins(amount + 1, INT_MAX - 1);
    minCoins[0] = 0;
    for (int c : coins) {
      for (int i = 1; i <= amount; i++) {
        if (c <= i) {
          minCoins[i] = min(minCoins[i], minCoins[i - c] + 1);
        }
      }
    }
    return minCoins[amount] == INT_MAX - 1 ? -1 : minCoins[amount];
  }
};

int main() {
  Solution obj;
  int tc;
  cin >> tc;
  while (tc-- > 0) {
    int n, amount;
    cin >> n;
    vector<int> coins(n);
    for (int i = 0; i < n; i++) {
      cin >> coins[i];
    }
    cin >> amount;
    cout << (Solution().coinChange(coins, amount)) << endl;
  }
  return 0;
}