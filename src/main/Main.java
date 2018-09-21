/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
    import controllers.ControllRfc;
    import models.ModelRfc;
    import views.ViewRfc;
/**
 *
 * @author LAB-1
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ModelRfc modelRfc = new ModelRfc();
        ViewRfc viewRfc = new ViewRfc();
        ControllRfc controlRfc = new ControllRfc(modelRfc,viewRfc);
    }
    
}
