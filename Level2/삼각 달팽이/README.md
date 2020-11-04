# <span style="color:orange; font-size:17pt; font-weight:bold">프로그래머스 월간 코드 챌린지 시즌 1</span>
# <span style="color:orange; font-size:17pt; font-weight:bold">삼각 달팽이</span>
- Level 2
- [삼각 달팽이](https://programmers.co.kr/learn/courses/30/lessons/68645)
<br><br>

## [티스토리 주소](https://hoho325.tistory.com/)
<br><br>

# <span style="color: red; font-size:15pt">문제 정리</span>
1. 정수 n이 주어진다.
2. 밑변의 길이와 높이가 n인 삼각형이 있다.
3. 이 삼각형에서 맨 위 꼭짓점부터 반시계 방햐야으로 달팽이 채우기를 진행 한다.
4. 첫 행부터 마지막 행까지 모두 순서대로 합친 새로운 배열을 return 한다.
<br><br>

# <span style="color: red; font-size:15pt">문제 풀이</span>
n이 최대 1000이므로 시뮬레이션 처럼 돌린다.  
백준의 [마법사 상어와 토네이드](https://www.acmicpc.net/problem/20057)와 비슷한 방식으로 풀었다.  
달팽이 모양으로 움직이기 위한 방향은 세가지가 있다.(아래, 오른쪽, 왼쪽 위 대각선) 이를 각각 구현한다.
1. 단계 마다 이동해야 하는 step수를 steps 배열에 담는다.  
예를들어 n이 4 이면 3(아래 이동), 3(오른쪽 이동), 2(대각선 이동), 1(아래 이동) 이동하게 된다.
n 이면 4,4,3,2,1이 된다.
2. 그 단계(step)의 이동수 만큼 모두 이동할 때까지 그 방향으로 이동한다.
3. 그 단계의 이동수 만큼 모두 이동하였다면 다음 방향으로 바꾸고 단계를 증가시킨다.
4. 마지막 수를 채울때까지 이를 반복한다.
<br><br>

# <span style="color: red; font-size:15pt">시뮬레이션</span>
n이 4일때 시뮬레이션 해본다.
1. 0,0에 1을 넣는다. dir=0이고 cnt != steps[step]이므로 x=1, cnt=1이 된다.
2. 1,0에 2를 넣는다. x=2, cnt=2가 된다.
3. 2,0에 3을 넣는다. x=3, cnt=3이 된다.
4. 3,0에 4를 넣는다. 이제 cnt가 3으로 steps[0]과 같다. 방향전환을 한다. y=1이 된다.
5. 3,1에 5를 넣는다. y=2, cnt=2가 된다.
6. 3,2에 6을 넣는다. y=3, cnt=3이 된다.
7. 3,3에 7을 넣는다. cnt가 3으로 steps[1]과 같다. 방향전환을 한다. x=2, y=2가 된다.
8. 2,2에 8을 넣는다. x=1, y=1, cnt=2가 된다.
9. 1,1에 9를 넣는다. cnt가 2로 steps[2]과 같다. 방향전환을 한다. x=2가 된다.
10. 2,1에 10을 넣는다. cnt가 1로 steps[3]과 같다. 방향전환을 한다.
11. num이 11이 되었다. 즉 끝 수인 10까지 모두 채웠다. while문을 탈출한다.
12. 배열의 수를 return할 새로운 배열에 모두 넣어준다.