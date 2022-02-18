package game;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Pole extends JPanel{
	
	public Timer timerDraw, timerUpdate;
	private Image shapka;
	private Image fon;
	public int x=400;
	private int slogn;
	private Podar[] podarki;
	
	public Pole(int slogn) {
		
		this.slogn = slogn;
		
		try {
			fon = ImageIO.read(new File("C:\\java\\fon.png"));
		} catch (Exception e) {
		}
		
		try {
			shapka = ImageIO.read(new File("C:\\java\\shapka.png"));
		} catch (Exception e) {
		}
		
		podarki = new Podar[7];
		
		for (int i = 0; i < podarki.length; i++) {
			try {
				
				podarki[i] = new Podar(ImageIO.read(new File("C:\\java\\p"+i+".png")));
				
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		
		timerDraw = new Timer(50, new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				repaint();
			}
		});
		
		timerDraw.start();
		
		timerUpdate = new Timer(3000, new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub );
				updateStart();
			}});
		timerUpdate.start();
	}
	
	public void paintComponent(Graphics gr) {
		gr.drawImage(fon, 0, 0, null);
		gr.drawImage(shapka, x, 465, null);
		
		for (int i = 0; i < podarki.length; i++) {
			podarki[i].paint(gr);
		}
	}
	
	private void updateStart() {
		int kol = 0;
		
		for (int i = 0; i < podarki.length; i++) {
			if (podarki[i].act==false) {
				if (kol<slogn) {
					podarki[i].start();
					break;
				}
			}
			else {
				kol++;
			}
		}
	}

}
