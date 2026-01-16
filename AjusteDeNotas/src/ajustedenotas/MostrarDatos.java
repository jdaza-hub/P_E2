/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ajustedenotas;

/**
 *
 * @author labesp
 */
public class MostrarDatos {
    public void mostrar(String nombre,double antes, double despues, boolean ajusto){
        System.out.println("Nombre: " + nombre);
        System.out.println("Promedio antea de sumar 0.5: " + antes);
        System.out.println("Promedio despues de sumar 0.5: " + despues);
        if (ajusto) {
            System.out.println("Promedio después del ajuste: " + despues);
        } else {
            System.out.println("No se aplicó ajuste a las notas.");
        }
    }
}
