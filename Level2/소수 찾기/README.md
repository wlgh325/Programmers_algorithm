# <span style="color:orange; font-size:17pt; font-weight:bold">프로그래머스 소수찾기 자바(java) 풀이</span>
- Level 2
- 완전 탐색
- [소수 찾기](https://programmers.co.kr/learn/courses/30/lessons/42839)
<br><br>

## [티스토리 주소](https://hoho325.tistory.com/)
<br><br>

# <span style="color: red; font-size:15pt">문제 풀이</span>
numbers를 파싱하여 이용해서 만들 수 있는 모든 수를 만든 후 소수인지 확인합니다.
1. 모든 순열을 확인합니다. n개의 수중 1,2,3..n개를 뽑는 모든 순열을 구합니다.
2. 구한 문자를 숫자로 바꾸어 소수인지 판단합니다. 소수라면 set에 저장합니다. set에 저장하는 이유는 중복된 숫자를 방지하기 위함입니다.
3. 소수인지 판단은 그 수의 루트값 까지 나눠보면 알 수 있습니다.

# <span style="color: red; font-size:15pt">순열(Permutaion)</span>
오랜만에 순열을 구현하려니 생각이 안나서 헤맸다 ㅠㅠ 다시 정리하자!!
1. 순열을 담을 배열을 static으로 select 배열을 선언한다
2. visited 배열을 N 크기로 선언한다(boolean)
3. perm 함수를 작성한다 perm(int start, int r, int n)
4. start를 0부터 증가시키면서 select 배열에 순차적으로 넣습니다. visited도 방문처리 해줍니다.
5. 재귀적으로 perm(start+1, r, n)을 호출합니다.
6. start가 r이 될때까지 즉 r개의 수를 뽑아 순열을 만듭니다