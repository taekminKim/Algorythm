package swea;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class q5215 {
	static int score[];
	static int cal[];
	static int N;
	static int Cal;
	static int max;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		
		for(int tc = 1; tc<=T; tc++){
			String str[] = br.readLine().split(" ");
			N = Integer.parseInt(str[0]);
			Cal = Integer.parseInt(str[1]);
			score = new int[N];
			cal = new int[N];
			for(int i=0; i<N; i++){
				str = br.readLine().split(" ");
				score[i] = Integer.parseInt(str[0]);
				cal[i] = Integer.parseInt(str[1]);
			}
			max = 0;
			boolean check[] = new boolean[N];
			solve(0,0,0);
			System.out.println("#"+tc +" " + max);
		}
	}
	private static void solve(int index, int sc, int k){
		if(k > Cal){
			return;
		}
		if(index==N){
			max = Math.max(max, sc);
			return;
		}
		solve(index+1, sc+score[index], cal[index]+k);
		solve(index+1, sc, k);
	}
	
}
