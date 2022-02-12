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
		
		if (act == true) {
			y += 6;
		}
		
		if ((y+img.getHeight(null))>=470) {
			timerUpdate.stop();
		}
		
	}
	
	public void start() {
		timerUpdate.start();
		y = 0;
		x = (int)(Math.random()*700);
		act = true;
	}
	
	public void paint(Graphics gr) {
		if (act) {
			gr.drawImage(img, x, y, null);
		}
	}

}
