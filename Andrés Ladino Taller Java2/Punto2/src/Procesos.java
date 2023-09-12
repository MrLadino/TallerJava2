import javax.swing.JOptionPane;

public class Procesos {

    public  void iniciar() {



         int[] arreglo1 = {1, 2, 3, 4, 5};
         int[] arreglo2 = {5, 4, 3, 2, 1};
         int[] resultado = new int[arreglo1.length];

         for (int i = 0; i < arreglo1.length; i++) {
             resultado[i] = arreglo1[i] + arreglo2[i];
         }

         System.out.println("Contenido del primer arreglo:");
         mostrarArreglo(arreglo1);

         System.out.println("\nContenido del segundo arreglo:");
         mostrarArreglo(arreglo2);

         System.out.println("\nContenido del arreglo resultante:");
         mostrarArreglo(resultado);
     }



 public  void mostrarArreglo(int[] arreglo) {
     for (int i = 0; i < arreglo.length; i++) {
         System.out.print(arreglo[i] + " ");
     }
     System.out.println();
 }


}