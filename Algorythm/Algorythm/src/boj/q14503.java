package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
public class q14503 {
	static int arr[][];
	static int dx[] = {-1, 0, 1, 0};
	static int dy[] = {0, 1, 0, -1};
	static boolean visit[][];
	static Direction dir;
	static int d;
	static int N;
	static int M;
	/*
	 * ��(0)-> ��(3) -> ��(2) -> ��(1) 
	 * (0,1) -> (-1,0) -> (0,-1) -> (1,0)
	 */
	//���� d��
	//0 : ��   1: ��
	//2 : ��   3: ��
	static int count = 0; //û���Ҷ��� count����.
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str[] = br.readLine().split(" ");
		N = Integer.parseInt(str[0]);
		M = Integer.parseInt(str[1]);
		arr = new int[N+1][M+1];
		visit = new boolean[N+1][M+1];
		str = br.readLine().split(" ");
		int r = Integer.parseInt(str[0]);
		int c = Integer.parseInt(str[1]);
		d = Integer.parseInt(str[2]); //����
		for(int i=0; i<N; i++){
			str = br.readLine().split(" ");
			for(int j=0; j<M; j++){
				arr[i][j] = Integer.parseInt(str[j]);
			}
		}
		dfs(r,c,d);
		for(int i=0; i<N; i++){
			for(int j=0; j<M; j++){
				if(arr[i][j] == 9)
					count++;
			}
		}
		System.out.println(count);
	}
	
	public static void dfs(int r, int c, int d){
		// �׹��� ��� û�Ұ� �̹� �Ǿ��ְų� ���̸鼭
		// ���� ������ ���̶� ������ �� �� ���°�� �۵� ����.
		Queue<Direction> q = new LinkedList<Direction>();
		arr[r][c] = 9;
		q.add(new Direction(r,c,d));
		while(!q.isEmpty()){
			Direction dir = q.poll();
			int nowX = dir.x;
			int nowY = dir.y;
			int nowDir = dir.dir;
			boolean flags = false;
			int nextX;
			int nextY;
			int nextDir;
			for(int i=0; i<4; i++){
				nowDir = (nowDir + 3) %4;
				nextX = nowX + dx[nowDir];
				nextY = nowY + dy[nowDir];
				
				Direction nextDot = new Direction(nextX, nextY, nowDir);
				
				if(nextX <0 || nextY <0 || nextX >=N || nextY >= M){
					continue;
				}
				//������ġ�� û�ҵ��� ���� ���̸� ��
				if(arr[nextX][nextY] == 0){
					q.add(nextDot);
					arr[nextX][nextY] = 9;
					flags = true;
					break;
				}
			}
			
			//4���� ��� û�ҵȰ�� ����
			if(!flags){
				nextDir = (nowDir + 2) % 4;
				nextX = nowX + dx[nextDir];
				nextY = nowY + dy[nextDir];
				//���� ������ ���� ���̸� ����, �ƴϸ� ����
				if(arr[nextX][nextY] != 1){
					arr[nextX][nextY] = 9;
					q.add(new Direction(nextX, nextY, nowDir));
				}
			}
		}
	}
	
	
}
class Direction{
	int x;
	int y;
	int dir;
	public Direction(int x, int y, int dir) {
		super();
		this.x = x;
		this.y = y;
		this.dir = dir;
	}
}