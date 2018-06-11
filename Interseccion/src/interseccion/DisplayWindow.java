/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interseccion;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.JFrame;

/**
 *
 * @author Andres
 */
public class DisplayWindow extends JFrame {

    public static int CANVAS_X = 8;
    public static int CANVAS_Y = 31;
    public static int WINDOW_X = 600;
    public static int WINDOW_Y = 600;

    static Display screen;

    public DisplayWindow() {
		setLayout(null);
		setSize(WINDOW_X+CANVAS_X,WINDOW_Y+CANVAS_Y);
		setLocationRelativeTo(null);
		setTitle("Interseccion");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);

		init();

		setVisible(true);

		new Thread(screen).start();
    }

    private void init() {

		screen = new Display();
		screen.setSize(WINDOW_X,WINDOW_Y);
		screen.setLocation(1,1);
		screen.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {}
			@Override
			public void mousePressed(MouseEvent e) { Main.setStartLoc(e.getX(),e.getY()); }
			@Override
			public void mouseReleased(MouseEvent e) {}
			@Override
			public void mouseEntered(MouseEvent e) {}
			@Override
			public void mouseExited(MouseEvent e) {}
		});
		screen.addMouseMotionListener(new MouseMotionListener() {
			@Override
			public void mouseMoved(MouseEvent e) { Main.setEndLoc(e.getX(),e.getY()); }

			@Override
			public void mouseDragged(MouseEvent e) { }
		});
		add(screen);

    }
	
}