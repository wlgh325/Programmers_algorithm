#include <string>
#include <vector>
#include <iostream>

using namespace std;

long long solution(int a, int b) {
    long long ans = 0;

    if (a == b) return a;

    int big = max(a, b);
    int small = min(a, b);

    for (; small <= big; small++) {
        ans += small;
    }
    return ans;
}

int main() {
    cout << solution(3, 5) << endl;
    cout << solution(3, 3) << endl;
    cout << solution(5, 3) << endl;
    return 0;
}