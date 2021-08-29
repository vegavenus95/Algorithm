package algo_210829;

import java.util.Scanner;

public class boj_2753 {

	private static int num;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		num = sc.nextInt();
		
		if((num%4==0 && num%100!=0) || num%400==0){
			System.out.println("1");
		}else {
			System.out.println("0");
		}

	}

}
