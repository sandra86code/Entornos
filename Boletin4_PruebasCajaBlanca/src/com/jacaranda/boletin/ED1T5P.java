package com.jacaranda.boletin;

public class ED1T5P {

	public static void main(String[] args) {
		
		System.out.println(numMayor(3, 2, 1)); //a
		System.out.println(numMayor(2, 1, 3)); //c
		System.out.println(numMayor(2, 3, 1)); //b
		System.out.println(numMayor(1, 2, 3)); //c

	}
	
	public static int numMayor(int a, int b, int c) {
		int numMayor;
		if(a>b) {
			if(a>c) {
				numMayor = a;
			}else {
				numMayor=c;
			}
		}else {
			if(b>c) {
				numMayor=b;
			}else {
				numMayor=c;
			}
		}
		return numMayor;
	}
}
