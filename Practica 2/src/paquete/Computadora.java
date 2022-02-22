package paquete;

import javax.swing.JOptionPane;
import java.util.Scanner;

public class Computadora {
	
	String p;
	String r;
	String g;
	String a;
	String o;
	boolean e;
	
	public void llenar() {
		p = JOptionPane.showInputDialog("Ingrese el tipo de procesador");
		r = JOptionPane.showInputDialog("Ingrese la cantidad de RAM");
		g = JOptionPane.showInputDialog("Ingrese el tipo de tarjeta grafica");
		a = JOptionPane.showInputDialog("Ingrese la cantidad de almacenamiento");
		o = JOptionPane.showInputDialog("Ingrese el sistema operativo");
		e = true;
	}
	
	public void most() {
		JOptionPane.showMessageDialog(null,"Procesador: "+p+"\nRAM: "+r+"\nGrafica: "+g+"\nAlmacenamiento: "+a+"\nOS: "+o);
		
	}

}
