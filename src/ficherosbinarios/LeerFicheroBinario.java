/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ficherosbinarios;

import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author Morad
 */
public class LeerFicheroBinario {
    
   
    
    public static void main(String[] args) {
        
       File f = new File("datosprofesor.bin");
       
       try {
           
      
       FileInputStream fis = new FileInputStream(f);
       DataInputStream dis = new DataInputStream(fis);
       //importante saber la estructura para leer y el tipo
       int id,operacion;
       String nombre,apellidos,especialidad;
       
       
       try{
           
           while(true){
           
               id = dis.readInt();
               nombre = dis.readUTF();
               apellidos = dis.readUTF();
               especialidad = dis.readUTF();
               operacion = dis.readInt();
               
               System.out.println("Id: " + id + " Nombre: "+ nombre + " Apellidos: "+ apellidos + " Especialidad: "+ especialidad + " Operacion: "+ operacion );
           
               
                       
           }
          
          
           
           
       }catch(EOFException e){}
       
        System.out.println("Ya no hay mas datos");
       
       
       
        }catch(FileNotFoundException e){}
       catch(IOException e){}
       
        
    }
    
}
