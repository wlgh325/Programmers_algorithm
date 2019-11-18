import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

class Main{
    public static void main(String[] args){
        int[] arr = {1,1,3,3,0,1,1};

        int[] answer = solution(arr);
        System.out.println("");
    }

    
    public static int[] solution(int []arr) {
        ArrayList<Integer> arrList = new ArrayList<>();
        
        for(int i=0; i<arr.length-1; i++){
            if(arr[i] != arr[i+1]){
                arrList.add(arr[i]);
            }
        }
        
        arrList.add(arr[arr.length-1]);

        for (int j = 0; j < arrList.size(); j++) {
            answer[j] = arrList.get(j);
        }

        // stream으로도 가능
        // Integer [] temp = arrList.toArray(new Integer[arrList.size()]);
        // return Arrays.stream(temp).mapToInt(Integer::intValue).toArray();
        return answer;
	}
}