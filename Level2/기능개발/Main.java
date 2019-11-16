import java.util.ArrayList;

class Main{
    public static void main(String[] args){
        int[] progresses = {93, 30, 55};
        int[] speeds = {1, 30, 5};

        int[] answer = solution(progresses, speeds);
    }
    
    public static int[] solution(int[] progresses, int[] speeds) {
        ArrayList<Integer> answerList = new ArrayList<>();
        ArrayList<Integer> arrList = new ArrayList<>();

        // 기능마다 걸리는 일 수 계산
        for (int i = 0; i < progresses.length; i++) {
            int cnt = 0;
            while(true){
                progresses[i] += speeds[i];
                cnt++;
                
                if(progresses[i] >= 100){
                    arrList.add(cnt);
                    break;
                }    
            }
        }

        int cnt = 1;
        int j=0;
        while(true){
            if(arrList.get(j) >= arrList.get(j+1)){
                arrList.remove(j+1);
                cnt++;
            }
            else{
                j++;
                answerList.add(cnt);
                cnt = 1;
            }

            if(arrList.size() -1 == answerList.size()){
                answerList.add(cnt);
                break;
            }
        }

        
        // int형 배열로 변환
        int[] answer = new int[answerList.size()];
        for (int i = 0; i < answerList.size(); i++) {
            answer[i] = answerList.get(i);
        }
        return answer;
    }
}