package swea;

import java.util.Scanner;

public class q4299 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int D = 11;
		int H = 11;
		int M = 11;
		int T = sc.nextInt();
		for(int tc = 1; tc<=T; tc++){
			int d = sc.nextInt();
			int h = sc.nextInt();
			int m = sc.nextInt();
			int temp1 = D*24*60 + H*60 + M;
			int temp2 = d*24*60 + h*60 + m;
			
			if(temp2 - temp1 >=0){
				System.out.println("#"+tc+" "+(temp2-temp1));
			}else{
				System.out.println("#"+tc+" "+"-1");
			}
		}
	}
}
