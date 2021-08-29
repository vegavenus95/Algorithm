package algo_210829;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj_1001 {

	private static int A, B, result;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		A =Integer.parseInt(st.nextToken());
		B =Integer.parseInt(st.nextToken());
		
		result = A-B;
		System.out.println(result);
		
	
	}

}
