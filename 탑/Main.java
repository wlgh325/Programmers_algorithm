class Main{
    public static void main(String[] args){
        int[] heights = {6,9,5,7,4};
        int[] heights2 = {3,9,9,3,5,7,2};
        int[] heights3 = {1,5,3,6,7,6,5};

        int[] answer = solution(heights);
        System.out.println("");
    }

    public static int[] solution(int[] heights) {
        int len = heights.length;
        int[] answer = new int[len];

        for (int i = len-1; i > 0 ; i--) {
            int idx = 0;
            int check = 0;
            for (int j = i-1; j >= 0; j--) {
                if(heights[j] > heights[i]){
                    idx = j + 1;
                    break;
                }
                else{
                    check++;
                }
            }
            if(check == i)
                answer[i] = 0;
            else
                answer[i] = idx;
        }

        answer[0] = 0;
        return answer;
    }
}