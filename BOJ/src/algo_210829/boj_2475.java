package algo_210829;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj_2475 {
	
	private static int num;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for(int i = 0; i<5; i++) {
			num += Math.pow(Integer.parseInt(st.nextToken()), 2);
		}
		System.out.println(num%10);
		
	
	}

}
