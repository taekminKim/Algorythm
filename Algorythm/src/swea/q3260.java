package swea;

import java.math.BigDecimal;
import java.util.Scanner;

public class q3260 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int tc = 1; tc<=T; tc++){
			BigDecimal a = new BigDecimal(sc.next());
			BigDecimal b = new BigDecimal(sc.next());
			BigDecimal res = a.add(b);
			
			System.out.println("#"+tc+" "+res);
			
		}
	}
}
