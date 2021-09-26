#include <bits/stdc++.h>

using namespace std;

int main() {
  
  int t;
  cin >> t;
  
  while(t>0) {
    
    long long n = 0;
    cin >> n;
    cout << n << " ";
    
    while(n>1) {
      
      if(n%2==0) {
        
        n = floor(sqrt(n));
        cout << n << " ";
      } else {
        
        n = floor(sqrt(n)*sqrt(n)*sqrt(n));
        cout << n << " ";
      }
    }
  
    cout << endl;
    t--;
  }
  
  return 0;
}
