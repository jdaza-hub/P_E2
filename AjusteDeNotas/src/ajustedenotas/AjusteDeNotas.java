/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ajustedenotas;

import java.util.Scanner;

/**
 *
 * @author labesp
 */
public class AjusteDeNotas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el nombre:");
        String nombre= sc.nextLine();
        System.out.println("Ingrese la cantidad de notas:");
        int n=sc.nextInt();
        double[]notas=new double[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese la nota " + (i + 1) + ": ");
            notas[i] = sc.nextDouble();
        }
         Estudiante estudiante = new Estudiante(nombre, notas);
        CalcularPromedio calcular = new CalcularPromedio();
        Agregar agregar = new Agregar();
        MostrarDatos mostrar = new MostrarDatos();
       double antes = calcular.calcular(estudiante.getNotas());
        System.out.println("\n¿Desea aplicar el ajuste de +0.5 a las notas?");
        System.out.println("1. Sí");
        System.out.println("2. No");
        System.out.print("Seleccione una opción: ");
        int opcion = sc.nextInt();
        boolean ajustar = false;
        double despues = antes;

        if (opcion == 1) {
            agregar.ajustar(estudiante.getNotas()); 
            despues = calcular.calcular(estudiante.getNotas());
            ajustar = true;
        }

        mostrar.mostrar(
                estudiante.getNombre(),
                antes,
                despues,
                ajustar
        );
    }
    
}
