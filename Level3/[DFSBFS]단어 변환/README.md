# <span style="color:orange; font-size:17pt; font-weight:bold">프로그래머스 단어 변환 자바(java) 풀이</span>
- Level 3
- BFS/DFS
- [단어 변환](https://programmers.co.kr/learn/courses/30/lessons/43163)
<br><br>

## [티스토리 주소](https://hoho325.tistory.com/)
<br><br>

# <span style="color: red; font-size:15pt">문제 정리</span>
1. 두 개의 단어 begin, target과 단어의 집합이 있다. 다음 규칙을 이용하여 begin에서 target으로 단어를 변환하는 가장 짧은 변환을 찾으려 한다.
2. 규칙1: 한 번에 한 개의 알파벳만 바꿀 수 있다.
3. 규칙2: words에 있는 단어로만 변환할 수 있다.
4. 최소 몇 단계의 과정을 거쳐 target으로 바꿀 수 있는지 찾아라.
5. 각 단어의 길이는 3 이상 10 이하이며 모든 단어의 길이는 같습니다.
6. words에는 3개 이상 50개 이하의 단어가 있습니다.
7. 변환할 수 없는 경우에는 0을 return 합니다.
<br><br>

# <span style="color: red; font-size:15pt">문제 풀이</span>
이 문제는 bfs의 개념을 이용하면 생각보다 간단히 풀 수 있습니다.  
하지만 그것까지 떠올리기 까지 시간이 조금 걸렸습니다.  
변화하는 과정을 어떻게 따라갈까??? 20분?? 좀 고민하다가 풀었습니다!!
1. 우선 target 문자가 words배열 안에 없는 경우 0을 바로 return 합니다.
2. 그렇지 않은 경우 bfs 탐색을 합니다.
3. 우선 begin 문자를 queue에 넣습니다. 이때 Info class를 이용합니다. 몇번째 stage인지 확인하기 위해서입니다.
4. queue에서 값을 빼고 그 값이 target 문자인지 확인합니다. 맞다면 min 값을 갱신하고 아니라면 다음을 수행합니다.
5. words에 있는 모든 단어와 비교해봅니다. 단, 이미 탐색한 문자는 제외합니다.(visited[i] != true)
6. 글자의 단어들을 각각 모두 비교합니다. 비교해서 단어의길이-1 즉, 한 문자만 다른것으로 판단된 경우 이는 한 단어를 바꿔서 다음 단계로 넘어갈 수 있는 경우입니다. 그러므로 visited를 check하고 queue에 넣습니다.
7. 이와 같은 과정을 반복합니다.
<br><br>

# <span style="color: red; font-size:15pt">문제 풀이 해설(디버깅)</span>
bfs에 익숙하지 않다면 왜 위처럼 하는지 이해가 안갈 수도 있다고 생각합니다.  
그래서 예제 1번을 디버깅해보겠습니다.
1. words안에 target 문자가 있으므로 조건에 걸리지 않고 bfs 함수로 넘어갑니다.
2. q와 visited를 생성합니다. 단어의 길이를 wordlen(길이 3)에 담습니다.
3. queue에 begine 문자를 넣습니다. stage는 0입니다.
4. while문에서 queue에 있는 info를 뺍니다. str="hit", stage=1입니다.
    4.1 target 문자에 도달했는지 확인합니다. 그렇지 않으므로 아래 코드를 진행합니다.
    4.2 words에 담긴 문자를 탐색합니다. 처음 문자는 "hot". 이는 "hit"과 모든 문자를 비교하면 cnt=2로 한 개의 문자만 다릅니다. queue에 넣고 stage를 1증가시킵니다.
    4.3 다음은 "dot" 으로 cnt=1로 두개의 문자가 다르므로 queue에 넣지 않습니다. 이는 두 개의 문자를 변형해야 하기 때문입니다.
    4.4 "dog"는 cnt=0, "lot"은 cnt=1, "log"는 cnt=0, "cog"도 cnt=0 입니다. 모든 words를 검색했습니다.
5. queue에서 값을 뺍니다. 4에서 담은 "hot"입니다. 위와 같은 과정을 반복합니다. "dot", "lot"이 가능하므로 둘다 queue에 담습니다. (stage=2)
6. "dot"을 꺼냅니다. "hot"과 "lot"이 가능하지만 이미 둘다 visited 되었으므로 다시 queue에 넣지 않습니다. 이와 같이 visited를 넣은 이유는 중복을 제거하기 위해서입니다. "dog"도 가능합니다. 이는 visited 처리 되지 않았으므로 queue에 넣습니다.(stage=3)
7. "lot"을 꺼냅니다. visited 처리 된걸 제외하면 "log"가 있습니다. 이를 queue에 넣습니다. (stage=3)
8. "dog"를 꺼냅니다. 가능한 문자로는 "cog"가 있습니다. 이를 넣습니다.(stage=4)
9. "log"를 꺼냅니다. 모두 visited 되어 가능한게 없습니다.
10. "cog"를 꺼냅니다. 이는 target 문자이므로 min 값을 갱신합니다. stage가 4이므로 min=4 가 됩니다.
