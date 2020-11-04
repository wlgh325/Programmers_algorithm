import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

class Solution {
	public static int[] solution(int[] numbers) {
		HashSet<Integer> set = new HashSet<>();
		
		int size = numbers.length;
		for(int i=0; i<size; i++) {
			for(int j=0; j<size; j++) {
				if(i != j)
					set.add(numbers[i] + numbers[j]);
			}
		}
		
		
		int[] ans = new int[set.size()];
		
		Iterator<Integer> iter = set.iterator();
		
		int i = 0;
		while(iter.hasNext()) {
			int a = iter.next();
			ans[i++] = a;
		}
		Arrays.sort(ans);
		return ans;
	}
}