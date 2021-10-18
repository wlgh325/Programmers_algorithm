import java.util.ArrayList;
import java.util.Collections;

class Main{
    public static void main(String[] args){
        int[] arr = {5,9,7,10};
        int divisor = 5;
        int[] answer = solution(arr, divisor);
    }

    
    public static int[] solution(int[] arr, int divisor) {
        ArrayList<Integer> arrList = new ArrayList<>();
        
        // 나누어 떨어지는지 확인하여 arrayList에 담기
        for(int i=0; i<arr.length; i++){
            if(arr[i] % divisor == 0){
                arrList.add(arr[i]);
            }
        }
        
        // 나누어 떨어지는 수가 없는 경우 예외처리
        if(arrList.size() == 0)
            arrList.add(-1);
        else
            //sorting
            Collections.sort(arrList);
        
        // 배열로 변환
        int[] answer = new int[arrList.size()];
        for(int i=0; i<arrList.size(); i++){
            answer[i] = arrList.get(i);
        }
        return answer;
    }
}
