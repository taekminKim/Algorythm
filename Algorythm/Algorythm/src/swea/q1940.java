package swea;

import java.io.IOException;
import java.util.Scanner;

public class q1940 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		for(int tc = 1; tc <= T; tc++){
			int command = sc.nextInt();
			int type = 0;
			int a = 0;
			int temp = 0;
			int distance = 0;
			for(int i=0; i<command; i++){
				type = sc.nextInt();
				if(type ==1 || type ==2)
					temp = sc.nextInt();
				
				if(type ==1){
					a+= temp;
					distance+=a;
				}else if(type ==2){
					a-= temp;
					if(a<0)	a = 0;
					distance+=a;
				}else if(type ==0){
					distance+=a;
				}
				
			}
			System.out.println("#"+tc +" "+distance);
		}
	}
}
