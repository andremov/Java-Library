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
public class Codigo {
	Codeword[] codewords;
	
	public Codigo(int largo) {
		codewords = new Codeword[largo];
	}
	
	public void addCodeword(Codeword n) {
		int i = 0;
		while(codewords[i] != null) {
			i++;
		}
		codewords[i] = n;
	}
	
	public Codeword lider() {
		Codeword lider = codewords[0];
		for (int i = 0; i < codewords.length; i++) {
			if (lider.peso() > codewords[i].peso()) {
				lider = codewords[i];
			}
		}
		return lider;
	}
	
	public Codigo sumar(Codeword cw) {
		Codigo nuevoCodigo = new Codigo(this.codewords.length);
		for (int i = 0; i < codewords.length; i++) {
			nuevoCodigo.addCodeword(codewords[i].sumar(cw));
		}
		return nuevoCodigo;
	}
	
	public boolean interseccion(Codigo c) {
		boolean in = false;
		for (int i = 0; i < codewords.length; i++) {
			in = this.contains(c.codewords[i])? true : in;
		}
		return in;
	}
	
	public boolean contains(Codeword cw) {
		boolean con = false;
		for (int i = 0; i < codewords.length; i++) {
			con = codewords[i].equals(cw)? true : con;
		}
		return con;
	}
	
	public String toString() {
		String s = "Codigo: ";
		for (int i = 0; i < codewords.length; i++) {
			s += codewords[i] + ", ";
		}
		return s;
	}
	
}
