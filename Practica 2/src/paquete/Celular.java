package paquete;

import javax.swing.JOptionPane;
import java.util.Scanner;

public class Celular {
	
	String marca;
	String modelo;
	String color;
	String desbloqueo;
	String puerto;
	boolean e;
	
	public void llenar()
	{
		marca = JOptionPane.showInputDialog("Ingrese la marca del celular");
		modelo = JOptionPane.showInputDialog("Ingrese el modelo del celular");
		color = JOptionPane.showInputDialog("Ingrese el color del celular");
		desbloqueo = JOptionPane.showInputDialog("Ingrese tipo de desbloqueo (Huella,Facial,Sistema)");
		puerto = JOptionPane.showInputDialog("Ingrese el tipo de puerto de carga (Tipo c, Micro Usb, Lightning)");
		e = true;
	}
	
	public void most() {
		JOptionPane.showMessageDialog(null,"Marca: "+marca+"\nModelo: "+modelo+"\nColor: "+color+"\nTipo de desbloqueo: "+desbloqueo+"\nTipo de puerto: "+puerto);
	
	}
	
}