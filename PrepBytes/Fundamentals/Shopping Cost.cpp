#include <bits/stdc++.h>
using namespace std;

int main()
{
  int t;
  
  cin >> t;
  
  while(t>0) {
    int n;
    cin >> n;
    
    if(n==0) {
      cout << "2\n";
    }
    else {
      cout << (n+1) << endl;
    }
    t--;
  }
  
  return 0;
}
