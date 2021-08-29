package algo_210829;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class boj_2439 {

	private static int N;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		N = Integer.parseInt(br.readLine());
		
		// 줄 바꾸기
		for(int i = 1; i<=N; i++) {
			// 빈칸 출력
			for(int j = N-1; j>=i; j--) {
				System.out.print(" ");
			}
			// 별 찍기
			for(int k = 0; k<i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
