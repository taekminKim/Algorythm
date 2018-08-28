package swea;

import java.util.Scanner;

public class q3975 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int tc = 1; tc<=T; tc++){
			double a = sc.nextDouble();
			double b = sc.nextDouble();
			double c = sc.nextDouble();
			double d = sc.nextDouble();
		
			double temp1 = a/b;
			double temp2 = c/d;
			
			if(temp1>temp2){
				System.out.println("#"+tc+" "+"ALICE");
			}else if(temp1<temp2){
				System.out.println("#"+tc+" "+"BOB");
			}else{
				System.out.println("#"+tc+" "+"DRAW");
			}
		}
	}
}
