# 프로그래머스 코딩테스트 
## LEVEL 2 다리를 지나는 트럭 스택/큐 문제 자바(JAVA) 풀이
- https://programmers.co.kr/learn/courses/30/lessons/42583

```
이 문제는 큐(Queue)를 이용하여 풀 수 있는 문제입니다.
자바에서 기본으로 주어지는 queue을 이용하여 풀면 됩니다.
queue은 java.util.Queue와 java.util.LinkedList를 import하면 사용할 수 있습니다.
```

## 자바 queue의 사용법
```
import java.util.Queue;
import java.util.LinkedList;

Queue<Integer> weights = new LinkedList<>();    // queue 선언, linkedlist 이용
queue.offer(1);  // queue에 1 넣기
queue.offer(2);  // queue에 2 넣기
int num = queue.poll();  // queue의 맨 앞에 값 꺼내기
int top_num = queue.peek(); // 값을 꺼내지 않고 queue의 맨 앞의 값 확인하기
```

- 큐를 선언할때 <>안에 다른 자료형을 써서 다른 자료형을 넣을 수 있다.
- ex) Queue<Character> stack = new LinkedList<>();


## 문제 풀이
1. 트럭을 차례차례 다리에 놓기 위해서 큐에 넣습니다.
2. 트럭을 담은 weights 큐에서 맨 앞의 트럭을 뽑습니다.(직접 poll로 뽑지는 않고 peek로 값 확인)
3. total 변수를 이용하여 현재 다리 위의 트럭의 무게를 관리합니다. 
4. 버틸 수 있는 다리의 무게(wieght) >= 현재 다리위의 트럭의 무계(total) + 현재 트럭의 무게(truck_weight)면 다리를 지나가게 합니다.
5. 그리고 시간을 increase 함수를 통해 증가시킵니다. 다리를 지나는 트럭을 관리하는 queue에 있는 truck들의 시간을 증가시킵니다.
6. 총 흐른 시간을 증가 시킵니다(answer++)
7. queue의 맨 앞의 트럭이 다리를 모두 건넜다면, 즉 시간이 다리 길이와 같다면 지나간것이 되므로 queue에서 제거합니다.
8. 트럭을 담은 weights의 모든 원소가 없어질때까지 반복하며 모두 없어진 경우 다리 위에 남아있는 마지막 트럭을 처리하기 위해 총 시간에 다리 길이 만큼 더해줍니다.

