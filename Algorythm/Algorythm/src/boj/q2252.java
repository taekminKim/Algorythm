package boj;

import java.io.IOException;
import java.util.LinkedList;
import java.util.Scanner;

public class q2252 {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		//N���� �л����� Ű������� Ű���� �����
		//�������� ������ �����⿡ ���� ����.
		
		LinkedList<Integer> list[] = new LinkedList[n+1];
		int degree[] = new int[n+1];
		
		for(int i=1; i<n+1; i++){
			list[i] = new LinkedList<>();
		}
		int from , to;
		for(int i=0; i<m; i++){
			from = sc.nextInt();
			to = sc.nextInt();
			
			list[from].add(to);
			degree[to]++;
		}
		LinkedList<Integer> q = new LinkedList<>();
		for(int i=1; i<n+1; i++){
			if(degree[i]==0){
				q.offer(i);
				System.out.print(i+" ");
			}
		}
		
	}

}
