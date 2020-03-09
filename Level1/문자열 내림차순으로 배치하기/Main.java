class Solution {
  public String solution(String s) {
      String answer = "";

      // 버블 sort
      for(int i=0; i<s.length()-1; i++){
          for(int j=i+1; j<s.length(); j++){
              // 뒤의 문자가 더 크다면(아스키 코드) 자리를 바꿔준다
              if(s.charAt(i) < s.charAt(j)){
                s = s.substring(0,i) + s.substring(j,j+1) + s.substring(i+1,j) + s.substring(i,i+1) + s.substring(j+1,s.length());
              }
          }
      }
      answer = s;
      return answer;
  }
}

class Solution {
    public String solution(String s){
        String answer = "";
        char[] arr = s.toCharArray();
        // 문자 오름차순 정렬
        Arrays.sort(arr);
        
        // 거꾸로 넣기
        for(int i=arr.length-1; i>=0; i--)
        	answer += arr[i];    
		return answer;
    }
}