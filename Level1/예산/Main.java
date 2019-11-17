import java.util.Arrays;

class Main{
	public int solution(int[] d, int budget) {
		int num = 0;
		int sum = 0;

		Arrays.sort(d);
		
		for (int i = 0; i < d.length; i++) {
			if(sum + d[i] <= budget){
				sum += d[i];
				num++;
			}
			else
				break;
		}

		return num;
	}
}