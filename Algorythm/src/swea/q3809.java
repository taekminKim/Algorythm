package swea;

import java.util.Scanner;

public class q3809 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		int arr[];
		int remain[];
		for(int tc = 1; tc<=T; tc++){
			int count = 0;
			int N = sc.nextInt();
			arr = new int[N];
			remain = new int[10];
			for(int i=0; i<N; i++){
				int temp =sc.nextInt();
				arr[i] = temp;
				if(arr[i]==0){
					remain[i]++;
				}else{
					while(temp>0){
						remain[temp%10]++;
						temp/=10;
					}
				}
			}
			while(true){
				
			}
			
			
			
		}
	}
}
