/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProcesosBien;

import Otros.Aderezo;
import Postres.bien.Postre;

/**
 *
 * @author pablodelgado
 */
public class Quitar {
    
    public static void quitarAderezo(Object nombre,Aderezo aderezo){
        ((Postre)nombre).getAderezos().remove(aderezo);
    }
    
}
