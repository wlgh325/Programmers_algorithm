class Solution {
  public double solution(int[] arr) {      
      double sum = 0;
      for(int num : arr)
          sum += num;
      return sum / arr.length;
  }
}