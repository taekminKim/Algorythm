package swea;

import java.util.Scanner;

public class q3314 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int tc = 1; tc <= T; tc++){
			int arr[] = new int[5];
			int sum = 0;
			for(int i=0; i<5; i++){
				arr[i] = sc.nextInt();
				if(arr[i] < 40)
					arr[i] = 40;
				
				sum+=arr[i];
			}
			System.out.println("#"+ tc+" "+sum/5);
			
		}
	}
}
