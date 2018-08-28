package boj;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class q2252_1 {
	public static void main(String[] args) {
		//1. 값을 저장해둔다. List를 이용하여
		//2. indegree가 0 인 값을 큐에 모두 집어 넣는다
		//3. 큐가 빌때까지 0인 값을 하나씩 빼서 그 다음 값에 다시 큐에 집어넣는다
		//단 그때 화살표 값인 Indegree를 하나씩 줄인다.
		//4. 끝
		
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
		//-입력
		
		//위상 정렬
		Queue<Integer> queue = new LinkedList<Integer>();
		//indegree가 0일때 큐에 넣는다. indegree는 자신을 가르키고 있는 화살표의 개수
		
		for(int i=1; i<=N; i++){
			if(indegree[i]==0){
				queue.add(i);
			}
		}
		
		while(!queue.isEmpty()){
			System.out.println(queue.peek());
			int current = queue.poll();
			//자신이 가르키고 있는 좌표들을 방문하여 indegree값을 -1해주고
			//0만약 0이라면 큐에 넣어준다.
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
