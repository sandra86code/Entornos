package boletin;

import java.util.Random;

public class ED1T1P {

	static Random rnd=new Random();

	public static void main(String[] args) {

		int veces;
		int contador=0;

		veces = rnd.nextInt(100)+1;
		//El contador no puede ir a 0 dentro del bucle porque lo sobreescribe y se pierde su valor
		for(int i = 0; i<veces;i++) {
			System.out.println(rnd.nextInt(50));
			contador++;
		}

		System.out.println("Se han generado "+contador+" números aleatorios");
	}
}