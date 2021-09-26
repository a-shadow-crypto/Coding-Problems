#include <bits/stdc++.h>
using namespace std;

int main()
{
  int ch;
  cin >> ch;
  
  if(ch = 'V') {
    int st=1;
    int sp=8;
    
    for(int i=1; i<=5; i++) {
      
      //cout << st << ", " << sp << ", " << st << endl;
      
      for(int j=1; j<=st; j++) {
        cout << j;
      }
      
      for(int j=1; j<=sp; j++) {
        cout << " ";
      }
      
      for(int j=1; j<=sp; j++) {
        cout << " ";
      }
      
      for(int j=st; j>=1; j--) {
        cout << j;
      }
      
      st++;
      sp-=2;
      
      cout << "\n";
      
    } 
  } else {
    
    cout << "Wrong Character Entered!" << endl;
  }
  
  
  return 0;
}
