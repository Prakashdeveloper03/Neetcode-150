#include <algorithm>
#include <iostream>
#include <string>
#include <unordered_map>
#include <vector>
using namespace std;

class Solution {
 public:
  vector<vector<string>> groupAnagrams(vector<string>& strs) {
    unordered_map<string, vector<string>> ans;
    for (string& s : strs) {
      string key = s;
      sort(key.begin(), key.end());
      ans[key].push_back(s);
    }

    vector<vector<string>> result;
    for (auto& entry : ans) {
      result.push_back(entry.second);
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
    vector<string> strs(n);
    for (int i = 0; i < n; i++) {
      cin >> strs[i];
    }
    vector<vector<string>> result = Solution().groupAnagrams(strs);
    for (vector<string> x : result) {
      for (string y : x) {
        cout << y << " ";
      }
      cout << endl;
    }
    cout << endl;
  }
  return 0;
}