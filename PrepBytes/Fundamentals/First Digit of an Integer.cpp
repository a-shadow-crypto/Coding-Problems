#include <bits/stdc++.h>
using namespace std;

int main() {
  int t, n;
  
  cin >> t;
  while(t>0) {
    cin >> n;
    while(n>=10) {
      n = n/10;
    }
    cout << n <<"\n";
    t--;
  }
  
  return 0;
}
