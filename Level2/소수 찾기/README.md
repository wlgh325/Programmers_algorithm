# <span style="color:orange; font-size:17pt; font-weight:bold">프로그래머스 소수찾기 자바(java) 풀이</span>
- Level 2
- 완전 탐색
- [소수 찾기](https://programmers.co.kr/learn/courses/30/lessons/42839)
<br><br>

## [티스토리 주소](https://hoho325.tistory.com/)
<br><br>

# <span style="color: red; font-size:15pt">문제 정리</span>
1. 한자리 숫자가 적힌 종이가 있다.
2. 종이 조각으로 만들 수 있는 소수가 몇 개 인지 return 하여라.
3. 입력으로 주어지는 numbers는 길이 1 이상 7 이하의 문자열이다.
<br><br>

# <span style="color: red; font-size:15pt">Greedy 풀이(Solution)</span>
numbers를 파싱하여 이용해서 만들 수 있는 모든 수를 만든 후 소수인지 확인합니다.
1. 모든 순열을 확인합니다. n개의 수중 1,2,3..n개를 뽑는 모든 순열을 구합니다.
2. 구한 문자를 숫자로 바꾸어 소수인지 판단합니다. 소수라면 set에 저장합니다. set에 저장하는 이유는 중복된 숫자를 방지하기 위함입니다.
3. 소수인지 판단은 그 수의 루트값 까지 나눠보면 알 수 있습니다.