package paquete;

import javax.swing.JOptionPane;
import java.util.Scanner;

public class Audifono {
	
	String marca;
	String modelo;
	String color;
	String conect;
	boolean touch;
	boolean e;
	
	public void llenar()
	{
		int opc;
		marca = JOptionPane.showInputDialog("Ingrese la marca de los audifonos");
		modelo = JOptionPane.showInputDialog("Ingrese el modelo de los audifonos");
		color = JOptionPane.showInputDialog("Ingrese el color de los audifonos");
		conect = JOptionPane.showInputDialog("Ingrese tipo de coneccion (Inalambricos/Alambricos)");
		opc = Integer.parseInt(JOptionPane.showInputDialog("Cuentan con touch?\n1.Si\n2.No"));
		switch(opc) {
		case 1:
			touch = true;
			break;
		case 2:
			touch = false;
			break;
		default:
			break;
		}
		e = true;
	}
	
	public void most() {
		JOptionPane.showMessageDialog(null,"Marca: "+marca+"\nModelo: "+modelo+"\nColor: "+color+"\nConectividad: "+conect+"\nTouch: "+touch);
		
	}
	
}
