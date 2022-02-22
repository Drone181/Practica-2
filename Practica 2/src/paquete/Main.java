package paquete;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		Mouse m1 = new Mouse();
		Mouse m2 = new Mouse();
		Mouse m3 = new Mouse();
		Celular c1 = new Celular();
		Celular c2 = new Celular();
		Celular c3 = new Celular();
		Audifono a1 = new Audifono();
		Audifono a2 = new Audifono();
		Audifono a3 = new Audifono();
		Mando ma1 = new Mando();
		Mando ma2 = new Mando();
		Mando ma3 = new Mando();
		Computadora co1 = new Computadora();
		Computadora co2 = new Computadora();
		Computadora co3 = new Computadora();
		
		boolean s = false;
		int m;
		int opc1,opc2,opc3,opc4,opc5,opc6,opc7,opc8,opc9,opc10;
		
		while(!s) {
			m = Integer.parseInt(JOptionPane.showInputDialog("**Menu de Clases**\n\n1. Mouse\n2.Celular\n3.Audifono\n4.Mando\n5.Computadora\n6.Salir\n\nIngrese la opcion"));
			switch(m) {
			case 1:
				
				opc1 = Integer.parseInt(JOptionPane.showInputDialog("Clase 'mouse'\n\n1.Capturar Atributos\n2.Imprimir Objetos\n3.Regresar\n\nIngrese la opcion"));
				switch(opc1) {
				case 1:
					opc2 = Integer.parseInt(JOptionPane.showInputDialog("1. Objeto 1\n2. Objeto 2\n3. Objeto 3"));
					switch(opc2) {
					case 1:
						if(m1.e==true) {
							JOptionPane.showMessageDialog(null,"El objetvo ya se encuentra llenado");
						}
						else {
							m1.llenar();
						}
						break;
					case 2:
						if(m2.e==true) {
							JOptionPane.showMessageDialog(null,"El objetvo ya se encuentra llenado");
						}
						else {
							m2.llenar();
						}
						break;
					case 3:
						if(m3.e==true) {
							JOptionPane.showMessageDialog(null,"El objetvo ya se encuentra llenado");
						}
						else {
							m3.llenar();
						}
						break;
					}
					
					break;
					
				case 2:
					m1.most();
					m2.most();
					m3.most();
					break;
				}
				
				break;
				
			case 2:
				opc3 = Integer.parseInt(JOptionPane.showInputDialog("Clase 'celular'\n\n1.Capturar Atributos\n2.Imprimir Objetos\n3.Regresar\n\nIngrese la opcion"));
				switch(opc3) {
				case 1:
					opc4 = Integer.parseInt(JOptionPane.showInputDialog("1. Objeto 1\n2. Objeto 2\n3. Objeto 3"));
					switch(opc4) {
					case 1:
						if(c1.e==true) {
							JOptionPane.showMessageDialog(null,"El objetvo ya se encuentra llenado");
						}
						else {
							c1.llenar();
						}
						break;
					case 2:
						if(c2.e==true) {
							JOptionPane.showMessageDialog(null,"El objetvo ya se encuentra llenado");
						}
						else {
							c2.llenar();
						}
						break;
					case 3:
						if(c3.e==true) {
							JOptionPane.showMessageDialog(null,"El objetvo ya se encuentra llenado");
						}
						else {
							c3.llenar();
						}
						break;
					}
					
					break;
					
				case 2:
					c1.most();
					c2.most();
					c3.most();
					break;
				}
				
				break;
				
			case 3:
				opc5 = Integer.parseInt(JOptionPane.showInputDialog("Clase 'audifono'\n\n1.Capturar Atributos\n2.Imprimir Objetos\n3.Regresar\n\nIngrese la opcion"));
				switch(opc5) {
				case 1:
					opc6 = Integer.parseInt(JOptionPane.showInputDialog("1. Objeto 1\n2. Objeto 2\n3. Objeto 3"));
					switch(opc6) {
					case 1:
						if(a1.e==true) {
							JOptionPane.showMessageDialog(null,"El objetvo ya se encuentra llenado");
						}
						else {
							a1.llenar();
						}
						break;
					case 2:
						if(a2.e==true) {
							JOptionPane.showMessageDialog(null,"El objetvo ya se encuentra llenado");
						}
						else {
							a2.llenar();
						}
						break;
					case 3:
						if(a3.e==true) {
							JOptionPane.showMessageDialog(null,"El objetvo ya se encuentra llenado");
						}
						else {
							a3.llenar();
						}
						break;
					}
					
					break;
					
				case 2:
					a1.most();
					a2.most();
					a3.most();
					break;
				}
				
				break;
				
			case 4:
				opc7 = Integer.parseInt(JOptionPane.showInputDialog("Clase 'mando'\n\n1.Capturar Atributos\n2.Imprimir Objetos\n3.Regresar\n\nIngrese la opcion"));
				switch(opc7) {
				case 1:
					opc8 = Integer.parseInt(JOptionPane.showInputDialog("1. Objeto 1\n2. Objeto 2\n3. Objeto 3"));
					switch(opc8) {
					case 1:
						if(ma1.e==true) {
							JOptionPane.showMessageDialog(null,"El objetvo ya se encuentra llenado");
						}
						else {
							ma1.llenar();
						}
						break;
					case 2:
						if(ma2.e==true) {
							JOptionPane.showMessageDialog(null,"El objetvo ya se encuentra llenado");
						}
						else {
							ma2.llenar();
						}
						break;
					case 3:
						if(ma3.e==true) {
							JOptionPane.showMessageDialog(null,"El objetvo ya se encuentra llenado");
						}
						else {
							ma3.llenar();
						}
						break;
					}
					
					break;
					
				case 2:
					ma1.most();
					ma2.most();
					ma3.most();
					break;
				}
				
				break;
				
			case 5:
				opc9 = Integer.parseInt(JOptionPane.showInputDialog("Clase 'computadora'\n\n1.Capturar Atributos\n2.Imprimir Objetos\n3.Regresar\n\nIngrese la opcion"));
				switch(opc9) {
				case 1:
					opc10 = Integer.parseInt(JOptionPane.showInputDialog("1. Objeto 1\n2. Objeto 2\n3. Objeto 3"));
					switch(opc10) {
					case 1:
						if(co1.e==true) {
							JOptionPane.showMessageDialog(null,"El objetvo ya se encuentra llenado");
						}
						else {
							co1.llenar();
						}
						break;
					case 2:
						if(co2.e==true) {
							JOptionPane.showMessageDialog(null,"El objetvo ya se encuentra llenado");
						}
						else {
							co2.llenar();
						}
						break;
					case 3:
						if(co3.e==true) {
							JOptionPane.showMessageDialog(null,"El objetvo ya se encuentra llenado");
						}
						else {
							co3.llenar();
						}
						break;
					}
					
					break;
					
				case 2:
					co1.most();
					co2.most();
					co3.most();
					break;
				}
				
				break;
				
			case 6:
				JOptionPane.showMessageDialog(null,"Adios!");
				s = true;
				break;
				
			}
			
		}
		
	}

}
