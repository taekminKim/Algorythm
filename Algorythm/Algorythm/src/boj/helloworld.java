package boj;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class helloworld {
	public static void main(String[] args) throws IOException {
		System.out.println("!");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		String str1[] = br.readLine().split(" ");
		int arr[] = new int[N];
		for(int i=0; i<N; i++){
			arr[i]= Integer.parseInt(str1[1]);
		}
		String str2[] = br.readLine().split(" ");
		int main = Integer.parseInt(str2[0]);
		int support = Integer.parseInt(str2[1]);
		long result = 0;
		for(int i=0; i<N; i++){
			result++;
			arr[i] -= main;
			if(arr[i]>0)
				result += (arr[i]/support) + (arr[i]%support >0 ? 1 : 0);
		}
		bw.write(String.valueOf(result));
		bw.flush();
	} 
}
