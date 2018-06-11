/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adivinaraices;

import java.util.Scanner;

/**
 *
 * @author andresmovilla
 */
public class AdivinaRaices {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Numero para sacar la raiz.");
		double numero = s.nextDouble();
//		System.out.println("Base para comenzar proceso.");
//		double intento = s.nextDouble();
		double intento = numero;
		double reciproco = numero/intento;
		while (reciproco != intento) {
			intento = (intento + reciproco)/2;
			reciproco = numero/intento;
//			System.out.println(intento+"?");
		}
		System.out.println("La raiz es "+reciproco+".");
	}
	
}
