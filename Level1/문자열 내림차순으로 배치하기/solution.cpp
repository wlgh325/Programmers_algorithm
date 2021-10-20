#include <string>
#include <vector>
#include <iostream>
#include <algorithm>

using namespace std;

string solution(string s) {
    sort(s.begin(), s.end(), greater<char>());

    return s;
}

int main() {
    string s = "Zbcdefg";
    cout << s << endl;
    cout << solution(s) << endl;

    return 0;
}