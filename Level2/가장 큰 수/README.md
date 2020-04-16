# <span style="color:orange; font-size:17pt; font-weight:bold">프로그래머스 가장 큰 수 자바(java) 풀이</span>
- Level 2
- 정렬
- [가장 큰 수](https://programmers.co.kr/learn/courses/30/lessons/42746)
<br><br>

## [티스토리 주소](https://hoho325.tistory.com/)
<br><br>

# <span style="color: red; font-size:15pt">문제 정리</span>
1. 정수들이 주어질때 정수들을 이용하여 만들 수 있는 가장 큰 수를 구하여라.
2. 정답은 문자열로 바꾸어 return 하여라.
<br><br>

# <span style="color: red; font-size:15pt">문제 풀이</span>
이 문제는 comparator를 구현하여 정렬하면 풀 수 있는 문제입니다.  
답을 도출해 내기 위해서는 정렬시 두 문자를 a+b, b+a로 합쳐본 뒤 더 큰수가 앞에 올 수 있게 합니다.  
거기에 0으로만 이루어진 배열이 있는경우 예외 처리를 위하여 맨 앞의 숫자가 0인 경우 0000.... 이렇게 되있기 때문에  
이는 0으로 바꿔서 출력해줍니다(TC 11번)