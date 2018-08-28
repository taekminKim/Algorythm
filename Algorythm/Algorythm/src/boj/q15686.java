package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class q15686 {
	static int arr[][];
	static ArrayList<Dot> store;
	static ArrayList<Dot> person;
	static boolean visit[];
	static int output[];
	static int res;
	static int N;
	static int M;
	static int min = Integer.MAX_VALUE;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str[] = br.readLine().split(" ");
		N = Integer.parseInt(str[0]);
		M = Integer.parseInt(str[1]);
		arr = new int[N][N];
		res = Integer.MAX_VALUE;
		store = new ArrayList<Dot>();
		person = new ArrayList<Dot>();
		
		for(int i=0; i<N; i++){
			str = br.readLine().split(" ");
			for(int j=0; j<N; j++){
				arr[i][j] = Integer.parseInt(str[j]);
				if(arr[i][j] == 1){
					person.add(new Dot(i,j));
				}else if(arr[i][j] ==2){
					store.add(new Dot(i,j));
				}
			}
		}
		
		visit = new boolean[store.size()];
		output = new int[store.size()];
		
		for(int i=0; i<store.size(); i++){
			visit[i] = true;
			storeselect(i,0);
			visit[i] = false;
		}
		System.out.println(res);
	}
	
	public static void storeselect(int start, int depth){
		output[depth] = start + 1;
		
		for(int i= start; i< store.size(); i++){
			if(visit[i])
				continue;
			
			visit[i] = true;
			storeselect(i, depth +1);
			visit[i] = false;
		}
		
		if(depth == M-1){
			int sum = 0;
			int currentM = 0;
			//사람이 갈 수 있는 치킨집의 경우중 가장 최솟값 선택
			for(int i=0; i<person.size(); i++){
				int min = Integer.MAX_VALUE;
				for(int j=0; j<M; j++){
					currentM = calcul(person.get(i), store.get(output[j] - 1 ));
					min = Math.min(min,  currentM);
				}
				//최소값일 경우
			}
		}
		
		
		
	}
	

	public static int calcul(Dot d1, Dot d2){
		return Math.abs(d1.x - d2.x) + Math.abs(d1.y - d2.y);
	}
}

class Dot {
	int x;
	int y;

	public Dot(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

}
