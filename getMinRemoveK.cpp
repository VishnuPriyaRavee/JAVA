#include <iostream>
#include <string>
#include <vector>
using namespace std;

string getMinRemoveK(const string& num, int k)
{
	string result = num;
	if( k <= 0 )//trivial case; error handling
		return num;
	else if( num.size() > 0 && num.size() > k )
	{
		int i;
		for( i = 0; i < k; i++ )
		{
			int digit_index;
			for(digit_index = 0; digit_index < result.size()-1; digit_index++ )
			{
				if( result[digit_index] > result[digit_index+1] )
				{
					result.erase(result.begin() + digit_index);
					break;
				}
			}
			if( digit_index == result.size()-1 )
			{
				result.erase(result.end()-1);
			}
		}
	}
	return result;
}

int main()
{
	cout << getMinRemoveK("670124", 2) << endl;//prints 0124
	cout << getMinRemoveK("8361957", 3) << endl;//prints 1957
	cout << getMinRemoveK("13", 1) << endl;//prints 1
	cout << getMinRemoveK("9999", 2) << endl;// prints 99
	cout << getMinRemoveK("1000", 0) << endl;//prints 1000
	cout << getMinRemoveK("8561357", 3) << endl;//prints 1357
	cout << getMinRemoveK("12311", 1) << endl;//prints 1211
	return 0;
}
