# <span style="color:orange; font-size:17pt; font-weight:bold">프로그래머스 소수 찾기 자바(java)  풀이</span>
- Level 1
- [소수 찾기](https://programmers.co.kr/learn/courses/30/lessons/12921?language=java)
<br><br>

## [티스토리 주소](https://hoho325.tistory.com/)
<br><br>

# <span style="color: red; font-size:15pt">문제 정리</span>
1. N이 주어질떄 1이상 N이하의 수중 소수의 개수를 구하여라
<br><br>

# <span style="color: red; font-size:15pt">문제 풀이(solution)</span>
소수의 정의와 간단한 최적화만 해준다면 풀 수 있습니다.
1. 어떤수 N이 1과 자기 자신외에 다른 수로 나누어떨어진다면 그 수는 소수가 아닙니다.
2. 즉 1부터 N사이의 수를 모두 2이상 자기이하의 수로 나누어 봅니다.
    그래서 나누어떨어지는 수가 하나라도 있다면 그 수는 소수가 아닙니다.
    하나도 없다면 그 수는 소수가 됩니다.
3. 하지만 2번 처럼 그 수 전까지 모두 나누어 보면 시간초과가 발생합니다. 그래서 루트 N까지로만 나누어 보면 됩니다.
예를 들어 10이 소수인지 아닌지 구한다면 2부터 루트10 까지의 수로만 나누어 보면 알 수 있습니다.

# <span style="color: red; font-size:15pt">에라토스 테네스의 체 이용(solution2)</span>
에라토스 테네스의 체를 이용하여 훨씬 빠른 시간안에 소수의 개수를 구할 수 있습니다.
1. boolean 배열을 이용한다.
2. n이하의 수까지 모두 탐색한다
3. i번째를 탐색했는데 false라면 그 수는 소수이다. 이를 list에 넣는다
4. 소수의 배수들을 n보다 작은 선에서 모두 true로 체크한다.
    예를 들어 처음에 2를 확인. 2는 소수로 체크
    2의 배수를 모두 소수가 아닌수(true)로 체크
5. 다음으로 false인 수를 찾는다 그 수가 소수가 된다.
6. 위의 과정을 계속해서 반복하면 list에는 소수만 담기게 된다.
7. list의 크기를 구하면 1~n 사이의 소수의 개수가 된다.