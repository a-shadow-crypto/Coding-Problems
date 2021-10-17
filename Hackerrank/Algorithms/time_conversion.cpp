#include <bits/stdc++.h>

using namespace std;

/*
 * Complete the 'timeConversion' function below.
 *
 * The function is expected to return a STRING.
 * The function accepts STRING s as parameter.
 */

string timeConversion(string s) {
    
    if(s.at(8)=='A') {
        
        if(s.at(0)=='1' && s.at(1)=='2') {
            s.replace(0, 2, "00");
        }
    } else if(s.at(8)=='P') {
        char h[2];
        s.copy(h, 2, 0);
        int hh = atoi(h);
        if(hh<12) {
            hh += 12; 
            s.replace(0, 2, to_string(hh));
        }    
    }
    s.resize(8);
    s.shrink_to_fit();
    
    return s;
}

int main()
{
    ofstream fout(getenv("OUTPUT_PATH"));

    string s;
    getline(cin, s);

    string result = timeConversion(s);

    fout << result << "\n";

    fout.close();

    return 0;
}
