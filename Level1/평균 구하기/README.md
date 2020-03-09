# 프로그래머스(Programmers) 코딩테스트 연습
## LEVEL 1 평균 구하기 연습문제 자바(java) 풀이
[프로그래머스 평균 구하기](https://programmers.co.kr/learn/courses/30/lessons/12944)

# [티스토리 주소](http://hoho325.tistory.com/)

# 문제 풀이
그냥 배열의 모든 수를 꺼내서 더하고 배열의 길이로 나누어 주면 됩니다.  
다만 **주의할 점**이 있습니다.  
모든 수를 더할때 double 변수에 담아주어야 합니다.  
만약 아래와 같이 했다면 평균은 2로 출력 됩니다.
```java
int sum = 0;
for(int num : arr)
    sum += num;
return sum / arr.length;
```
왜냐하면 int와 int로 나누었기 때문에 소수점은 버리게 됩니다.  
나누는 수 중 하나는 double 형으로 해주어야 double형으로 계산이 되서 소수점도 남습니다.  
double로 타입 캐스팅을 해주거나 sum을 double변수로 선언해야 합니다.