package game;

import java.awt.Container;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

public class Okno extends JFrame {
	
	public Pole pole;
	
	private class myKey implements KeyListener{

		@Override
		public void keyPressed(KeyEvent e) {
			// TODO Auto-generated method stub
			int key = e.getKeyCode();
			if (key == 27) {
				System.exit(0);
			}else if (key == 37) {
				
				if (pole.x-30>-48) {
					pole.x -= 30;
				}else {
					pole.x = 752;
				}
				
			}else if (key == 39) {
				
				if (pole.x+30<752) {
					pole.x +=30;
				}else {
					pole.x = -48;
				}
				
			}
		}

		@Override
		public void keyReleased(KeyEvent arg0) {}

		@Override
		public void keyTyped(KeyEvent arg0) {}
		
	}
	
	public Okno(int slogn) {
		
		addKeyListener(new myKey());
		setFocusable(true);
		
		pole = new Pole(slogn);
		Container cont = getContentPane();
		cont.add(pole);
		
		setBounds(0, 0, 800, 600);
		setTitle("Игра Новогодний дождь!");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	

}
