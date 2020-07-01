#include <iostream>
#include <string>
#include <sstream>
using namespace std;

string solution(string s) {
	int min = 1e9;
	int max = -1e9;

	istringstream ss(s);
	string sb;
	
	while (getline(ss, sb, ' ')) {
		int a = stoi(sb);
		min = min > a ? a : min;
		max = max < a ? a : max;
	}

	string ans = to_string(min) + " " + to_string(max);
	return ans;
}

int main() {
	// IO 속도 향상
	ios_base::sync_with_stdio(false);
	cin.tie(NULL);

	string s = "1 2 3 4";
	string s2 = "-1 -2 -3 -4";

	cout << solution(s) << "\n";
	cout << solution(s2) << "\n";

	return 0;
}