# <span style="color:orange; font-size:17pt; font-weight:bold">프로그래머스 시저암호 풀이</span>
- Level 1
- [시저암호](https://programmers.co.kr/learn/courses/30/lessons/12926)
<br><br>

## [티스토리 주소](https://hoho325.tistory.com/)
<br><br>

# <span style="color: red; font-size:15pt">문제 정리</span>
1. 알파벳이 주어졌을때 n만큼 미룬 문자열을 반환하여라
2. 예를들어 a가 주어졌을때 1만큼 밀면 b가 된다.
3. 공백은 밀어도 그대로 공백이다
4. z에서 1만큼 밀면 a가 된다.
<br><br>

# <span style="color: red; font-size:15pt">문제 풀이</span>
이 문제는 아스키 코드 값을 이용하여 풀 수 있습니다.
1. 문자를 하나하나씩 직접 n만큼 밉니다. 만약 i번째 문자가 공백인 경우 무시합니다.
2. 대문자와 소문자의 경우를 나누어서 풉니다.
3. 대문자의 경우 아스키 코드 값이 65~90 입니다. n만큼 밀고 90을 넘었다면 26만큼 감소시켜 줍니다. 26은 a-z의 개수입니다.
4. 소문자의 경우도 마찬가지로 똑같이 해줍니다.