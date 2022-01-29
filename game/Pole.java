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
	
	public Timer timerDraw;
	private Image shapka;
	private Image fon;
	public int x=400;
	
	public Pole() {
		
		try {
			fon = ImageIO.read(new File("C:\\java\\fon.png"));
		} catch (Exception e) {
		}
		
		try {
			shapka = ImageIO.read(new File("C:\\java\\shapka.png"));
		} catch (Exception e) {
		}
		
		
		
		timerDraw = new Timer(50, new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				repaint();
			}
		});
		
		timerDraw.start();
	}
	
	public void paintComponent(Graphics gr) {
		gr.drawImage(fon, 0, 0, null);
		gr.drawImage(shapka, x, 465, null);
	}

}
