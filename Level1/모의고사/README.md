# 프로그래머스(Programmers) 코딩테스트 연습
## LEVEL 1 모의고사 연습 문제 자바(JAVA) 풀이
- https://programmers.co.kr/learn/courses/30/lessons/42840

## 티스토리 주소
- https://hoho325.tistory.com/64



## 문제 풀이
1. 세명 모두 정답을 반복해서 찍으므로 '%'연살을 이용해서 답과 비교한다
2. 정답 수를 비교해서 가장 큰 수를 구한다
3. 가장 큰 수(max)와 같으면 arrList에 넣어준다 => 따로 정렬할 필요 X
4. answer 배열에 다시 넣고 반환한다

## MAth.max 이용
```
Math에 있는 max함수를 이용한다
MAth는 java.lang에 있다
import java.lang.Math를 하면 사용할 수 있다

따로 정렬할 필요 없이 가장 큰 값을 찾아서
1번 부터 차례대로 비교하여 값을 넣어주면 된다
```
