package swea;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class q4789 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int T = Integer.parseInt(br.readLine());

		for (int tc = 1; tc <= T; tc++) {
			String str = br.readLine();
			int res = 0;

			for (int i = 0; i < str.length(); i++) {
				if (str.charAt(i) == 0) {
					res++;
				} else if (res > i) {
					res += str.charAt(i) - 0;
				} else {
					
				}
			}
			System.out.println();

		}

	}
}