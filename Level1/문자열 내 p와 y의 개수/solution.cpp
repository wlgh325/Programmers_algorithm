#include <string>
#include <iostream>

using namespace std;

bool solution(string s) {
    int pNum = 0, yNum = 0;

    for (int i = 0; i < s.size(); i++) {
        s[i] = tolower(s[i]);
        if (s[i] == 'y') yNum++;
        if (s[i] == 'p') pNum++;
    }

    if (pNum == 0 && yNum == 0) return true;

    if (pNum == yNum) return true;
    else return false;
}

int main() {
    bool ans = solution("pPoooyY");

    cout << ans << endl;
    return 0;
}