/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package claseslaterales;

/**
 *
 * @author andresmovilla
 */
public class ClasesLaterales {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		Codigo C = new Codigo(8);
		int alfabeto = 2;
		int numCodewords = 3;
		C.addCodeword(new Codeword(alfabeto, 0,0,0,0,0,0,0));
		C.addCodeword(new Codeword(alfabeto, 0,0,1,0,1,1,1));
		C.addCodeword(new Codeword(alfabeto, 0,1,0,1,1,0,1));
		C.addCodeword(new Codeword(alfabeto, 0,1,1,1,0,1,0));
		C.addCodeword(new Codeword(alfabeto, 1,0,0,1,0,1,1));
		C.addCodeword(new Codeword(alfabeto, 1,0,1,1,1,0,0));
		C.addCodeword(new Codeword(alfabeto, 1,1,0,0,1,1,0));
		C.addCodeword(new Codeword(alfabeto, 1,1,1,0,0,0,1));
				
		Codeword ind = new Codeword(alfabeto, 0,0,0,0,0,0,0);
		
		int numClaves = (int) Math.pow(alfabeto,(ind.valores.length-numCodewords));
		
		Codeword[] claves = new Codeword[numClaves];
		Codigo[] codigosLaterales = new Codigo[numClaves];
		int id = 0;
		while (claves[numClaves-1] == null) {
			System.out.println("Probando con "+ind);
			Codigo c2 = C.sumar(ind);
			System.out.println(c2);
			
			boolean inter = false;
			for (int i = 0; i < id; i++) {
				inter = codigosLaterales[i].interseccion(c2)? true : inter;
			}
			if (!inter) {
				claves[id] = ind.copiar();
				codigosLaterales[id] = c2;
				id++;
				System.out.println("Nueva clave "+ind);
			}
			
			ind = ind.siguiente();
		}
		
		for (int i = 0; i < claves.length; i++) {
			System.out.println(codigosLaterales[i].lider());
		}
	}
	
	
	
}
