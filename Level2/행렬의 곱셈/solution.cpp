#include <iostream>
#include <vector>
using namespace std;

vector<vector<int>> solution(vector<vector<int>> arr1, vector<vector<int>> arr2) {
	vector<vector<int>> ans(arr1.size(), vector<int>(arr2[0].size(), 0));	//2차원 배열 선언, 0으로 초기화

	// arr1의 i행, arr2의 j열을 곱한다
	// 인덱스 이동은 k
	for (int i = 0; i < arr1.size(); i++) {
		for (int j = 0; j < arr2[0].size(); j++) {
			int sum = 0;
			for (int k = 0; k < arr2.size(); k++) {
				sum += arr1[i][k] * arr2[k][j];
			}
			ans[i][j] = sum;
		}
	}
	return ans;
}

int main() {
	// IO 속도 향상
	ios_base::sync_with_stdio(false);
	cin.tie(NULL);

	vector<vector<int>> arr1{ { 1,4 }, { 3,2 }, { 4,1 } };
	vector<vector<int>> arr2{ {3,3}, {3,3} };

	vector<vector<int>> ans = solution(arr1, arr2);
	// debug
	for (vector<int> a : ans) {
		for (int b : a) {
			cout << b << " ";
		}
		cout << "\n";
	}
	return 0;
}