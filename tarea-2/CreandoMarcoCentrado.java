/*	Juan Romero
 * 	C.I: 29.955.629
 * 	Computacion Grafica - 2023B
 * */

package graficos;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JFrame;

public class CreandoMarcoCentrado {

	public static void main(String[] args) {
		
		MarcoCentrado miMarco = new MarcoCentrado();
		
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		miMarco.setVisible(true);
		
		miMarco.setTitle("Computación Gráfica");
		
	}

}

class MarcoCentrado extends JFrame{
	
	public MarcoCentrado() {
		
		Toolkit miPantalla = Toolkit.getDefaultToolkit();
		
		Dimension tamanioPantalla = miPantalla.getScreenSize();
		
		int alturaPantalla = tamanioPantalla.height;
		
		int anchoPantalla = tamanioPantalla.width;
		
		//setSize(alturaPantalla/2, anchoPantalla/2);
		
		//setLocation(alturaPantalla/4, anchoPantalla/4);
		
		setSize(alturaPantalla, anchoPantalla/4);
		
		setLocation(alturaPantalla/4, anchoPantalla/4);
		
		Image miIcono = miPantalla.getImage("Images.jpeg");
		
		setIconImage(miIcono);
	}
	
}
