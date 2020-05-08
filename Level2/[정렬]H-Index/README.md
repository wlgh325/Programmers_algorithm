# <span style="color:orange; font-size:17pt; font-weight:bold">프로그래머스 H-Index 자바(java) 풀이</span>
- Level 2
- 정렬
- [H-Index](https://programmers.co.kr/learn/courses/30/lessons/42747)
<br><br>

## [티스토리 주소](https://hoho325.tistory.com/)
<br><br>

# <span style="color: red; font-size:15pt">문제 정리</span>
1. 어떤 과학자의 H-Index: 발표한 논문 n편 중, h번 이상 인용된 논문이 h편 이상이고 나머지 논문이 h번 이하 인용되었다면 h의 최댓값
2. 논문별 인용 횟수는 0회 이상 10,000회 이하이다.
<br><br>

# <span style="color: red; font-size:15pt">문제 풀이</span>
문제 그대로 풀이 하면됩니다. 쉽게 풀이하기 위해서 우선 오름차순으로 정렬합니다.
1. 인용횟수 0번 부터 제일 큰 인용횟수(citations[len-1]) 까지 모두 해봅니다
2. 인용횟수 h번 보다 큰 인용횟수들을 카운트 합니다(cnt)
3. h보다 큰 인용횟수의 개수(cnt)가 h 이상이면 조건을 만족함으로 h는 h-index가 될 수 있습니다. 이때 max 값을 update 해줍니다. 그리고 다음 계산을 위해 cnt를 0으로 초기화합니다.