# 프로그래머스(Programmers) 코딩테스트 연습
## LEVEL 1 체육복 탐욕법(Greedy) 문제 자바(JAVA) 풀이
- https://programmers.co.kr/learn/courses/30/lessons/12982

## 티스토리 주소
- http://hoho325.tistory.com/



## 문제 풀이
- 이 문제는 양 옆의 사람이 여벌의 옷을 들고 있는지 확인하여 빌림으로써 간단히 풀 수 있다.
1. 우선 index를 쉽게 계산하기 위해서 맨 왼쪽과 맨 오른쪽에 칸을 추가한다.(clothes.length = n+2)
2. lost를 순회하며 옷이 없는 학생은 -1을 해준다.
3. reserve를 순회하며 옷이 더 있는 학생은 +1을 해준다.
4. 그리고 clothes를 순회하며 옷이 없는 경우 즉 clothes[i]의 값이 -1인 경우 왼쪽과 오른쪽의 사람에게서 빌릴 수 있는지 검사한다.
5. 체육복이 없는데 양쪽 사람도 모두 여벌 옷이 없는 경우 그 사람은 체육수업을 들을 수 없음으로 -1을 해준다.
