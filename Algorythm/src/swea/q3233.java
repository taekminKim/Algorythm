package swea;

import java.util.Scanner;

public class q3233 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T  = sc.nextInt();
		
		for(int tc = 1; tc<=T; tc++){
			long a = sc.nextLong();
			long b = sc.nextLong();
			if(b!=1){
				a/=b;
			}
			System.out.println("#"+tc+" "+(a*a));
		}
	}
}
