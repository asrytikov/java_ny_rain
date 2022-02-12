package game;

import javax.swing.JOptionPane;

public class Prog {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = JOptionPane.showInputDialog(null, "¬ведите сложность игры", "—ложность игры", 1);

		try {
			int slogn = Integer.valueOf(str);
			if ((slogn >= 1) && (slogn <= 7)) {
				Okno win = new Okno(slogn);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
