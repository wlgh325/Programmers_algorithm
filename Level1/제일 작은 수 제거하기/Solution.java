class Solution {
    public static void main(String[] args){
        int[] arr = {4,3,2,1};
        int[] arr2 = {10};

        // debug
        int[] ans = solution(arr);
        for(int i=0; i<ans.length; i++)
            System.out.print(ans[i] + " ");
        System.out.println();
    }
    
    public static int[] solution(int[] arr) {
        if(arr.length == 1){
            int[] ans = {-1};
            return ans;
        }
        
        int min = Integer.MAX_VALUE;
        int idx = 0;
        
        for(int i=0; i<arr.length; i++){
            if(min > arr[i]){
                idx = i;
                min = arr[i];
            }
        }

        int len = arr.length;
        int[] ans = new int[len-1];
        int i = 0;
        int j = 0;
        // 4 3 2
        while(j < len-1){
            if(idx != i){
                ans[j] = arr[i];
                j++;
            }
            
            i++;
        }
        return ans;
    }
}