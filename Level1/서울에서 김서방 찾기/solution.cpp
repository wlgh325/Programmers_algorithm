#include <string>
#include <vector>
#include <iostream>

using namespace std;

string solution(vector<string> seoul) {
    return "김서방은 " + to_string(distance(seoul.begin(), find(seoul.begin(), seoul.end(), "Kim"))) + "에 있다";
}

int main() {
    vector<string> seoul = { "Jane", "Kim" };
    cout << solution(seoul) << endl;

    return 0;
}