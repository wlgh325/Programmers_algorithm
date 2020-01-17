class Main{
    public static void main(String[] args){
        int a = 5, b = 24;

        System.out.println(solution(a,b));
        
    }

    
    public static String solution(int a, int b) {
        String answer = "";
        int[] month = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        
        int day = 0;
        for(int i=0; i<a-1; i++){
            day += month[i];
        }
        day += b - 1;
        
        switch(day % 7){
            case 0:
                answer = "FRI";
                break;
            case 1:
                answer = "SAT";
                break;
            case 2:
                answer = "SUN";
                break;
            case 3:
                answer = "MON";
                break;
            case 4:
                answer = "TUE";
                break;
            case 5:
                answer = "WED";
                break;
            case 6:
                answer = "THU";
                
        }
        return answer;
    }
}
