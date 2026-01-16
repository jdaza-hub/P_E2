/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ajustedenotas;

/**
 *
 * @author labesp
 */
public class Agregar {
    public void ajustar(double[] notas){
        for(int i=0;i< notas.length;i++){
            notas[i]= notas[i]+0.5;
        }
    }
}
