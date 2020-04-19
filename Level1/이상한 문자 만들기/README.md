# <span style="color:orange; font-size:17pt; font-weight:bold">프로그래머스 연습문제 이상한 문자 만들기 파이썬 풀이</span>
- Level 1
- [이상한 문자 만들기](https://programmers.co.kr/learn/courses/30/lessons/12930)
<br><br>

## [티스토리 주소](https://hoho325.tistory.com/)
<br><br>

# <span style="color: red; font-size:15pt">문제 정리</span>
1. 단어는 하나 이상의 공백문자로 구분되어 있다.
2. 단어의 짝수번째 알파벳은 대문자로 변경
3. 단어의 홀수번째 알파벳은 소문자로 변경
4. 변경된 문자열을 리턴하여라
5. 첫 번째 글자는 0번째 인덱스로 본다
<br><br>

# <span style="color: red; font-size:15pt">대소문자 변환</span>
upper 함수와 lower함수를 이용하여 바꿀 수 있습니다.
1. 대문자 변환
```python
s = "abc"
new = s.upper()
print(new) # ABC
```

2. 소문자 변환
```python
s = "ABC"
new = s.lower()
print(new) # abc
```
<br><br>

# <span style="color: red; font-size:15pt">문제 풀이</span>
처음에는 split을 통해 단어로 나눈다음 2중 for문을 통해 구현하려 했다.  
하지만 그렇게 하면 단어 사이에 2개 이상의 공백이 있는 경우 알 수 없다.  
그래서 문자를 하나씩 탐색하며 하기로 하였다.
1. for문으로 모든 문자를 하나씩 탐색합니다.
2. 문자가 공백이 아닌 경우 idx가 짝수 인지 홀수인지 판단한다.
3. 홀수인 경우 lower를 이용하여 소문자로, 짝수인 경우 upper를 이용하여 대문자로 변환하여 new 문자에 추가한다. 그리고 idx를 증가시킨다.
4. 공백인 경우 idx를 0으로 초기화 시킨다. 다음 단어가 시작되기 때문이다. 그리고 공백을 new에 추가한다.