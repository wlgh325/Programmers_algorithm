#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

int dp[4][1000000][4];

int solution(vector<vector<int> > land) {
	int len = land.size();

	// initialize
	for (int i = 0; i < 4; i++) {
		dp[0][0][i] = land[0][i];
		dp[1][0][i] = land[0][i];
		dp[2][0][i] = land[0][i];
		dp[3][0][i] = land[0][i];
	}

	for (int i = 1; i < len; i++) {
		for (int j = 0; j < 4; j++) {
			for (int k = 0; k < 4; k++) {
				for (int q = 0; q < 4; q++) {
					if (k != j && q != j) {
						dp[j][i][k] = max(dp[j][i][k] ,dp[q][i-1][j] + land[i][k]);	// 이전에 j에서 i,k로 온 경우 (i-2, q) -> (i-1, j) -> (i, k)
					}
				}
			}
		}
	}

	// 마지막 행에서 최댓값 찾아보기
	int maxx = 0;
	for (int i = 0; i < 4; i++) {
		for (int j = 0; j < 4; j++) {
			maxx = maxx < dp[i][len - 1][j] ? dp[i][len - 1][j] : maxx;
		}
	}
	return maxx;
}

int main() {
	// IO 속도 향상
	ios_base::sync_with_stdio(false);
	cin.tie(NULL);

	vector<vector<int>> land{ {1,2,3,5},
							{5,6,7,8},
							{4,3,2,1} };

	cout << solution(land) << "\n";

	return 0;
}