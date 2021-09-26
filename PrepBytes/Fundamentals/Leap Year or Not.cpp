#include <bits/stdc++.h>
using namespace std;

int main() {
  
 int t;
 cin >> t;
 
 while(t>0) {
   
   int n;
   cin >> n;
   
   if(n%4==0) {
     
      if(n%100!=0 || n%400==0) 
     
       cout << "Yes\n";
      
      else
      
        cout << "No\n";
   } else {
     
     cout << "No\n";
   }
   
   t--;
 }
  
  return 0;
}
