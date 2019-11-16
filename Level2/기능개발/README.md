# 프로그래머스(Programmers) 코딩테스트 연습
## LEVEL 2 기능개발 스택/큐 문제 자바(JAVA) 풀이
- https://programmers.co.kr/learn/courses/30/lessons/42586

## 티스토리 주소
- http://hoho325.tistory.com/


## 자바 ArrayList의 사용법
```
import java.util.ArrayList;

ArrayList<Integer> answerList = new ArrayList<>();  // ArrayList 초기화
arrList.add(3);   // ArrayList에 값 넣기
arrList.add(4);   // ArrayList에 값 넣기
arrList.remove(0);  // ArrayList 0번째 값 제거. 즉 3제거

int num = arrList.get(0);   // ArrayList의 0번째 값 구하기. 즉 num = 4
int size = arrList.size();  // ArrayList 크기 구하기
```

- ArrayList를 선언할때 <>안에 다른 자료형을 써서 다른 자료형을 넣을 수 있다.
- 물론 class Type도 가능하다.
- ex) ArrayList<Character> stack = new ArrayListList<>();

```
여기서 중요한 부분은 뒤의 기능이 더 먼저 구현되어도
앞의 기능이 배포될때 뒤의 기능이 배포될 수 있다는 점입니다.
이 문제의 예시를 보면 각 각 걸리는 일 수는 '7, 3, 9'입니다.
즉 2번째 기능은 제일 먼저 끝나지만 1번째 기능이 7일로 2번째 보다 나중에 끝나기 때문에
2번째 기능은 1번째 기능이 배포될때가 되서야 같이 배포될 수 있습니다.

다른 예시로 각 걸리는 일 수가 '7 3 5 9'라고 가정합시다
그러면 2번째 3번째는 첫번째 기능이 구현된 7일째에 한번에 배포될 수 있습니다.
그러므로 답은 '3, 1'이 됩니다.

앞의 수와 뒤의 수를 비교하며 앞의 수가 더 크다면 즉, 더 오래걸린다면
한번에 배포할 기능의 수가 하나 더 많아지는 것이므로 count를 1 더하고 작은 수를 제거합니다.
(큰 수와 뒤의 다른 수를 비교하기 위해서)
그러다가 뒤의 수가 더 크다면 다시 count를 1로 초기화하여 계산합니다.
```

## 문제 풀이
1. 답을 담을 arrayList(answerList)와 기능마다 걸리는 일 수를 계산해서 담을 arrayList(arrList)를 선언합니다.
2. 첫번째 for문에서 speeds 값을 100보다 크거나 같을 때까지 더해주며 걸리는 일 수를 계산합니다.
3. while 문에서 앞의 수가 더 크다면 작은 수를 지우고 cnt를 증가시킵니다.
4. 그렇게 하다가 뒤의 수가 더 크다면 정답 배열에 cnt를 추가하고 cnt를 1로 초기화합니다.
5. 그렇게 일이 걸리는 시간을 담은 arrayList의 크기가 정답의 arrayList의 크기보다 1이 작기 전까지 진행합니다.
6. 그리고 int형 배열로 바꾸어주고 return합니다.
