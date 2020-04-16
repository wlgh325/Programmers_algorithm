import java.util.*;

class Solution {
    public static void main(String[] args){
        int[] numbers = {0,0,0};
        
        int[] numbers2 = {3,30,34,5,9};
        System.out.println(solution(numbers));
        System.out.println(solution(numbers2));
    }

    public static String solution(int[] numbers) {
        String answer = "";
        
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i<numbers.length; i++)
            list.add(numbers[i]);

        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer a, Integer b){
                String s = String.valueOf(a);
                String s2 = String.valueOf(b);
                return ((s2+s)).compareTo(s+s2);
            }
        });
        
        for(int i=0; i<list.size(); i++)
            answer += String.valueOf(list.get(i));

        if(answer.charAt(0) == '0')
            answer = "0";
        return answer;
    }
}