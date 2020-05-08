# <span style="color:orange; font-size:17pt; font-weight:bold">프로그래머스 베스트앨범 자바(java) 풀이</span>
- Level 3
- 해시(Hash)
- [베스트앨범](https://programmers.co.kr/learn/courses/30/lessons/42579)
<br><br>

## [티스토리 주소](https://hoho325.tistory.com/)
<br><br>

# <span style="color: red; font-size:15pt">문제 정리</span>
0. 스트리밍 사이트에서 장르 별로 가장 많이 재생된 노래를  **두개**씩 모아 베스트 앨범을 출시하려고 한다.
1. 속한 노래가 많이 재생된 장르를 먼저 수록합니다.
2. 장르 내에서 많이 재생된 노래를 먼저 수록합니다.
3. 장르 내에서 재생 횟수가 같은 노래 중에서는 고유 번호가 낮은 노래를 먼저 수록한다.
4. 장르 종류는 100개 미만이다.
5. 장르에 속한 곡이 하나라면, 하나의 곡만 선택한다.
6. 모든 장르는 재생된 횟수가 다르다. => 같은 재생횟수를 가지지 않는다
<br><br>

# <span style="color: red; font-size:15pt">Greedy 풀이(Solution)</span>
HashMap 자료구조를 이용하여 문제를 풀 수 있습니다.
1. map2는 장르별 합을 저장하기 위해 사용합니다.
2. map은 장르별 곡의 정보를 담는 arraylist를 담습니다. Info는 곡의 순서 정보와 플레이 횟수를 담습니다.
    이 두 가지 모두 이미 key값이 있다면 arraylist에 값을 넣어주고 그렇지 않으면 arraylist를 새로 만들어 값을 넣어줍니다.
3. 장르별로 어떤 장르가 플레이횟수가 많은지 알기 위햇 list2에 넣어줍니다.
    그리고 comparator를 구현하여 장르를 내림차순으로 정렬합니다.
4. 이제 list2에 정렬된 장르대로 ans에 넣으면 됩니다. 장르에 해당하는 곡 정보들을 빼서 comparator를 구현합니다.
    comparator는 플레이 횟수를 내림차순으로 우선 정렬 후, 플레이 횟수가 같다면 index를 오름차순으로 정렬합니다.
5. 정렬된 상태에서 앞의 두 곡의 index를 ans list에 넣습니다. 만약 곡이 하나 밖에 없다면 한 곡만 넣습니다.
6. 그리고 배열로 반환하기 위해 list를 배열로 변환해줍니다.