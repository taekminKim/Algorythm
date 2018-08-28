package boj;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class q2252_1 {
	public static void main(String[] args) {
		//1. ���� �����صд�. List�� �̿��Ͽ�
		//2. indegree�� 0 �� ���� ť�� ��� ���� �ִ´�
		//3. ť�� �������� 0�� ���� �ϳ��� ���� �� ���� ���� �ٽ� ť�� ����ִ´�
		//�� �׶� ȭ��ǥ ���� Indegree�� �ϳ��� ���δ�.
		//4. ��
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int indegree[] = new int[N+1];
		ArrayList<Integer> list[] = new ArrayList[N+1];
		for(int i=1; i<=N; i++){
			list[i] = new ArrayList<Integer>();
		}
		for(int i=0; i<M; i++){
			int x = sc.nextInt();
			int y = sc.nextInt();
			list[x].add(y);
			indegree[y]++;
		}
		//-�Է�
		
		//���� ����
		Queue<Integer> queue = new LinkedList<Integer>();
		//indegree�� 0�϶� ť�� �ִ´�. indegree�� �ڽ��� ����Ű�� �ִ� ȭ��ǥ�� ����
		
		for(int i=1; i<=N; i++){
			if(indegree[i]==0){
				queue.add(i);
			}
		}
		
		while(!queue.isEmpty()){
			System.out.println(queue.peek());
			int current = queue.poll();
			//�ڽ��� ����Ű�� �ִ� ��ǥ���� �湮�Ͽ� indegree���� -1���ְ�
			//0���� 0�̶�� ť�� �־��ش�.
			for(int i=0; i<list[current].size();i++){
				int next = list[current].get(i);
				indegree[next]--;
				if(indegree[next]==0){
					queue.add(next);
				}
			}
			
		}
		
	}
}