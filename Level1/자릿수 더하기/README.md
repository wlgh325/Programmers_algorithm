# <span style="color:orange; font-size:17pt; font-weight:bold">프로그래머스 연습문제 자릿수 더하기 자바, 파이썬 풀이</span>
- Level 1
- [자릿수 더하기](https://programmers.co.kr/learn/courses/30/lessons/12931)
<br><br>

## [티스토리 주소](https://hoho325.tistory.com/)
<br><br>

# <span style="color: red; font-size:15pt">문제 정리</span>
1. 자연수 N이 주어지면 각 자릿수의 합을 구해서 return 하는 solution 함수를 작성해라
<br><br>

# <span style="color: red; font-size:15pt">문제 풀이</span>
1. 10으로 계속 나눠가며 나머지를 더해준다.
2. 주어진 수 n은 10을 나눈 몫으로 update해준다.
3. n이 10보다 작아질때 까지 반복한다
4. while문이 탈출하면 10보다 작아진 n을 ans에 마지막으로 더해준다.
```
예를 들어 123이 있다.
123을 10으로 나눈 나머지는 3이다    // 합 3
123을 10으로 나눈 몫은 12이다.  // n=12

12를 10으로 나눈 나머지는 2이다 // 합 3+2 = 5
12를 10으로 나눈 몫은 1이다. // n=1

n이 10보다 작아졌으므로 탈출
마지막 n을 더해 준다 // 5+1 = 6
```
<br><br>

# python 코드
파이썬의 경우 나누어줄때 int형으로 형 변환이 되지 않으므로 명시적 형변환을 해주어야 한다.  
아니면 몫을 구할때 소수점이 들어가게 된다.
```python
def solution(n):
    ans = 0
    while True:
        ans += n % 10
        n = int(n / 10)
        if n<10:
            break;
    ans += n
    return ans
```