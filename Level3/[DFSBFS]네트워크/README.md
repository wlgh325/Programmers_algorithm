# <span style="color:orange; font-size:17pt; font-weight:bold">프로그래머스 네트워크 자바(java) 풀이</span>
- Level 3
- BFS/DFS
- [네트워크](https://programmers.co.kr/learn/courses/30/lessons/43162)
<br><br>

## [티스토리 주소](https://hoho325.tistory.com/)
<br><br>

# <span style="color: red; font-size:15pt">문제 정리</span>
1. 컴퓨터A와 컴퓨터 B가 연결되있고, 컴퓨터 B와 컴퓨터 C가 연결되있으면 A와 C도 간접적으로 연결되 정보를 주고 받을 수 있다.
2. 따라서 A,B,C는 같은 네트워크 상에 있다고 볼 수 있다.
3. 각 컴퓨터는 0부터 n-1인 정수로 표현된다.
4. i번 컴퓨터와 j번 컴퓨터가 연결되어 있으면 computers[i][j]=1 이다.
5. computers[i][i]는 항상 1이다.
<br><br>

# <span style="color: red; font-size:15pt">문제 풀이</span>
이 문제는 그래프로 바꿔서 생각하면 쉬운 문제입니다. level2에 놔도 될것 같네요   
그래프 형태로 생각해서 bfs나 dfs를 이용해 탐색합니다. 저는 bfs를 이용했습니다.  
1. 방문하지 않은 경우 bfs를 이용해 탐색합니다. bfs로 이어져 있는걸 모두 탐색합니다. 한 번 탐색하게 되면 그게 네트워크의 개수 == 그래프의 개수가 됩니다.
    즉 탐색할때 마다 네트워크의 개수를 1 증가시킵니다.
2. bfs는 첫 시작 노드를 queue에 넣고 queue가 빌때까지 탐색합니다. queue에서 꺼낸 점과 다른 모든 점을 비교합니다.
3. 방문하지 않았고(!visited[i]), 연결되어 있고(computers[x][i] == 1), 자기 자신이 아닌 경우(x != i)에 방문처리하고 이어져 있음으로 체크합니다.(visited[i] = true)
    그리고 다음 탐색을 위해 queue에 넣습니다.
4. 위와 같은 과정을 반복합니다.
<br><br>

# <span style="color: red; font-size:15pt">문제 풀이 해설</span>
이해가 잘 가지 않는다면 직접 디버깅처럼 하나씩 해보시면 됩니다. 예제 1번으로 해보겠습니다.
1. 0번 노드와 연결된 점들을 탐색해보겠습니다. (bfs(0))
2. 0을 queue에 넣고 while문에서 뺍니다(q.poll()). 모든 컴퓨터에 대해서 연결되어 있는지 아닌지 검사 합니다.
3. 먼저 0은 자기 자신이므로 pass
4. 1은 computers[0][1] = 1 이므로 연결되어 있으므로 visited[1] = true로 하고 queue에 다시 넣습니다.
5. 2는 computers[0][2] = 0 이므로 이어져 있지 않습니다.
6. for문을 끝내고 queue에서 1을 뺍니다. 그리고 다시 for문을 돕니다. 0번 컴퓨터는 이미 visited[0]= true이므로 pass, 1은 자기자신, 2는 연결되 있지 않습니다. 이렇게 한번의 bfs 탐색이 끝납니다. 이를 통해 0-1이 하나의 네트워크로 연결되어 있음을 알 수 있습니다.
7. solution 함수에서 visited[1]을 검사할 차례입니다. 이미 검사해 true가 되어 넘어가고 visited[2]는 false 이므로 bfs(2)를 합니다.
8. 위와 같은 과정을 반복해 다른 연결된 컴퓨터가 없으므로 return 합니다. 즉 2 번째 네트워크를 찾은것입니다. 이는 2만 있는 네트워크 입니다.
9. 총 2개의 네트워크를 찾았습니다.