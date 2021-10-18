#include <string>
#include <vector>
#include <iostream>
#include <algorithm>

using namespace std;

vector<int> solution(vector<int> numbers) {
    vector<int> ans;

    for (int i = 0; i < numbers.size(); i++) {
        for (int j = i + 1; j < numbers.size(); j++) {
            ans.push_back(numbers[i] + numbers[j]);
        }
    }

    sort(ans.begin(), ans.end());
    ans.erase(unique(ans.begin(), ans.end()), ans.end());
    return ans;
}

int main() {
    vector<int> numbers = { 2,1,3,4,1 };
    vector<int> ans = solution(numbers);

    for (int a : ans) {
        cout << a << endl;
    }

    return 0;
}