import java.util.Arrays;

class Solution2 {
    public static void main(String[] args){
        String s = "BBABA"; //6
        String s2 = "BBBAAB";   //9
        String s3 = "BBAABAA";  //7
        String s4 = "BBAABBB";  //10
        String s5 = "BBAABAAAA";    //7
        String s6 = "BBAABAAAAB";   //12
        String s7 = "CANAAAAANAN";  //48

        System.out.println(solution2(s));
        System.out.println(solution2(s2));
        System.out.println(solution2(s3));
        System.out.println(solution2(s4));
        System.out.println(solution2(s5));
        System.out.println(solution2(s6));
        System.out.println(solution2(s7));
    }

    public static int solution(String name) {
        int ans = 0;
        int len = name.length();

        char[] arr = name.toCharArray();
        String compare = "";
        for(int i=0; i<len; i++)
            compare += "A";

        // cnt 만큼의 문자를 바꾸어야 함
        int idx = 0;
        while(true){
            int left = 1;
            int right = 1;

            if(arr[idx] != 'A'){
                int temp = Math.min(arr[idx] - 'A', 'Z' - arr[idx] + 1);
                ans += temp;
            }
            arr[idx] = 'A';

            if(String.valueOf(arr).equals(compare))
                break;
            
            // 오른쪽으로 A가 아닌 문자가 나올때까지 이동
            for(int i=1; i<len; i++){
                if(idx+i < len){
                    if(arr[idx+i] != 'A'){
                        break;
                    }
                    right++;
                }
                else{
                    // 오른쪽에서 왼쪽으로 가는건 불가능
                    right = Integer.MAX_VALUE;
                    break;
                }
            }

            // 왼쪽으로 이동
            for(int i=1; i<len; i++){
                if(idx-i >= 0){
                    if(arr[idx-i] != 'A'){
                        break;
                    }
                    left++;
                }
                else{
                    int tmp = idx-i+len;
                    if(arr[tmp] != 'A'){
                        break;
                    }
                    left++;
                }
            }

            if(right > left){
                ans += left;
                idx -=left;

                if(idx < 0)
                    idx = idx+len;
            }
            else{
                ans += right;
                idx += right;
            }
        }
        return ans;
    }

    public static int solution2(String name) {
        int ans = 0;
        int len = name.length();

        char[] arr = name.toCharArray();
        int idx = 0;

        // 오른쪽으로 쭉 이동
        int ans1 = 0;
        char[] copy = new char[len];
        Arrays.fill(copy, 'A');

        while(true){
            if(arr[idx] != 'A'){
                int temp = Math.min(arr[idx] - 'A', 'Z' - arr[idx] + 1);
                ans1 += temp;
                copy[idx] = arr[idx];
            }
            
            if(String.valueOf(copy).equals(name))
                break;

            idx++;
            ans1++;
        }
       
        // 왼쪽으로 쭉 이동
        int ans2 = 0;
        idx = 0;
        Arrays.fill(copy, 'A');
        while(true){
            if(arr[idx] != 'A'){
                int temp = Math.min(arr[idx] - 'A', 'Z' - arr[idx] + 1);
                ans2 += temp;
                copy[idx] = arr[idx];
            }
            if(String.valueOf(copy).equals(name))
                break;
            idx--;
            if(idx < 0)
                idx = idx +len;
            ans2++;
        }

        // 오른쪽으로 갔다가 왼쪽으로 이동
        int ans3 = Integer.MAX_VALUE;
        // i번째에서 꺾음
        for(int i=0; i<len; i++){
            idx = 0;
            Arrays.fill(copy, 'A');
            boolean dir = false;
            int ans_t = 0;
            while(true){
                if(arr[idx] != 'A' && copy[idx] != arr[idx]){
                    int temp = Math.min(arr[idx] - 'A', 'Z' - arr[idx] + 1);
                    ans_t += temp;
                    copy[idx] = arr[idx];
                }

                if(String.valueOf(copy).equals(name))
                    break;
                
                // 방향 전환
                if(idx==i)
                    dir = true;

                if(!dir)
                    idx++;
                else
                    idx--;
                
                // 오른쪽 끝으로 이동
                if(idx < 0)
                    idx += len;
                ans_t++;
            }
            ans3 = ans_t > ans3 ? ans3 : ans_t;
        }

        // 왼쪽으로 갔다가 오른쪽으로 이동
        int ans4 = Integer.MAX_VALUE;
        // i번째에서 꺾음
        for(int i=5; i>=0; i--){
            idx = 0;
            Arrays.fill(copy, 'A');
            boolean dir = false;
            int ans_t = 0;
            while(true){
                if(arr[idx] != 'A' && copy[idx] != arr[idx]){
                    int temp = Math.min(arr[idx] - 'A', 'Z' - arr[idx] + 1);
                    ans_t += temp;
                    copy[idx] = arr[idx];
                }

                if(String.valueOf(copy).equals(name))
                    break;
                
                // 방향 전환
                if(idx==i)
                    dir = true;

                if(!dir)
                    idx--;
                else
                    idx++;
                
                // 오른쪽 끝으로 이동
                if(idx < 0)
                    idx += len;
                
                // 오른쪽끝에서 왼쪽끝으로 갈수는 없음
                if(idx >= len)
                    break;
                ans_t++;
            }

            // 오른쪽 끝에서 끝난 경우는 같지 않을 수 있음
            // 같은 경우에만 업데이트
            if(String.valueOf(copy).equals(name))
                ans4 = ans_t > ans4 ? ans4 : ans_t;
        }

        ans = Math.min(ans1, Math.min(ans2, Math.min(ans3, ans4)));
        return ans;
    }
}