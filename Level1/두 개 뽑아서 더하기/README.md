# <span style="color:orange; font-size:17pt; font-weight:bold">프로그래머스 월간 코드 챌린지 시즌 1</span>
# <span style="color:orange; font-size:17pt; font-weight:bold">두 개 뽑아서 더하기</span>
- Level 1
- [두 개 뽑아서 더하기](https://programmers.co.kr/learn/courses/30/lessons/68644)
<br><br>

## [티스토리 주소](https://hoho325.tistory.com/)
<br><br>

# <span style="color: red; font-size:15pt">문제 정리</span>
1. 주어진 배열에서 서로 다른 인덱스의 두 수를 뽑는다.
2. 더해서 만들 수 있는 모든 수를 오름차순으로 정렬하여 return 하라
<br><br>

# <span style="color: red; font-size:15pt">문제 풀이</span>
1. 이중 for문을 돌면서 i와 j가 같지 않은 경우 set에 넣는다. (중복 제거를 위해 set에 넣음)
2. set크기의 배열을 생성
3. iterator를 통해 set의 원소들을 모두 뽑아 배열에 넣는다.
4. Arrays.sort()를 통해 오름차순으로 정렬한다.