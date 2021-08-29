package algo_210829;

import java.util.Scanner;

public class boj_2739 {

	private static int N;

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		
		for(int i = 1; i<=9; i++) {
			System.out.println(N+" * "+ i + " = " + N*i);
		}
		
	}

}
