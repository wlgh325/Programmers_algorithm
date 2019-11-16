class Main{
    public static void main(String[] args){
        int[] price = {1,2,3,2,3};
        int[] answer = solution(price);
    }

    public static int[] solution(int[] price) {
        int[] answer = new int[price.length];
        
        for (int i = 0; i < price.length; i++) {
            int count = 0;
            for (int j = i+1; j < price.length; j++) {
                if(price[i] <= price[j]){
                    count++;
                }
                else{
                    count++;
                    break;
                }
            }
            answer[i] = count;    
        }
        return answer;
    }
}