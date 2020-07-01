#include <iostream>
using namespace std;

int num = 1234567;
int solution(int n) {
	// n번째 피보나치 수를 1234567로 나눈 나머지 리턴
	int before = 0;
	int after = 1;

	int sum = 0;
	for (int i = 2; i <= n; i++) {
		sum = ((before % num) + (after % num)) % num;	// 모듈러 연산 성질이용, fibo[i]
		before = after; // fibo[i-2] = fibo[i-1]
		after = sum;	// fibo[i-1] = fibo[i];
	}
	return sum;
}

int main() {
	// IO 속도 향상
	ios_base::sync_with_stdio(false);
	cin.tie(NULL);
	
	cout << solution(3) << "\n";
	cout << solution(5) << "\n";
	return 0;
}