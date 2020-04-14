# <span style="color:orange; font-size:17pt; font-weight:bold">프로그래머스 문자열 내 p와 y의 개수  풀이</span>
- Level 1
- [문자열 내 p와 y의 개수](https://programmers.co.kr/learn/courses/30/lessons/12916)
<br><br>

## [티스토리 주소](https://hoho325.tistory.com/)
<br><br>

# <span style="color: red; font-size:15pt">문제 정리</span>
1. 대문자와 소문자가 섞여있는 문자열 s가 주어진다.
2. s에 'p'의 개수와 'y'의 개수를 비교해 같으면 true / 다르면 false를 return한다.
3. p와 y모두 하나도 없는 경우에는 true를 리턴한다.
4. 대문자와 소문자는 구분하지 않는다.
5. s의 길이는 50이하이다.
<br><br>

# <span style="color: red; font-size:15pt">문제 풀이</span>
문자열의 길이가 최대 50이므로 모두 탐색하면 된다.
1. 대소문자를 구분하지 않기 위해 주어진 문자열을 소문자로 바꾼다
2. 문자열을 캐릭터 배열로 변환한다. (하지 않고 substring으로 해도 됨)
3. 그리고 문자를 하나씩 검사하며 p라면 p의 개수 count, y라면 y의 개수 count
4. 마지막에 p와 y의 개수를 비교하여 같다면 true, 다르면 false를 반환한다.