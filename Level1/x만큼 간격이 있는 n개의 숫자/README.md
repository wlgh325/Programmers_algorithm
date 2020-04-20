# <span style="color:orange; font-size:17pt; font-weight:bold">프로그래머스 연습문제 제일 작은 수 제거하기 자바 풀이</span>
- Level 1
- [제일 작은 수 제거하기](https://programmers.co.kr/learn/courses/30/lessons/12935)
<br><br>

## [티스토리 주소](https://hoho325.tistory.com/)
<br><br>

# <span style="color: red; font-size:15pt">문제 정리</span>
1. 정수 x와 자연수 n이 주어질때 x부터 시작해 x씩 증가하는 숫자 n개를 리스트에 담아 return 한다.
<br><br>

# <span style="color: red; font-size:15pt">문제 풀이</span>
x는 최대 천만이고 그걸 1000번 더할 수 있으므로 int형을 넘게 되므로 리스트는 long형이어야 합니다.(자바 기준)  
for문을 반복하며 x의 배수를 모두 배열에 넣어주면 됩니다.  
이때 **주의할 점**은 i와 x의 곱 계산시 int형으로만 계산되기 때문에 int 범위를 넘는 값은 answer 배열에 제대로 담을 수 없습니다.  
그렇기 때문에 처음에 x를 long형으로 바꾸어 계산합니다.

# <span style="color: blue; font-size:15pt">파이썬 한줄 풀이</span>
리스트 내에 for문을 이용하여 한줄로 작성할 수 있습니다.
```python
def solution(x, n):
    return [x*(i+1) for i in range(0,n)]
```