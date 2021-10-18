#include <string>
#include <vector>
#include <iostream>
#include <algorithm>

using namespace std;

vector<int> solution(vector<int> array, vector<vector<int>> commands) {
    vector<int> temp;
    vector<int> ans;

    for (vector<int> command : commands) {
        // 1, 자르기
        temp.assign(array.begin() + command[0] - 1, array.begin() + command[1]);

        // 2. 정렬하기
        sort(temp.begin(), temp.end());

        // 3. k번째 수
        ans.push_back(temp[command[2] - 1]);
    }

    return ans;
}

int main() {
    vector<int> array = { 1, 5, 2, 6, 3, 7, 4 };
    vector<vector<int>> commands = { {2, 5, 3 }, { 4, 4, 1 }, { 1, 7, 3 } };
    vector<int> ans = solution(array, commands);

    for (int a : ans) {
        cout << a << endl;
    }
    return 0;
}