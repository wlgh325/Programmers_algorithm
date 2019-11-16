# 프로그래머스(Programmers) 코딩테스트 연습
## LEVEL 1 k번째수 정렬 문제 자바(JAVA) 풀이
- https://programmers.co.kr/learn/courses/30/lessons/42748

## 티스토리 주소
- http://hoho325.tistory.com/


# Arrays의 copyOfRange 메소드
```
이 메소드는 Arrays.copyOfRange(array, i, j) 형식으로 사용합니다.
이렇게 하면 반환되는 배열은 array의 배열의 i번쨰 index부터 j-1번째 index까지 총 j-i개의 원소를 가집니다.

int[] array = {1,2,3,4,5};
int[] temp = Arrays.copyOfRange(array, 1, 3);   // temp = {2,3}

```

## 문제 풀이
```
문제를 위의 Arrays.copyOfRange를 이용하여 풀면 더 간단하지만
저는 이 문제를 풀때 이 메소드를 몰랐기 때문에 다음과 같은 방법으로 풀었습니다.
메소드를 알지 못해도 간단히 풀 수 있습니다.
```

1. 우선 배열을 잘라야 합니다. j-i +1 길이를 가지는 배열을 하나 생성합니다.
2. 만든 임시 배열에 array 배열의 i-1번째 원소부터 j-1번째 원소까지 넣습니다.
3. Arrays.sort() 메소드를 이용해 자른 배열을 sorting 합니다.
4. 정답 배열에 k-1번째 숫자를 담습니다.
