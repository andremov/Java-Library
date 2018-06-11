/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interseccion;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

/**
 *
 * @author andresmovilla
 */
public class Rect {
	
	int x;
	int y;
	int displaceX;
	int displaceY;
	int width;
	int height;
	Color color;
	
	public Rect(int x, int y, int width, int height, Color color) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		this.color = color;
	}
	
	public int getStartX() {
		return x;
	}

	public int getDisplaceX() {
		return displaceX;
	}

	public void setDisplaceX(int displaceX) {
		this.displaceX = displaceX;
	}

	public int getDisplaceY() {
		return displaceY;
	}

	public void setDisplaceY(int displaceY) {
		this.displaceY = displaceY;
	}
	
	
	public int getStartY() {
		return y;
	}
	
	
	public int getEndX() {
		return x+width;
	}
	
	
	public int getEndY() {
		return y+height;
	}
	
	public BufferedImage getImage() {
		BufferedImage img = new BufferedImage(width,height,BufferedImage.TYPE_INT_ARGB);
		Graphics g = img.getGraphics();
		
		g.setColor(color);
		
		
		return img;
	}
	
}
