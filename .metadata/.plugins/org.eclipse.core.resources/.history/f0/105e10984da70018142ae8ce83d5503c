package boj;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class q13458 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		int count = 0;
		StringTokenizer st = new StringTokenizer(br.readLine());
		String str1[] = br.readLine().split(" ");
		while(st.hasMoreTokens()){
			int temp = Integer.parseInt(st.nextToken());
			temp-=Integer.parseInt(str1[0]);
			count++;
			int c = Integer.parseInt(str1[1]);
			if(temp%c==0){
				count = count + temp/c;
			}else{
				count = count + temp/c + 1;
			}
		}
		bw.write(count+"");
		bw.flush();
	}
}
