/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Postres.bien;

import Postres.*;
import java.util.ArrayList;
import Otros.Aderezo;

/**
 *
 * @author Pedro Mendoza
 */
public class Pastel extends Postre{

    public Pastel(String sabor) {
        super(sabor);
    }
    

    @Override
    public String toString() {
        return "Pastel{" + "sabor=" + getSabor() + ", precioParcial=" + getPrecioParcial() + ", aderezos=" + getAderezos() + '}';
    }
    
    
}
