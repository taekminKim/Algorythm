package swea;

import java.util.Scanner;

public class q3282 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int tc = 1; tc <= T; tc++){
			int n = sc.nextInt();
			int k = sc.nextInt();
			int v[] = new int[101];
			int c[] = new int[101];
			int d[][] = new int[1001][101];
			for(int i=1; i<=n; i++){
				v[i] = sc.nextInt();
				c[i] = sc.nextInt();
			}
			//ÀÔ·Â³¡.
			for(int i=1; i<=k; i++){
				for(int j=1; j<=n; j++){
					if(i>=v[j])
						d[i][j] = Math.max(d[i][j-1], d[i-v[j]][j-1]+c[j]);
					else
						d[i][j] = d[i][j-1];
				}
			}
			System.out.println("#"+tc+" "+d[k][n]);
		}
		
	}
}
