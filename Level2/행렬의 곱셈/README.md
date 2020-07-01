# <span style="color:orange; font-size:17pt; font-weight:bold">프로그래머스 행렬의 곱셈 c++ 풀이</span>
- Level 2
- 연습문제
- [행렬의 곱셈](https://programmers.co.kr/learn/courses/30/lessons/12949)
<br><br>

## [티스토리 주소](https://hoho325.tistory.com/)
<br><br>

# <span style="color: red; font-size:15pt">문제 정리</span>
1. 2차원 행렬 arr1, arr2가 주어질때 두 행렬을 곱한 결과를 반환하는 함수를 작성하여라
2. 행과 열의 길이는 2 이상 100 이하이다. (최대 100x100)
3. 행렬의 원소는 -10 이상 20 이하의 자연수이다.
4. 곱할 수 있는 배열만 주어진다.
<br><br>

# <span style="color: red; font-size:15pt">문제 풀이</span>
20^2 x 100 = 400 x 100 = 40000으로 int형으로 가능  
이 문제는 단순히 행렬 곱셈의 개념만 알고 있다면 풀 수 있습니다.  
2차원 벡터를 다루는 문제로 좋은 예제라고 생각합니다.  (실제로 제가 그랬음)  
왼쪽 행렬의 i행, 오른쪽 행려의 j열을 sumproduct 하면 새로운 행렬의 (i,j) 위치의 값이 됩니다.  
예를들어 arr1의 1행, arr2의 2열을 sumproduct 하면 ans[1][2] 의 값이 됩니다.
<br><br>

# <span style="color: red; font-size:15pt">2차원 벡터 초기화</span>
```
// 잘못된 예
vector<vector<int>> ans;
```
2차워 벡터에 배열 인덱싱을 이용해서 배열의 요소에 바로 접근하려 하면 'vector subscript out of range' 라는 에러가 발생합니다.  
그렇기 때문에 크기를 잡고 초기화를 하는 과정을 거칩니다.

```
// int ans[arr1.size()][arr2[0].size] 을 모두 0으로 초기화
vector<vector<int>> ans(arr1.size(), vector<int>(arr2[0].size(), 0));
```
위와 같이 하면 ans[i][j] = sum 에서 에러가 발생하지 않습니다.

왜 그런지는 vector에 대해 더 공부하며 알아가야 겠습니다.... (c++ 로 푼지 3일 밖에 안됨...)
<br><br>