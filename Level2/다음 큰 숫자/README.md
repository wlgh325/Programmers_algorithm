# <span style="color:orange; font-size:17pt; font-weight:bold">프로그래머스 다음 큰 숫자 c++ 풀이</span>
- Level 2
- 연습문제
- [다음 큰 숫자](https://programmers.co.kr/learn/courses/30/lessons/12911?language=cpp)
<br><br>

## [티스토리 주소](https://hoho325.tistory.com/)
<br><br>

# <span style="color: red; font-size:15pt">문제 정리</span>
1. 자연수 n이 주어졌을 때, n의 다음 큰 숫자는 다음고 같다.
```
1. n의 다음 큰 숫자는 n보다 큰 자연수
2. n의 다음 큰 숫자와 n은 2진수로 변환했을 때 1의 개수가 같다.
3. n의 다음 큰 숫자는 조건 1,2를 만족하는 수 중 가장 작은 수
4. n은 1,000,000 이하의 자연수이다.
```
<br><br>

# <span style="color: red; font-size:15pt">문제 풀이</span>
1. n보다 큰 숫자부터 2진수로 변환하여 1의 개수를 세본다.
2. 개수를 세서 n의 1의 개수와 같다면 조건 1을 만족하고, 자동으로 조건 2도 만족하게 된다.
3. 1의 개수는 이진수로 변환하는 로을 그대로 적용하면 된다. 2로 나눠서 2로 나눠 떨어지지 않는다면 1이 하나 있다는 뜻이다.
4. 이를 n이 2나 1이 될때까지 반복한다. 마지막 맨 왼쪽 비트는 항상 1이므로 이때도 1의 개수를 세준다.
5. 이 조건을 만족하는 수 n을 출력하면 된다.