package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * BOJ#14501 ���
 * https://www.acmicpc.net/problem/14501
 */

public class q14501 {

    static final int INF = 10000000;

    static int[] T = new int[16];
    static int[] P = new int[16];
    static int[] dp = new int[16];
    static int N;

    static {

        Arrays.fill(dp, -1);
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());

        for (int i = 1; i < N + 1; i++) {

            StringTokenizer st = new StringTokenizer(br.readLine());
            T[i] = Integer.parseInt(st.nextToken());
            P[i] = Integer.parseInt(st.nextToken());
        }

        System.out.println(solve(1));
    }

    // return dp[idx] : ��¥�� idx�϶� ���� �� ���� �� �ִ� �ݾ��� �ִ밪
    static int solve(int idx) {

        // ���� ��� : ��¥�� N+1�� ��
        if (idx == N + 1) return 0;

        // ���� ��� : ��¥�� N+1�� ���� ���
        if (idx > N + 1) return -INF;

        // memoization
        if (dp[idx] != -1) return dp[idx];

        return dp[idx] = Math.max(solve(idx + 1), solve(idx + T[idx]) + P[idx]);
    }
}

