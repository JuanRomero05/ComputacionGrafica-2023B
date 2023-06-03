/*	Juan Romero
 * 	C.I: 29.955.629
 * 	Computacion Grafica - 2023B
 * */

package graficos;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;

public class CreandoMarcoCentrado {

	public static void main(String[] args) {
		
		MarcoCentrado miMarco = new MarcoCentrado();
		
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		miMarco.setVisible(true);
		
	}

}

class MarcoCentrado extends JFrame{
	
	public MarcoCentrado() {
		
		Toolkit miPantalla = Toolkit.getDefaultToolkit();
		
		Dimension tamanioPantalla = miPantalla.getScreenSize();
		
		int alturaPantalla = tamanioPantalla.height;
		
		int anchoPantalla = tamanioPantalla.width;
		
		setSize(alturaPantalla/2, anchoPantalla/2);
		
		setLocation(alturaPantalla/4, anchoPantalla/4);
		
	}
	
}
