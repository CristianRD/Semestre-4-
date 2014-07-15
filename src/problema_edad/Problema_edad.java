/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package problema_edad;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Administrador
 */
public class Problema_edad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
      Persona estudiante []= new Persona[3];  
      
      String sTexto = "";
      BufferedReader br = new  BufferedReader (new InputStreamReader(System.in));
      
        Persona persona;
         int edad=0;
        for (int i=0; i< estudiante.length; i++){
      persona = new Persona();
 
    
     try {
         
          System.out.println("Nombre: ");
          sTexto = br.readLine();
          persona.setNombre(sTexto);
          
          System.out.println("Edad: ");
          sTexto = br.readLine();
          persona.setEdad(Integer.parseInt(sTexto));
          edad = edad+Integer.parseInt(sTexto);
          estudiante [i]=persona;
     
      }catch( IOException e){
        e.printStackTrace();  
      }
        
      }
    
/*

    int edad=0;
    for(int i=0;i <estudiante.length; i++){
        Persona per = estudiante[i];
        edad = edad+per.getEdad();
    */
        
    System.out.println("promedio edad:" + edad/3);
    }

}
