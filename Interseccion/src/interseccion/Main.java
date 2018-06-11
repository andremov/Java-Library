/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interseccion;

import javafx.scene.paint.Color;

/**
 *
 * @author andresmovilla
 */
public abstract class Main {
	public static Rect rect1;
	public static Rect rect2;
	
	public static int startX;
	public static int startY;
	
	public static int endX;
	public static int endY;
	
	public void init() {
		rect1 = new Rect(0,0,100,100,Color.rgb(	205, 92, 92, 0.5f));
		rect2 = new Rect(50,50,200,50);
	}
	
	public static void setStartLoc(int x, int y) {
		startX = x;
		startY = y;
	}
	
	public static void setEndLoc(int x, int y) {
		endX = x;
		endY = y;
	}
}
