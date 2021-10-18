#include <vector>
#include <iostream>

using namespace std;

vector<int> solution(vector<int> arr) {
    vector<int> ans;
    int before;

    ans.push_back(arr[0]);
    before = arr[0];

    for (int i = 1; i < arr.size(); i++) {
        int num = arr[i];
        // 이전 수와 현재 수가 다르면 넣기
        if (before != num) {
            ans.push_back(num);
        }
        before = num;
    }

    return ans;
}

int main() {
    vector<int> arr = { 4,4,4,3,3 };
    vector<int> ans = solution(arr);

    for (int a : ans) {
        cout << a << endl;
    }

    return 0;
}