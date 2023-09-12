import javax.swing.JOptionPane;

public class Principal {

/*¬1. Haga un algoritmo que solicite el nombre, documento, edad y profesión de n personas e imprima la siguiente información:
- Total personas registradas
- Cantidad de personas ingresadas
- Cantidad de personas mayores de edad
- Cantidad de personas menores de edad. 
*/
	
	public static void main(String[] args) {
		int personas =Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de personas que va a ingresar"));	
		int menorDeEdad = 0;
		int mayorDeEdad = 0;
		for (int i = 0; i < personas; i++) {
			
			String nombre =JOptionPane.showInputDialog("Ingrese nombre #" + (i + 1));
			int documento=Integer.parseInt(JOptionPane.showInputDialog("Ingrese documento de " + nombre));
			int edad =Integer.parseInt(JOptionPane.showInputDialog("Ingrese su edad " + nombre ));
			String profesion =JOptionPane.showInputDialog("Ingrese su Profesion " + nombre);
			 
			if (edad >= 18) {
				mayorDeEdad ++;
			}else {
				menorDeEdad ++;
			}
			
		}
		
		JOptionPane.showInternalMessageDialog(null, 
				"Resultado:\n"+
				"Total de personas Registradas: " + personas + "\n" +
				"Mayores de edad ingresados: " + mayorDeEdad + "\n" +
				"Menores de edad ingresados: " + menorDeEdad );
	}

}
