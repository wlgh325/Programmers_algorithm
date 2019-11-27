# 프로그래머스(Programmers) 코딩테스트 연습
## LEVEL 1 예산 서머코딩/윈터코등(~2018) 문제 자바(JAVA) 풀이
- https://programmers.co.kr/learn/courses/30/lessons/12982

## 티스토리 주소
- http://hoho325.tistory.com/


## 문제 풀이
```
이 문제를 처음엔 bfs로 풀려고 했지만 시간 초과가 나왔습니다.
하지만 모든 경우를 보는게 아니라 sorting이 중요한 point 였습니다.
sorting을 해서 작은 수를 먼저 더해가면서 budget보다 커지게 되면
그 뒤의 더 큰 수를 가진 부서는 예산을 지원받을 수 없습니다.
```
1. 우선 Arrays.sort()를 이용해 신청 금액 배열을 sorting 합니다.
2. 그리고 더한 값이 budget보다 작다면 sum을 update해주고 지원할 수 있는 부서로 check 합니다(num++)
3. 예산을 초과해서 계속 더 할 수 없다면 바로 break를 통해 for문을 종료합니다.
