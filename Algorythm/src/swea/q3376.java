package swea;

import java.util.Scanner;

public class q3376 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		long dp[] = new long[101];
		dp[1] = dp[2] = dp[3] = 1;
		dp[4] = dp[5] = 2;
		dp[6] = 3;
		for(int tc = 1; tc<=T; tc++){
			int N = sc.nextInt();
			
			for(int i=7; i<=N; i++){
				dp[i] = dp[i-1] + dp[i-5];
			}
			System.out.println("#"+tc+" "+dp[N]);
		}
	}
}
