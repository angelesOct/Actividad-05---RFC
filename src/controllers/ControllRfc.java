/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;
import models.ModelRfc;
import views.ViewRfc;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Octaviano
 */
public class ControllRfc {
    ModelRfc modelRfc;
    ViewRfc viewRfc;
    
    ActionListener al = new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource()== viewRfc.jb_calcular) jb_calcular_action_performed(); 
            if (e.getSource()== viewRfc.jb_limpiar) jb_limpiar_action_performed(); 
        }
    };
  
    public ControllRfc(ModelRfc modelRfc, ViewRfc viewRfc) {
        viewRfc.setVisible(true);
        this.modelRfc = modelRfc;
        this.viewRfc = viewRfc;
        this.viewRfc.jb_calcular.addActionListener(al);
        this.viewRfc.jb_limpiar.addActionListener(al);
    }

   public void jb_calcular_action_performed(){
       viewRfc.setVisible(true);
       modelRfc.setApell_p(viewRfc.jtf_apellp.getText());
       modelRfc.setApell_m(viewRfc.jtf_apellm.getText()); 
       modelRfc.setNombre(viewRfc.jtf_nombre.getText());
       modelRfc.setDia((String)viewRfc.jcb_dia.getSelectedItem());
       modelRfc.setMes((String)viewRfc.jcb_mes.getSelectedItem());
       modelRfc.setAnio((String)viewRfc.jcb_anio.getSelectedItem());
       String RFC="";
       
       RFC=modelRfc.getApell_p().substring(0,2); //lleva las dos primeras letras el apellido paterno 
       RFC=RFC.concat(modelRfc.getApell_m().substring(0,1)); //se agrega la priera letra del segundo apellido
       RFC=RFC.concat(modelRfc.getNombre().substring(0,1)); //se agrega la primer letra del nombre
       RFC=RFC.concat(modelRfc.getAnio().substring(2,4)); //se agrega los dos ultimos dijitos del anio de nacimiento 
       RFC=RFC.concat(modelRfc.getMes()); //se agrega el mes de nacimiento
       RFC=RFC.concat(modelRfc.getDia()); //se agrega el dia de nacimiento
       viewRfc.jtf_resultado.setText(RFC.toUpperCase()+modelRfc.getSAT());//agregamos el resultado a jtf_resultado
   } 
   
   public void jb_limpiar_action_performed(){
       viewRfc.setVisible(true);
       this.viewRfc.jtf_apellp.setText(String.valueOf(modelRfc.getApell_p()));
       this.viewRfc.jtf_apellm.setText(String.valueOf(modelRfc.getApell_m()));
       this.viewRfc.jtf_nombre.setText(String.valueOf(modelRfc.getNombre()));
       this.viewRfc.jcb_dia.setSelectedIndex(0);
       this.viewRfc.jcb_mes.setSelectedIndex(0);
       this.viewRfc.jcb_anio.setSelectedIndex(0);
   }
}
