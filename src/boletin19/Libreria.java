/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin19;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author propa
 */
public class Libreria {

    private  ArrayList<libro> lLibreria ;
      
      public Libreria(){
        lLibreria =new ArrayList<libro> ();
    }
      public void cargarLista(){
      libro lib = new libro(pedirTitulo(),pedirAutor(),pedirISBN(),pedirPrezo(),pedirNumunidades());  
      lLibreria.add(lib);
      }
       public String pedirTitulo(){
        return (JOptionPane.showInputDialog("Titulo: ") );
       }
       public String pedirAutor(){
        return (JOptionPane.showInputDialog("Autor: ") );
       }
       public String pedirISBN(){
           return (JOptionPane.showInputDialog("ISBN: "));
       }
        public float pedirPrezo(){
           return (Float.parseFloat( JOptionPane.showInputDialog("Prezo: ")));
      }   
       public float pedirNumunidades(){
        return (Float.parseFloat( JOptionPane.showInputDialog("Numumero de unidades: ")));
       } 

     public void Borrar(){
         String borrlibro=(JOptionPane.showInputDialog("Introduce el ISBN del libro a borrar"));
          for(int i=0;i<lLibreria.size();i++){
       
        if(lLibreria.get(i).numunidades==0){
          lLibreria.remove(i);          
        }
        }

} 

  

}
