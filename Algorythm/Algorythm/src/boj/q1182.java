package boj;

import java.util.Scanner;
 
public class q1182 {
 
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s = sc.nextInt();
        int[] arr = new int[n];
        int result = 0;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        //i�� 0000~1111����
        for (int i = 1; i < 1 << n; i++) {
 
            int bit = i;
            //0000 �� 
            //bit!=0 �� ���߿� �Ұ� ������ �� 0000111 �ϋ� 1�̰� ���� 0�̹Ƿ� �� �ʿ䰡 ����.
            for (int j = 0; bit != 0; j++, bit >>= 1) {
 
 
                //ù��° �ڸ��� 0�̸� j�� �����ʿ䰡 ����. ex) 10010�϶� j�� �ڸ��� 0�̹Ƿ� ���� �ʿ䰡 ���� �����̴�.
                if ((1 & bit) == 0){
                    continue;
                }
                sum = sum + arr[j];
            }
            if (sum == s) {
                result++;
            }
            sum = 0;
        }
        System.out.println(result);
 
    }
 
}