package tabuadaUri1078;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int N, fator, tabuada;
		
		N = sc.nextInt();
		for(fator = 1; fator <=10; fator ++) {
			tabuada = fator * N;
			System.out.println(fator + " x " + N + " = " + tabuada);
		}
		
		
		sc.close();
	}

}
