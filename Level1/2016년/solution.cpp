#include <string>
#include <vector>
#include <iostream>

using namespace std;

string solution(int a, int b) {
    string ans = "";
    vector<int> months = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
    vector<string> day = { "FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU" };
    // 2016/01/01 ±Ý
    int temp = 0;
    for (int i = 0; i < a - 1; i++) {
        temp += months[i];
    }

    return day[(temp + b - 1) % 7];
}

int main() {
    int a = 5;
    int b = 24;
    string ans = solution(a, b);
    cout << ans << endl;

    return 0;
}