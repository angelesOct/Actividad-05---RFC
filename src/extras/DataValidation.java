/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extras;

import javax.swing.JOptionPane;

/**
 *
 * @author Octaviano
 */
public class DataValidation {
    
    public String String (String value){
        String dato ="";
        try{
            dato=(value);
            
        }catch(NumberFormatException err){
            JOptionPane.showMessageDialog(null,"Valores incorrectos");
            dato="";
        }
        return dato;
    }
    
}
