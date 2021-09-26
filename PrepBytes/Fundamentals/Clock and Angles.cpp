#include <bits/stdc++.h>
using namespace std;

int main() {
  
  int t;
  cin >> t;
  
  while(t>0) {
    
    int h, m;
    cin >> h >> m;
    
    h = ((60*h)+m)/2;
    m = (m*6);
    
    cout << min(abs(m-h), 360-abs(m-h)) << endl;
    
    t--;
  }
  
  return 0;
}
