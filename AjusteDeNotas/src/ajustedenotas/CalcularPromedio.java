/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ajustedenotas;

/**
 *
 * @author labesp
 */
public class CalcularPromedio {
   public double calcular(double[] notas){
         double suma =0;
    for(int i=0;i < notas.length;i++){
        suma = suma+notas[i];
    }
    return suma / notas.length;
}
}

