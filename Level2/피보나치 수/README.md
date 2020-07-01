# <span style="color:orange; font-size:17pt; font-weight:bold">프로그래머스 피보나치 수 c++ 풀이</span>
- Level 2
- 연습문제
- [피보나치 수](https://programmers.co.kr/learn/courses/30/lessons/12945)
<br><br>

## [티스토리 주소](https://hoho325.tistory.com/)
<br><br>

# <span style="color: red; font-size:15pt">문제 정리</span>
1. n이 주어질 때 n번째 피보나치 수를 1234567로 나눈 나머지를 구하여라
2. n은 2이상 100000 이하이다.
<br><br>

# <span style="color: red; font-size:15pt">문제 접근</span>
피보나치 수를 알기 위해서는 이전의 2개의 수만 알면 된다.  
그렇기 때문에 2개의 수만 관리한다. n이 최대 100,000이기 때문에 배열을 모두 만들면 낭비이다.  
또한 계속 값을 더해나간 후 마지막에 모듈러 연산을 하면 값이 범위를 넘어 이상한 값이 나올 수 있다.  
그렇기 때문에 모듈러 연산의 성질을 이용하면 간단히 풀 수 있다.
<br><br>

# <span style="color: red; font-size:15pt">모듈러 연산의 성질</span>
이 성질만 안다면 간단히 풀 수 있습니다.
(a + b) % c = ((a % c) + (b % c)) % c
예를들어 (10 + 1) % 3 = (10 % 3 + 1 % 3 ) % 3 = (1 + 1) % 3 = 2
11 % 3 = 2로 같은 결과가 나오는 것을 볼 수 있습니다.
<br><br>

# <span style="color: red; font-size:15pt">문제 풀이</span>
1. 0번째 피보나치 수 0을 before에, 1번째 피보나치 수를 after에 담습니다.
2. 모듈러 연산의 성질을 이용하여 다음 피보나치 수에 1234567을 모듈러한 값을 찾습니다.
3. 이제 2번째 전의 피보나치 수는 1번째 전의 피보나치 수가 되고, 1번째 전의 피보나치 수는 방금 구한 sum이 됩니다. 이제 이 두 수를 가지고 또 다음 피보나치 수를 구할 것입니다.