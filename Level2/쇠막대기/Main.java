import java.util.Stack;

class Main{
    public static void main(String[] args){
        String arrangement = "()(((()())(())()))(())";

        
        int answer = solution(arrangement);
        System.out.println(answer);
    }

    static Stack<Character> stack;
    public static int solution(String arrangement) {
        int answer = 0; // 잘린 쇠막대기 조각의 총 개수
        stack = new Stack<>();

        // stack 에는 '('만 넣는다
        // '()'가 나오기 전에 있는 '('의 개수 만큼 증가시킨다
        // 그러다가 ')'가 나와 닫히면 +1을 해주고 '('을 없앤다.

        char[] temp = arrangement.toCharArray();

        for (int i = 0; i < temp.length; i++) {
            if(temp[i] == '(' && temp[i+1] == ')'){
                answer += stack.size();
                i+=1;
            }
            else if(temp[i] == '('){
                stack.push(temp[i]);
            }
            else if(temp[i] == ')'){
                stack.pop();
                answer += 1;
            }


        }
        return answer;
    }
}