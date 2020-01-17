# 프로그래머스(Programmers) 코딩테스트 연습
## LEVEL 1 나누어 떨어지는 숫자 배열 연습 문제 자바(JAVA) 풀이
https://programmers.co.kr/learn/courses/30/lessons/12910

## 티스토리 주소
- https://hoho325.tistory.com/65?category=819057

## solution 함수만 확인하시면 됩니다!!

## 문제 풀이
1. for문을 순회하며 숫자가 나누어 떨어지는지 구한다
2. sorting을 한다
3. 배열에 다시 담아 반환한다

## arrayList 와 Collections 이용
> 나누어 떨어지는 숫자들을 모두 arraylist에 담는다
그리고 나누어 떨어지는 수가 없는 경우 예외 처리를 위해서
arraylist의 길이를 확인하여 없는 경우 -1을 넣어줍니다

arraylist를 sorting할때는 Collections의 sort 함수를 이용하면 됩니다
이는 java.util안에 있습니다
