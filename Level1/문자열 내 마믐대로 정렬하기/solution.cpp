#include <string>
#include <vector>
#include <iostream>

using namespace std;

vector<string> solution(vector<string> strings, int n) {
    vector<string> ans;

    int size = strings.size();
    for (int i = size - 1; i > 0; i--) {
        for (int j = 0; j < i; j++) {
            if (strings[j][n] > strings[j + 1][n]) {
                swap(strings[j], strings[j + 1]);
            }
            else if (strings[j][n] == strings[j + 1][n]) {
                // »çÀü ¼ø
                if (strings[j] > strings[j + 1]) {
                    swap(strings[j], strings[j + 1]);
                }
            }

        }
    }

    ans.assign(strings.begin(), strings.end());
    return ans;
}

int main() {
    vector<string> strings = { "sun", "bed", "car" };
    int n = 1;
    vector<string> ans = solution(strings, n);

    for (string str : ans) {
        cout << str << endl;
    }
    return 0;
}