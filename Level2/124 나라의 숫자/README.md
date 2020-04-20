# <span style="color:orange; font-size:17pt; font-weight:bold">프로그래머스 124 나라의 숫자 자바(java) 풀이</span>
- Level 2
- [124 나라의 숫자](https://programmers.co.kr/learn/courses/30/lessons/12899)
<br><br>

## [티스토리 주소](https://hoho325.tistory.com/)
<br><br>

# <span style="color: red; font-size:15pt">문제 정리</span>
1. 124나라에서는 모든 수를 표현함에 있어서 1,2,4 3개의 숫자만을 이용합니다.
2. 표현되는 숫자는 사이트를 참고하시기 바랍니다!
<br><br>

# <span style="color: red; font-size:15pt">Greedy 풀이(Solution)</span>
3개의 숫자만을 사용해서 숫자를 표현하기 때문에 3진법의 개념을 이용합니다. 다만 3이 아닌 4를 사용하기 때문에 약간의 trick이 필요합니다.
1. 3진법을 구할때 처럼 3으로 3보다 작이질때까지 3으로 계속 나눠갑니다.
2. 나머지를 string의 뒤에 붙여줍니다.
3. 만약에 나머지가 0이라면 0은 쓰이지 않기 때문에 4로 바꿔주면 됩니다. 그리고 n을 1 감소 시켜주어야 합니다.
    예를들어 6의 경우 3으로 나눈 몫과 나머지는 2..0 입니다.
    실제 값은 14이므로 20이 아닙니다.
    즉 몫에서 1을 빼고 0을 4로 바꿔주면 14가 됩니다.
    이와 같은 규칙을 발견할 수 있었습니다.
4. 그리고 마지막에 남은 n이 0이 아니라면 숫자를 붙여줍니다.
5. string을 거꾸로 하여 올바른 순서로 바꿔주어 return 합니다.