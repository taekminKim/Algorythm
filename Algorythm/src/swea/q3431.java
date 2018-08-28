package swea;

import java.util.Scanner;

public class q3431 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int tc = 1; tc<=T; tc++){
			int res = 0;
			int L = sc.nextInt(); //300 
			int U = sc.nextInt(); //400
			int X = sc.nextInt(); //240
			//L분 이상 U분 이하 운동을해야함
			if(X > U){
				res = -1;
			}else if(X<L){
				res =L-X;
			}
			System.out.println("#"+ tc+" "+res);
		}
	}
}
