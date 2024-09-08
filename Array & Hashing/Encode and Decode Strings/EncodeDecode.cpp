#include <iostream>
#include <string>
#include <vector>
using namespace std;

class Solution {
 public:
  string encode(const vector<string> &strs) {
    string encodedString;
    for (const string &str : strs) {
      encodedString += to_string(str.length()) + "#" + str;
    }
    return encodedString;
  }

  vector<string> decode(const string str) {
    vector<string> list;
    int i = 0;
    while (i < str.length()) {
      int j = i;
      while (str[j] != '#') j++;
      int length = stoi(str.substr(i, j - i));
      i = j + 1 + length;
      list.push_back(str.substr(j + 1, length));
    }
    return list;
  }
};

int main() {
  Solution obj;
  int tc;
  cin >> tc;
  while (tc-- > 0) {
    int n;
    cin >> n;
    cin.ignore();
    vector<string> strs(n);
    for (int i = 0; i < n; ++i) {
      getline(cin, strs[i]);
    }
    string encodedString = obj.encode(strs);
    vector<string> result = obj.decode(encodedString);
    for (const string &str : result) {
      cout << str << " ";
    }
    cout << endl;
  }
  return 0;
}