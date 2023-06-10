/*	Juan Romero
 * 	C.I: 29.955.629
 * 	Computación Gráfica - 2023B
 * */

package graficos;

import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class EscribiendoEnMarco {

	public static void main(String[] args) {
		MarcoConTexto miMarco = new MarcoConTexto();
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class MarcoConTexto extends JFrame{
	public MarcoConTexto() {
		setVisible(true);
		setSize(600, 450);
		setLocation(400, 200);
		setTitle("Primer Texto");
		
		Lamina miLamina = new Lamina();
		add(miLamina);
	}
}

class Lamina extends JPanel {
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawString("Clase de Computación Gráfica", 100, 100);
	}
}
