package swea;

import java.util.Scanner;

public class q1285 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int tc = 1; tc <= T; tc++){
			int n = sc.nextInt();
			int arr[] = new int [n];
			int count = 0;
			int min = 100000;
			for(int i=0; i<n; i++){
				arr[i] = sc.nextInt();
				if(min > Math.abs(arr[i])){
					count = 1;
					min = Math.abs(arr[i]);
				}else if(min == Math.abs(arr[i])){
					count++;
				}
			}
			System.out.println("#"+tc+" "+min+" "+count);
		}
		
	}
}
