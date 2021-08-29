package algo_210829;

import java.util.Scanner;

public class boj_2438 {

	private static int N;

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		
		for(int i = 0; i<N; i++) {
			for(int j = 0; j<=i; j++) {
				System.out.print("*");				
			}
			System.out.println();
		}
	}

}
