# 프로그래머스 코딩테스트 
## LEVEL 2 쇠막대기 스택/큐 문제 자바(JAVA) 풀이
- https://programmers.co.kr/learn/courses/30/lessons/42585

## 티스토리 주소
- http://hoho325.tistory.com/


```
이 문제는 스택을 이용하는 문제입니다.
자바에서 기본으로 주어지는 stack을 이용하여 풀면 됩니다.
stack은 java.util.Stack을 import하면 사용할 수 있습니다.
```

## 자바 stack의 사용법
```
import java.util.Stack;
Stack<Integer> stack = new Stack<>();   // stack 선언
stack.push(1);  // stack에 1 넣기
stack.push(2);  // stack에 2 넣기
int num = stack.pop();  // stack의 맨 위의 값 꺼내기
int top_num = stack.peek(); // 값을 꺼내지 않고 stack의 맨 위의 값 확인
```

- 스택을 선언할때 <>안에 다른 자료형을 써서 다른 자료형을 넣을 수 있다.
- ex) Stack<Character> stack = new Stack<>();


## 문제 풀이
문제를 이해만 하면 아주 간단히 풀 수 있다.
1. 우선 '('만 stack에 쌓는다. 이때 레이저 즉, '()'면 쌓지 않는다.
2. 쌓다가 '()'를 만나면(레이저를 만나면) stack에 쌓인 '('의 개수를 세서 더 한다 (stack의 크기를 구한다)
3. ')'를 만나면 stack에서 하나를 pop하고 개수를 한개 더 한다.
4. 이렇게 하여 총 잘린 쇠막대기 개수를 구할 수 있다.

