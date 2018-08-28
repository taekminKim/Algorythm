package swea;

import java.util.Scanner;

public class q3750 {
	static int res;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = Integer.parseInt(sc.nextLine());
		for (int tc = 1; tc <= T; tc++) {
			String str = sc.nextLine(); //n�Է�
			res = 0;
			solve(str);
			System.out.println("#"+tc+" "+res);
		}
	}
	
	public static void solve(String str){
		int l = str.length();
		int sum = 0;
		for(int i=0; i<l ; i++){
			sum+=Integer.valueOf(str.charAt(i)-48);
		}
		if(sum<10){
			res = sum;
		}else{
			str = String.valueOf(sum);
			solve(str);
		}
	}

}