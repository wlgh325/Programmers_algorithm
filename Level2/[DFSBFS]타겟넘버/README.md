# <span style="color:orange; font-size:17pt; font-weight:bold">프로그래머스 타겟넘버 자바(java) 풀이</span>
- Level 2
- BFS/DFS
- [타겟넘버](https://programmers.co.kr/learn/courses/30/lessons/43165)
<br><br>

## [티스토리 주소](https://hoho325.tistory.com/)
<br><br>

# <span style="color: red; font-size:15pt">문제 정리</span>
1. n개의 음이아닌 정수가 있다.
2. 이 수를 적절히 더하거나 빼서 타겟 넘버를 만들려고 한다.
3. 숫자를 적절히 더하고 빼서 타겟 넘버를 만드는 방법의 수를 return 하여라
4. 주어지는 숫자의 개수는 2개 이상 20개 이하입니다.
5. 각 숫자는 1이상 50이하의 자연수 이다.
<br><br>

# <span style="color: red; font-size:15pt">문제 풀이</span>
저는 이 문제를 조합을 이용하여 모든 경우의 수를 따져주었습니다.  
1,2,...len개 선택하는 경우 모두 따져주었습니다.  
1. len(numbers의 개수) 개중 i개 선택하기
    예를들어 1개를 선택한다면 1개만 visited가 true로 될 것입니다.
    그러면 하나만 더하기하고 나머지는 빼기연산을 해줍니다.
    그러면 +1-1-1-1-1도 구할 수 있게됩니다.
    위 경우는 visited[0]만 true로 되어있는 경우입니다.
2. 위와 같은 방법으로 len개 중 1개, 2개.. len개 선택하는 방법을 통해 모든 경우의 수를 구해주었습니다.
3. 그렇게 계산한 값 sum이 target과 같다면 cnt를 1 증가시킵니다.