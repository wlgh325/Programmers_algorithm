class Solution {
  public String solution(String[] seoul) {
      String answer = "김서방은 ";
      int idx = 0;  // "kim"문자 위치 저장할 변수

      // 배열 탐색
      for(int i=0; i<seoul.length; i++){
        // Kim 문자를 발견하면 index 저장하고 break
          if(seoul[i].equals("Kim")){
              idx = i;
              break;
          }
      }
      answer += idx + "에 있다";
      return answer;
  }
}