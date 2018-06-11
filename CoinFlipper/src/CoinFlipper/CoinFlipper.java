/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CoinFlipper;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author andresmovilla
 */
public class CoinFlipper {

	static Coin c;
	static int totalFlips;
		
	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		c = new Coin();
		totalFlips = 0;
		int n = 100;
		ArrayList<Integer> results = new ArrayList<>();
		
		int reps = 0;
		while (reps < n) {
			reps++;
			int maxFlips = maxFlips(1000);
			while (maxFlips >= results.size()) {
				results.add(0);
			}
			results.set(maxFlips, results.get(maxFlips)+1);
		}
		
		for (int i = 1; i < results.size(); i++) {
			System.out.println(i+": "+results.get(i));
		}
		System.out.println(totalFlips);
	}
	
	static int flipsUntilTails() {
		
		int flips = 1;
		c.flip();
		
		while (c.isHead()) {
			c.flip();
			totalFlips++;
			flips++;
		}
		
		return flips;
	}
	
	static int maxFlips(int n) {
		int i = 0;
		ArrayList<Integer> results = new ArrayList<>();
		
		while (i < n) {
			i++;
			int flips = flipsUntilTails();
			while (flips >= results.size()) {
				results.add(0);
			}
			results.set(flips, results.get(flips)+1);
		}
		
		return results.size();
	}
	
}

class Coin {
	float value;
	Random r;
	public Coin() {
		r = new Random();
	}
	public void flip() {
		value = r.nextFloat();
	}
	public boolean isHead() {
		return (value >= 0.5f);
	}
}