# <span style="color:orange; font-size:17pt; font-weight:bold">프로그래머스 최댓값과 최솟값 c++ 풀이</span>
- Level 2
- 연습문제
- [최댓값과 최솟값](https://programmers.co.kr/learn/courses/30/lessons/12939)
<br><br>

## [티스토리 주소](https://hoho325.tistory.com/)
<br><br>

# <span style="color: red; font-size:15pt">문제 정리</span>
1. 문자열 s에는 공백으로 구분된 숫자가 있다.
2. str에 나타나는 숫자중 최대, 최소 값을 찾아 "(최소값) (최댓값)" 형태로 반환해라
3. 문자열에는 둘 이상의 정수가 공백으로 구분되어 있다.
<br><br>

# <span style="color: red; font-size:15pt">문제 풀이</span>
1. 문자를 공백을 기준으로 나눈다.
2. 나눠진 수를 차례대로 하나씩 숫자로 변환해본다.
3. min, max와 비교해서 업데이트 해준다.
4. 최종 min, max 값을 string으로 변환하여 정답을 완성한다.
<br><br>

# <span style="color: red; font-size:15pt">c++ 문자열 split</span>
sstream 헤더에 있는 istringstream 을 이용해서 나눌 수 있다.
1. istringstream ss(split할 문자열)을 선언한다
2. 자를 문자를 담을 string buffer를 선언한다(string sb;)
3. getline을 이용해서 split 한다.
    getline(ss, sb, 자를 기준 문자)
    공백기준 getline(ss, sb, ' ');
    '/'기준 getlin(ss, sb, '/');
<br><br>

# <span style="color: red; font-size:15pt">c++ 숫자 - 문자 </span>
1.1 숫자를 문자로 (c style)
```
#include <stdlib.h> // #include <cstdlib>
#include <string>
    string s = "1";
    int a = atoi(s.c_str());    // c style의 문자열(char *)로 변환 후 atoi 함수 사용
```

1.2 숫자를 문자로 (c++ style)
```
#include <string>
    string s = "1";
    int a = stoi(s);
```
<br><br>