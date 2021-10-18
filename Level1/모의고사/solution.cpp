#include <vector>
#include <iostream>
#include <algorithm>

using namespace std;

vector<int> solution(vector<int> answers) {
    vector<int> ans;

    int size = answers.size();
    vector<int> ans1(size), ans2(size), ans3(size);
    int temp1[] = { 1,2,3,4,5 };
    int temp2[] = { 2,1,2,3,2,4,2,5 };
    int temp3[] = { 3,3,1,1,2,2,4,4,5,5 };

    int check1 = 0, check2 = 0, check3 = 0;
    for (int i = 0; i < size; i++) {
        int answer = answers[i];
        if (answer == temp1[i % 5]) check1++;
        if (answer == temp2[i % 8]) check2++;
        if (answer == temp3[i % 10]) check3++;
    }

    int big = max({ check1, check2, check3 });
    if (big == check1) {
        ans.push_back(1);
    }

    if (big == check2) {
        ans.push_back(2);
    }

    if (big == check3) {
        ans.push_back(3);
    }

    return ans;
}

int main() {
    vector<int> answers = { 1,2,3,4,5 };
    vector<int> ans = solution(answers);

    for (int a : ans) {
        cout << a << endl;
    }
    return 0;
}