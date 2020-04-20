# <span style="color:orange; font-size:17pt; font-weight:bold">프로그래머스 연습문제 제일 작은 수 제거하기 자바 풀이</span>
- Level 1
- [제일 작은 수 제거하기](https://programmers.co.kr/learn/courses/30/lessons/12935)
<br><br>

## [티스토리 주소](https://hoho325.tistory.com/)
<br><br>

# <span style="color: red; font-size:15pt">문제 정리</span>
1. 주어진 배열에서 가장 작은 수를 제거한 배열을 리턴하여라.
2. 배열에 숫자가 하나밖에 없다면 -1을 담은 배열을 리턴하여라.
3. 배열에 주어진 수는 모두 다르다
<br><br>

# <span style="color: red; font-size:15pt">문제 풀이</span>
배열을 오름차순이나 내림차순으로 정렬해서 제거하면 안됩니다.  
주어진 원소 순서대로 출력해야 합니다.
1. 가장 작은 수의 인덱스를 찾습니다.
2. 그 인덱스의 수만 빼고 새로운 배열에 숫자를 모두 넣습니다. 그러면 원래 순서대로 들어가게 됩니다.