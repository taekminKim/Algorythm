package swea;

import java.io.IOException;
import java.util.Scanner;

public class q1204 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		Scanner sc = new Scanner(System.in);
		for(int tc = 0; tc<10; tc++){
			
			int score[] = new int[101];
			int temp=0;
			int max = 0;
			int max_s = 0;
			
			temp = sc.nextInt();
			for(int i=0; i<1000; i++){
				temp = sc.nextInt();
				score[temp]++;
			}
			for(int i=0; i<101; i++){
				if(score[i]>=max_s){
					max = i;
					max_s = score[i];
				}
			}
			System.out.println("#"+(tc+1)+" "+max);
		}
	}
}
