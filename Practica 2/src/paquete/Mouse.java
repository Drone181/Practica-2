package paquete;

import javax.swing.JOptionPane;
import java.util.Scanner;

public class Mouse {
	
	String marca;
	String color;
	String conect;
	int bot;
	String tipo;
	boolean e;
	
	public void llenar()
	{
		marca = JOptionPane.showInputDialog("Ingrese la marca del mouse");
		color = JOptionPane.showInputDialog("Ingrese el color del mouse");
		conect = JOptionPane.showInputDialog("Ingrese tipo de coneccion (Inalambrico/Alambrico)");
		bot = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de botones"));
		tipo = JOptionPane.showInputDialog("Ingrese el tipo de mouse Ej: Gamer");
		e = true;
	}
	
	public void most() {
		
		JOptionPane.showMessageDialog(null,"Marca: "+marca+"\nColor: "+color+"\nConectividad: "+conect+"\nNumero de Botones: "+bot+"\nTipo de Mouse: "+tipo);
	}
	
}
