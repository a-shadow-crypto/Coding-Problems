#include <bits/stdc++.h>
using namespace std;

int main()
{
  int x;
  int rev = 0;
  
  cin >> x;
  
  while(x>0) {
    
    rev = (rev*10) + (x%10);
    
    x = x/10;
  }
  
  cout << rev;
  
  return 0;
}
