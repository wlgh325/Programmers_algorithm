class Solution {
  public String solution(int n) {
      String answer = "";
      // 길이만큼 "수박" 붙이기
      int i = n/2;
      while(i>0){
          answer += "수박";
          i--;
      }

      // 그렇지 않은 경우 수만 나중에 따로 붙이기
      if(n %2 != 0)
        answer += "수";
      return answer;
  }
}