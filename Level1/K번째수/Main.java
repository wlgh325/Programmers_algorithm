import java.util.Arrays;

class Main{
    public static void main(String[] args){
        int[] array = {1,5,2,6,3,7,4};
        int[][] commands = {{2,5,3},
                            {4,4,1},
                        {1,7,3}};

        int[] answer = solution(array, commands);
    }
    
    public static int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        // 자른 배열
        for (int i = 0; i < answer.length; i++) {
            int[] temp = new int[commands[i][1] - commands[i][0] + 1];

            for (int j = commands[i][0] - 1, k=0 ; j < commands[i][1]; j++, k++) {
                temp[k] = array[j];
            }
            // sorting
            Arrays.sort(temp);

            answer[i] = temp[commands[i][2] - 1];
        }
        
        return answer;
    }
}