#include <bits/stdc++.h>
using namespace std;

int sumOfDigits(int num) {
  int sum = 0;
  while(num>0) {
    
    sum += num%10;
    num /= 10;
  }
  return sum;
}

int main()
{

  int x;
  
  cin >> x;
  
  cout << sumOfDigits(x);
  
  return 0;
}
