/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PrincipalBien;

import Otros.Aderezo;
import Postres.Helado;
import Postres.Pastel;
import ProcesosBien.Añadir;
import ProcesosBien.Quitar;

/**
 *
 * @author pablodelgado
 */
public class Sistema {
    
    public static void main(String [ ] args){
        // Producir un helado de vainilla y una torta de chocolate, 
        // a ambos agregarles CREMA y FRUTILLAS
        
        // Producir Helado
        Helado helado_vainilla = new Helado("Vainilla");
        Añadir.anadirAderezo(helado_vainilla, Aderezo.CREMA);
        Añadir.anadirAderezo(helado_vainilla, Aderezo.FRUTILLA);
        System.out.println(helado_vainilla);
        
        // Producir Pastel
        Pastel pastel_chocolate = new Pastel("Chocolate");
        Quitar.quitarAderezo(pastel_chocolate, Aderezo.CREMA);
        Añadir.anadirAderezo(pastel_chocolate, Aderezo.FRUTILLA);
        System.out.println(pastel_chocolate);
           
    }
    
}
