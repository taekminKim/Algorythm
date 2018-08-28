package swea;

import java.util.Scanner;

public class q4751 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		for(int tc = 1; tc<= t; tc++){
			char st[] = sc.next().toCharArray();
			int length = st.length;
			char arr[][] = new char[3][500];
			int i=0;
			int j =0;
			arr[0][j++] = '.';
			arr[0][j++] = '.';
			arr[0][j++] = '#';
			for(i=0; i<length -1; i++){
				arr[0][j++] = '.';
				arr[0][j++] = '.';
				arr[0][j++] = '.';
				arr[0][j++] = '#';
			}
			arr[0][j++] = '.';
			arr[0][j++] = '.';
			arr[0][j++] = '\0';

			for(i = 0, j=0; i<length*2; i++){
				arr[1][j++] = '.';
				arr[1][j++] = '#';
			}
			arr[1][j++] = '.';
			arr[1][j++] = '\0';
			for(i=0, j = 0; i<length;){
				arr[2][j++] = '#';
				arr[2][j++] = '.';
				arr[2][j++] = st[i++];
				arr[2][j++] = '.';
			}
			arr[2][j++] = '#';
			arr[2][j++] = '\0';
			System.out.println(arr[0]);
			System.out.println(arr[1]);
			System.out.println(arr[2]);
			System.out.println(arr[1]);
			System.out.println(arr[0]);
		}
	}
}

