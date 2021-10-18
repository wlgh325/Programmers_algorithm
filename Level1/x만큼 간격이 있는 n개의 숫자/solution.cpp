#include <string>
#include <vector>
#include <iostream>

using namespace std;

vector<long long> solution(int x, int n) {
    vector<long long> ans;

    for (int i = 1; i <= n; i++) {
        ans.push_back(x * i);
    }
    return ans;
}

int main() {
    int x = 2;
    int n = 5;
    vector<long long> ans = solution(x, n);

    for (long long a : ans) {
        cout << a << endl;
    }

    return 0;
}