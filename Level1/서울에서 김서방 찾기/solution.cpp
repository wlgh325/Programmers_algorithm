#include <string>
#include <vector>
#include <iostream>

using namespace std;

string solution(vector<string> seoul) {
    return "�輭���� " + to_string(distance(seoul.begin(), find(seoul.begin(), seoul.end(), "Kim"))) + "�� �ִ�";
}

int main() {
    vector<string> seoul = { "Jane", "Kim" };
    cout << solution(seoul) << endl;

    return 0;
}