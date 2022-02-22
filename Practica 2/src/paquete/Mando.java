package paquete;

import javax.swing.JOptionPane;
import java.util.Scanner;

public class Mando {
	
	String marca;
	String color;
	String conect;
	String bat;
	String con;
	boolean e;
	
	public void llenar()
	{
		marca = JOptionPane.showInputDialog("Ingrese la marca del mando");
		color = JOptionPane.showInputDialog("Ingrese el color del mando");
		conect = JOptionPane.showInputDialog("Ingrese tipo de coneccion (Inalambrico/Alambrico)");
		bat = JOptionPane.showInputDialog("Ingrese el tipo de baterias que utiliza Ej:AA");
		con = JOptionPane.showInputDialog("Ingrese para que consola es Ej:Xbox One");
		e = true;
	}
	
	public void most() {
		
		JOptionPane.showMessageDialog(null,"Marca: "+marca+"\nColor: "+color+"\nConectividad: "+conect+"\nTipo de baterias: "+bat+"\nConsola: "+con);
		
	}
	
}