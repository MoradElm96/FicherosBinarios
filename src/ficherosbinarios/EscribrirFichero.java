/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ficherosbinarios;

import java.io.DataInput;
import java.io.DataInputStream;
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
public class EscribrirFichero {
    
     static File f = new File("ficheroNuevo.dat");
     
     
    public static void main(String[] args) {
       escribirFichero();
       leerFichero();
    }
    
    
    public static void leerFichero(){
        try{
            
            FileInputStream fis = new FileInputStream(f);
            DataInputStream dis = new DataInputStream(fis);
            
            
            
            try{
                
                while(true){
                    //importante el orden del tipo de datos que se han escrito previamente o que contiene
                    System.out.println(dis.readUTF());
                    System.out.println(dis.readInt());
                    
                    
                }
                
                
            }catch(EOFException e){}
            
            
            dis.close();
            fis.close();
            
            
        }catch(FileNotFoundException e){}
        catch(IOException e){}
        
    }
    
    public static void escribirFichero(){
        
       
        
        String nombre = "Morad";
        int edad = 25;
        
        try{
            
            FileOutputStream fos = new FileOutputStream(f,true);// si ponemos true , los datos anteriores persisten
            DataOutputStream dos = new DataOutputStream(fos);
            
            dos.writeUTF(nombre);
            dos.writeInt(edad);
            
            
        }catch(IOException e ){}
        
        
    }
    
}
