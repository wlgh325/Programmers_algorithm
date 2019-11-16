# 프로그래머스 코딩테스트 연습
## LEVEL 2 프린터 스택/큐 문제 자바(JAVA) 풀이
- https://programmers.co.kr/learn/courses/30/lessons/42587

## 티스토리 주소
- http://hoho325.tistory.com/


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
1. 프린터 순서를 담을 배열(order)과 인쇄 대기목록을 관리할 queue를 생성한다.
2. 인쇄 정보를 담는 Print class를 만들어서 queue에 인덱스와 우선순위를 담는다.
3. queue에 있는 대기중인 목록이 모두 없어질때까지 반복한다.
4. queue에서 맨 앞에 있는 인쇄물을 꺼낸다. 꺼내서 대기목록에 있는 다른 인쇄물들의 우선순위와 비교한다.
5. 비교하여 더 큰 수가 있다면 다시 queue에 넣어서 대기목록의 뒤로 보낸다.
6. 그렇지 않다면 프린트 순서 목록에 추가한다.
7. 이렇게 프린트 순서(order)를 결정하고 location 값을 가지는 인덱스에 1을 더해 답을 구한다. (location은 0부터 인쇄 순서는 1부터 시작하기 때문!)


