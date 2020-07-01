#include <iostream>
#include <string>
#include <stack>
using namespace std;

bool solution(string s) {
	stack<char> st;

	for (int i = 0; i < s.length(); i++) {
		if (s.at(i) == '(') {
			st.push('(');
		}
		else {
			if (st.size() != 0) {
				st.pop();
			}
			else {
				return false;
			}
		}
	}

	if (st.size() != 0) {
		return false;
	}
	return true;
}

int main() {
	// IO 속도 향상
	ios_base::sync_with_stdio(false);
	cin.tie(NULL);

	string s = "(()(";

	cout << solution(s) << "\n";

	return 0;
}