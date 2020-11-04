class Main {

	/*
	 * 정수 n
	 * 밑변의 길이와 높이가 n
	 * 맨 위 부터 반시계 방향으로 숫자를 채움
	 * 첫 행 부터 마지막 행 까지 모두 순서대로 합침
	 */
	public static void main(String[] args) throws Exception {
		int[] ans = solution(5);
		for(int i=0; i<ans.length; i++) {
			System.out.println(ans[i]);
		}
	}
	
	public static int[] solution(int n) {
		int[][] arr = new int[n][n];
		int[] steps = new int[n];
		
		// n에 따른 방향전환 까지 필요한 step 수
		steps[0] = n-1;
		for(int i=1; i<n; i++) {
			steps[i] = n-i;
		}
		
		int dir = 0;	// 방향
		int x = 0;		// x pos
		int y = 0;		// y pos
		int num = 1;	// 넣을 숫자
		int step = 0;	// 단계
		int cnt = 0;	// step수
		
		int finish = n*(n+1)/2;	// 마지막 수
		while(true) {
			if(num == finish+1) break;
			
			arr[x][y] = num++;	// 수를 넣음
		
			// 아래로 이동
			if(dir == 0) {
				if(cnt == steps[step]) {
					// step 단계의 모든 step을 이동했다면 방향 전환
					// 방향 전환하고 바로 한칸 이동 하므로 cnt++
					// 단계 증가: step++
					// 방향 전환: dir = 1
					dir = 1;
					cnt = 1;
					y++;
					step++;
				}else {
					// 아래, x++
					x++;
					cnt++;					
				}
			}
			else if(dir == 1) {
				// 오른쪽 이동
				if(cnt == steps[step]) {
					dir = 2;
					cnt = 1;
					x--;y--;
					step++;
				}
				else {
					// 오른쪽, y++
					y++;
					cnt++;					
				}
				
			}
			else if(dir == 2){
				// 왼쪽 위 대각선 이동
				if(cnt == steps[step]) {
					dir = 0;
					cnt = 1;
					x++;
					step++;
				}
				else {
					// 왼쪽 위 대각선, x--, y--
					x--; y--;
					cnt++;
				}
			}
		}
		
		int[] ans = new int[num-1];
		int idx = 0;
		for(int i=0; i<n; i++) {
			for(int j=0; j<i+1; j++) {
				ans[idx++] = arr[i][j];
			}
		}
		return ans;
	}
}