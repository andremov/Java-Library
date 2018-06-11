/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interseccion;

import java.awt.Canvas;
import java.awt.Color;
import javax.tv.graphics.AlphaColor;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

/**
 *
 * @author Andres
 */
public class Display extends Canvas implements Runnable {

    /**
     * devuelve el color dado por parametros en HSB
     * @param h
     * @param s
     * @param b
     * @return 
     */
    public static Color color(double h, double s, double b) {
	    return Color.getHSBColor((float)(h/360f),(float)(s/100f),(float)(b/100f));
    }

	public static Color color(javafx.scene.paint.Color inColor) {
		return Color.getHSBColor(TOP_ALIGNMENT, TOP_ALIGNMENT, TOP_ALIGNMENT)
	}
	
    /**
     * pinta el canvas
     */
    @Override
    public void run() {
		createBufferStrategy(2);
		while(true){
			Graphics g = getBufferStrategy().getDrawGraphics();
			
			getBufferStrategy().show();

			try {
				Thread.sleep(100);
			} catch(Exception e){ }
		}
    }
	
}