package swea;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class q3499 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		for(int tc = 1; tc<=T; tc++){
			int n = Integer.parseInt(br.readLine());
			int cnt = 0;
			String str[] = br.readLine().split(" ");
			cnt = str.length;
			System.out.print("#"+tc+" ");
			for(int i=0; i< (cnt+1)/2; i++){
				System.out.print(str[i]+" ");
				if(i+(cnt+1)/2 < cnt)
					System.out.print(str[i+(cnt+1)/2]+" ");
			}
			System.out.println();
		}
	}
}
