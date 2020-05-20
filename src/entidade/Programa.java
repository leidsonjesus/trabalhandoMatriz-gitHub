package entidade;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner  sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[][] mat = new int[n][n];
		
		// TODO Prenneche as linha da matriz tabela linha=1
		for(int i=0; i<n; i++) {
			for(int j= 0; j<n; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		
		System.out.println(" Main Diagonal");
		for (int i=0; i<n;i++) {
			System.out.print(mat[i][i] + " ");
			
		}
		System.out.println("----------------------");
		System.out.println(" Main matriz");
		for (int i=0; i<n;i++) {
			for (int j=0; j<n;j++) {
			System.out.print(mat[i][j] + " ");
		}
			}
		System.out.println("----------------------");
		int count = 0;
		
		for(int i=0; i<n; i++) {
			for (int j=0; j<n;j++) {
				if (mat[i] [j] < 0) {
					count ++;
				}
			}	
		}
		
		System.out.print(" Negativo Numbers : " + count);
		sc.close();
		
	}

}
