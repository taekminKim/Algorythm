package swea;

import java.io.IOException;
import java.util.Scanner;

public class q3304 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		Scanner sc = new Scanner(System.in);
		int T= sc.nextInt();
		for(int tc = 1; tc<=T; tc++){
			char arr1[] = sc.next().toCharArray();
			char arr2[] = sc.next().toCharArray();
			int dp[][] = new int[1002][1002];
			dp[0][0] = 0;
			
			for(int i=1; i<=arr1.length; i++){
				for(int j=1; j<=arr2.length; j++){
					if(arr1[i-1]==arr2[j-1])
						dp[i][j] = dp[i-1][j-1]+1;
					else
						dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
				}
			}
			System.out.println("#"+tc+" "+dp[arr1.length-1][arr2.length-1]);
		}
	}
}
