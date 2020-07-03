#include <iostream>
using namespace std;

int n;

int countOne(int n) {
	int cnt = 0;

	while (1) {
		if (n % 2 != 0)
			cnt++;
		n /= 2;
		if (n == 2 || n == 1) {
			cnt++;
			break;
		}
	}

	return cnt;
}

int solution(int n) {
	int cnt = countOne(n);

	n++;
	while (1) {
		if (cnt == countOne(n)) {
			return n;
		}
		n++;
	}
}

int main() {
	// IO 속도 향상
	ios_base::sync_with_stdio(false);
	cin.tie(NULL);

	cin >> n;
	cout << solution(n) << "\n";

	return 0;
}