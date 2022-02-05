package game;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.*;

import javax.swing.Timer;

public class Podar {
	
	public Image img;
	public int x, y;
	public boolean act;
	Timer timerUpdate;
	
	
	public Podar(Image img) {
		timerUpdate = new Timer(500, new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				down();
			}});
		
		act = false;
		this.img = img;
		
	}
	
	public void down() {
		
	}
	
	public void start() {
		
	}
	
	public void paint(Graphics gr) {
		
	}

}
