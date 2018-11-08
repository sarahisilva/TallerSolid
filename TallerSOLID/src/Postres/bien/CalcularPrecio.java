/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Postres.bien;

/**
 *
 * @author Administrador
 */
public class CalcularPrecio{
    
    public static double calcularPrecioFinal(Postre nombre){
        double precioFinal;
        precioFinal=((nombre.getPrecioParcial())+(nombre.getPrecioParcial()*0.12))+(nombre.getAderezos().size()*0.50);
        return precioFinal;
    }
}
