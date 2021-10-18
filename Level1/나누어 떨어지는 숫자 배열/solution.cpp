#include <vector>
#include <iostream>
#include <algorithm>

using namespace std;

vector<int> solution(vector<int> arr, int divisor) {
    vector<int> ans;

    for (int num : arr) {
        if (num % divisor == 0) {
            ans.push_back(num);
        }
    }

    if (ans.size() == 0) {
        ans.push_back(-1);
    }
    else {
        sort(ans.begin(), ans.end());
    }

    return ans;
}

int main() {
    vector<int> arr = { 5, 9, 7, 10 };
    int divisor = 5;
    vector<int> ans = solution(arr, divisor);

    for (int a : ans) {
        cout << a << endl;
    }

    return 0;
}