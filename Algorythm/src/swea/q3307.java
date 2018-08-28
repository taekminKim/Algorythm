package swea;

import java.util.Scanner;

public class q3307 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int tc = 1; tc<= T; tc++){
			int n = sc.nextInt();
			int arr[] = new int[n+1];
			int dp[] = new int[n+1];
			int max = 0;
			dp[0] = 1;
			for(int i=0; i<n; i++){
				arr[i] = sc.nextInt();
			}
			for(int i=1; i<n; i++){
				dp[i] = 1;
				
				for(int j=0; j<i; j++){
					if(arr[i] > arr[j] && dp[j] +1 > dp[i]){
						//증가수열
						dp[i] = dp[j]+1;
					}
				}
				if(max < dp[i]){
					max = dp[i];
				}
				
			}
			System.out.println("#"+tc+" "+max);
		}
	}
}
