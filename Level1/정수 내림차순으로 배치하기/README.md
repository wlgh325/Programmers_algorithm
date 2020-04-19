# <span style="color:orange; font-size:17pt; font-weight:bold">프로그래머스 연습문제 자연수 뒤집어 배열로 만들기 자바 풀이</span>
- Level 1
- [자연수 뒤집어 배열로 만들기](https://programmers.co.kr/learn/courses/30/lessons/12932?language=java)
<br><br>

## [티스토리 주소](https://hoho325.tistory.com/)
<br><br>

# <span style="color: red; font-size:15pt">문제 정리</span>
1. 정수 n을 입력으로 받아 각 자릿수를 큰 수부터 차례대로 정렬한 새로운 정수를 리턴하여라
<br><br>

# <span style="color: red; font-size:15pt">문제 풀이</span>
1. 우선 각 자릿수를 나눕니다. 이는 자릿수 더하기 문제를 이용하면 됩니다. 10으로 나눈 나머지가 자릿수이고 n은 10으로 계속 나누어 줍니다.
2. 나눈 자릿수를 arraylist에 넣습니다. 다 넣었다면 오름차순 정렬합니다.(Collections.sort 이용)
3. list의 뒤에서 부터 하나씩 꺼내면 string으로 만듭니다.
4. 문자열을 Long형으로 변환하여 반환합니다.
