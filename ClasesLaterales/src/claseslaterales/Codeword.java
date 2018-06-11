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
public class Codeword {
	
	int[] valores;
	int alfabeto;

	public Codeword(int alf, Integer... valores) {
		int[] newvals = new int[valores.length];
		for (int i = 0; i < valores.length; i++) {
			newvals[i] = (int) valores[i];
		}
		this.valores = newvals;
		this.alfabeto = alf;
	}
	
	public Codeword(int alf, int[] valores) {
		this.alfabeto = alf;
		this.valores = valores;
	}
	
	public Codeword sumar(Codeword inCW) {
		int[] valores2 = new int[valores.length]; 
		
		for (int i = 0; i < valores.length; i++) {
			valores2[i] = (inCW.valores[i] + valores[i])%alfabeto;
		}
		
		return new Codeword(this.alfabeto, valores2);
	}
	
	public Codeword copiar() {
		return new Codeword(this.alfabeto, this.valores);
	}
	
	public int peso() {
		int sum = 0;
		for (int i = 0; i < valores.length; i++) {
			sum += valores[i];
		}
		return sum;
	}
	
	public Codeword siguiente() {
		int[] valores2 = new int[valores.length];
		
		for (int i = 0; i < valores.length; i++) {
			valores2[i] = valores[i];
		}
		
		valores2[valores2.length-1] = valores2[valores2.length-1] + 1;
		
		for (int i = valores2.length-1; i >= 0; i--) {
			if (valores2[i] == this.alfabeto) {
				valores2[i] = 0;
				valores2[i-1] = valores2[i-1]+1;
			}
		}
		
		return new Codeword(this.alfabeto, valores2);
	}
	
	public boolean equals(Codeword cw) {
		boolean eq = true;
		for (int i = 0; i < valores.length; i++) {
			if (cw.valores[i] != this.valores[i]) {
				eq = false;
			}
		}
		return eq;
	}
	public String toString() {
		String s = "";
		for (int i = 0; i < this.valores.length; i++) {
			s += this.valores[i] + "";
		}
		return s;
	}
}
