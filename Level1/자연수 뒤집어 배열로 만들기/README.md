# <span style="color:orange; font-size:17pt; font-weight:bold">프로그래머스 연습문제 자연수 뒤집어 배열로 만들기 자바 풀이</span>
- Level 1
- [자연수 뒤집어 배열로 만들기](https://programmers.co.kr/learn/courses/30/lessons/12932?language=java)
<br><br>

## [티스토리 주소](https://hoho325.tistory.com/)
<br><br>

# <span style="color: red; font-size:15pt">문제 정리</span>
1. 자연수 n을 뒤집어 각 자리 숫자를 원소로 가지는 배열 형태로 리턴하여라
<br><br>

# <span style="color: red; font-size:15pt">문제 풀이</span>
1. 주어진 수를 문자열로 바꾼다.
2. 문자열을 문자 배열로 바꾼다.
3. 문자 배열을 뒤에 부터 순회하며 숫자로 바꿔서 return할 배열인 ans에 넣어준다.

# <span style="color: red; font-size:15pt">문자를 숫자로 변환</span>
문자를 숫자로 변환하기 위해서는 아스키 코드 값을 이용하면 된다.  
예를들어 '1'라는 문자가 있을때 '0'을 빼주면 1이라는 숫자를 얻을 수 있다.  
왜냐하면 '1'이라는 문자의 아스키 코드 값은 49, '0'의 아스키 코드는 48이다.  
그렇기 때문에 1이라는 수를 얻을 수 있다. 나머지도 마찬가지 이다.  