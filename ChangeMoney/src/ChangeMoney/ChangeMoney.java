/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ChangeMoney;

/**
 *
 * @author andresmovilla
 */
public class ChangeMoney {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		// TODO code application logic here
		reducir(13500);
	}
	
	public static void reducir(int pValor) {
		System.out.println("Reduciendo "+pValor);
		int valor = pValor;
		int monedasMil = valor/1000;
		valor = valor%1000;
		int monedas500 = valor/500;
		valor = valor%500;
		int monedas200 = valor/200;
		valor = valor%200;
		int monedas100 = valor/100;
		valor = valor%100;
		int monedas50 = valor/50;
		valor = valor%50;
		
		System.out.println("1000: "+monedasMil);
		System.out.println("500: "+monedas500);
		System.out.println("200: "+monedas200);
		System.out.println("100: "+monedas100);
		System.out.println("50: "+monedas50);
		System.out.println("R: "+valor);
		
	}
}
