import java.util.*;

public class Solution {
	
	public static int solution(int n) {
		int ans = 1;
		
		if(n == 1) return 1;
		
		// 순간이동을 위해서 처음에 무조건 한칸 이동
		int step = n;
		while(step != 1) {
			if(step % 2 == 0) {
				// 짝수
				if(step==2) break;
				
				step = step / 2;
			}
			else {
				// 홀수
				// -1한수의 절반
				step = (step-1)/2;
				ans++;
			}
		}
		
		return ans;
	}
}