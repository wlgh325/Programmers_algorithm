# 프로그래머스(Programmers) 코딩테스트 연습
## LEVEL 1 같은 숫자는 싫어 연습 문제 자바(JAVA) 풀이
- https://programmers.co.kr/learn/courses/30/lessons/12906

## 티스토리 주소
- http://hoho325.tistory.com/



## 문제 풀이
1. 숫자가 들어있는 배열을 순회하며 다른 숫자가 나올때만 숫자를 arraylist에 넣는다.
2. 그렇게 넣다보면 마지막 2 숫자를 비교하는 부분에서 같은 경우, 둘중 하나가 들어가야 하지만 그렇지 못한다.
3. 그리고 마지막 2 숫자가 다른 경우에도 마지막 숫자가 list에 들어가지 못하기 때문에 마지막 숫자를 따로 list에 넣어준다.
4. list에 있는 값을 하나씩 꺼내서 int형 배열로 바꿔준다.

## stream().mapToInt()이용
```
java 8인가 부터 지원하는 걸로 알 고 있습니다.
stream을 이용하여 뭔가 그럴듯하게 풀이를 할 수도 있습니다.
이 문제 같은 경우는 길이가 비슷하거나 더 복잡해보이지만
stream을 이용히야 더 간단하게 코딩 할 수도 있습니다.

Integer [] temp = arrList.toArray(new Integer[arrList.size()]);
return Arrays.stream(temp).mapToInt(Integer::intValue).toArray();
```
