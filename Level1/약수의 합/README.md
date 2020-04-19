# <span style="color:orange; font-size:17pt; font-weight:bold">프로그래머스 연습문제 약수의 합 풀이</span>
- Level 1
- [약수의 합](https://programmers.co.kr/learn/courses/30/lessons/12928)
<br><br>

## [티스토리 주소](https://hoho325.tistory.com/)
<br><br>

# <span style="color: red; font-size:15pt">문제 정리</span>
1. 정수 n을 입력받아 n의 약수를 모두 더한 값을 리턴하는 함수, solution을 완성해라
<br><br>

# <span style="color: red; font-size:15pt">문제 풀이</span>
말 그대로 약수를 모두 구해서 구한 약수를 모두 더해주면 됩니다.  
n이하의 수로 모두 나누어 보며 나누어 떨어지는 수를 모두 더합니다.  
예를 들어 5는 1,2,3,4,5로 모두 나누어 봅니다.  
이중에서 나누어 떨어지는 수는 1과 5이므로 답은 6이 됩니다.


# python 코드
```python
def solution(n):
    answer = 0
    for i in range(1,n+1):
        if n % i == 0:
            answer += i
    return answer
```