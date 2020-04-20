# <span style="color:orange; font-size:17pt; font-weight:bold">프로그래머스 연습문제 콜라츠 추측 자바 풀이</span>
- Level 1
- [콜라츠 추측](https://programmers.co.kr/learn/courses/30/lessons/12943)
<br><br>

## [티스토리 주소](https://hoho325.tistory.com/)
<br><br>

# <span style="color: red; font-size:15pt">문제 정리</span>
1. 이 추측은 주어진 수가 1이 될때까지 다음 작업을 반복하면 모든 수를 1로 만들 수 있다는 추측이다ㅏ.
2. 다음 작업을 시행한다.
    2.1 입력된 수가 짝수라면 2로 나눈다
    2.2 입력된 수가 홀수라면 3을 곱하고 1을 더한다
    2.3 결과로 나온 수에 같은 작업을 1이 될 때까지 반복한다.
3. 작업을 500번 반복해도 1이 되지 않는다면 -1을 반환한다.
<br><br>

# <span style="color: red; font-size:15pt">문제 풀이</span>
1. 홀수일 경우 곱하고 더하는 과정에서 int 형을 넘을 수 있습니다.
    그대로 num을 가지고 하면 overflow가 발생하여 제대로된 답을 낼 수 없습니다.
2. long형으로 바꾸고 짝수와 홀수 조건에 맞는 작업을 시행합니다.