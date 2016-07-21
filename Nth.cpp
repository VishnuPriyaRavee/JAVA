
#include <iostream>
using namespace std;
 

void find(int n)
{
   
    string arr[n+1];
    arr[0] = ""; // arr[0] stores the empty string (String with 0 digits)
 
  
    int size = 1, m = 1;
 
   
    while (size <= n)
    {
   
        
        for (int i=0; i<m && (size+i)<=n; i++)
            arr[size + i] = "3" +  arr[size - m + i];
 
        
        for (int i=0; i<m && (size + m + i)<=n; i++)
            arr[size + m + i] = "4" +  arr[size - m + i];
 
       
        m = m<<1; // Or m = m*2;
 
        // Update size
        size = size + m;
    }
    cout << arr[n] << endl;
}
 class Nth
{

int main()
{
    for (int i = 1; i < 16; i++)
        find(i);
    return 0;
}}
