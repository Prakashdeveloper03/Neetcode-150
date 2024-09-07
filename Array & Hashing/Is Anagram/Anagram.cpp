#include <iostream>
#include <string>
#include <unordered_map>
using namespace std;

class Solution {
 public:
  bool isAnagram(const string &s, const string &t) {
    if (s.length() != t.length()) return false;
    unordered_map<char, int> countMap;
    for (char c : s) {
      countMap[c]++;
    }
    for (char c : t) {
      if (countMap.find(c) == countMap.end() || countMap[c] == 0) return false;
      countMap[c]--;
    }
    return true;
  }
};

int main() {
  Solution obj;
  int tc;
  cin >> tc;
  cin.ignore();
  while (tc-- > 0) {
    string s, t;
    getline(cin, s);
    getline(cin, t);
    cout << (obj.isAnagram(s, t) ? "true" : "false") << endl;
  }
  return 0;
}