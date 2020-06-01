# <span style="color:orange; font-size:17pt; font-weight:bold">프로그래머스 가장 큰 정사각형 찾기 자바(java) 풀이</span>
- Level 2
- 연습문제
- [가장 큰 정사각형 찾기](https://programmers.co.kr/learn/courses/30/lessons/12905)
<br><br>

## [티스토리 주소](https://hoho325.tistory.com/)
<br><br>

# <span style="color: red; font-size:15pt">문제 정리</span>
1. 1과 0으로 채워진 표가 있다.
2. 표 1칸은 1x1의 정사각형으로 이루어져 있다.
3. 1로 이루어진 가장 큰 정사각형을 찾아 넓이를 return 하여라
<br><br>

# <span style="color: red; font-size:15pt">naive한 문제 풀이</span>
처음에는 정말 naive하게 5중 for문을 이용해서 풀어보았습니다.  
정확성은 모두 맞추었지만 역시나 효율성 테스트는 통과하지 못했습니다.  
최대 크기의 board에서 우측하단 하나만 0인 경우 이런 경우 터질 것 같습니다.  
naive한 코드는 아래와 같습니다.
```java
public static  int solution(int [][]board) {
        int x_len = board.length;
        int y_len = board[0].length;
        int side_len = Math.min(x_len, y_len);

        for(int len=side_len; len>=1; len--){
            for(int i=0; i<=x_len-len; i++){
                for(int j=0; j<=y_len-len; j++){
                    int height = 0;
                    for(int x=i; x<i+len && x <x_len; x++){
                        int width = 0;
                        for(int y=j; y<j+len && y < y_len; y++){
                            if(board[x][y] == 1)
                                width++;
                            else
                                break;
                        }

                        if(width != len)
                            break;                  
                        else
                            height++;
                    }

                    if(height == len)
                        return len*len;
                }
            }
        }

        return 0;
    }
```
<br><br>

# <span style="color: red; font-size:15pt">DP 방식 풀이</span>
그래서 이전의 길이를 저장할 필요가 있다고 생각하였고 dp 방식으로 풀어보려 했습니다.  
정사각형의 크기를 우측 하단을 기준으로 찾아갑니다.  
아래와 같이 있다고 가정하겠습니다.
```
0 0 1 1 1
1 0 1 1 1
```
1. (1,1)부터 봅니다. (1,1)의 값은 0이므로 정사각형을 이룰 수 없습니다.
2. (1,2)를 봅니다. 1이므로 정사각형을 이룰 가능성이 있습니다. 왼쪽, 위, 좌측 대각선을 확인해서 가장 작은 값을 찾습니다. 그 값에 1을 더해서 (1,2)에 저장합니다. 1을 더하는 이유는 변의 길이를 증가시키기 위해서입니다.
3. (1,3)을 봅니다. 1이므로 정사각형이 될 수 있습니다. 마찬가지로 주위에서 가장 작은 값을 찾아 1을 더합니다. 그 값을 (1,3)에 저장합니다. 그러면 다음과 같이 변합니다. 즉 길이가 2인 정사각형 하나를 찾은 것입니다.
```
0 0 1 1 1
1 0 1 2 1
```
4. 최종적으로 다음과 같이 됩니다. 길이가 2인 정사각형 2개를 찾은것입니다.
```
0 0 1 1 1
1 0 1 2 2
```
5. 이렇게 값을 갱신해가며 최대 길이를 찾아갑니다.
6. 그리고 모두 0인 board가 주어진 경우 예외 처리 하기 위해 1인 값이 하나도 없다면 0을 return 합니다.