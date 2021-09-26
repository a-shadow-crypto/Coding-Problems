#include <bits/stdc++.h>
using namespace std;

int main() {
  int n, t, c;
  int count = 0;
  
  cin >> n;
  
  while(n>0) {
    
    cin >> t >> c;
    
    if((c-t)>=2) {
      count++;
    }
  
    n--;
  }
  cout << count;
  
  return 0;
}
