/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ues.edu.sv.prn335.boundary;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;



/**
 *
 * @author stany
 */
public class Vehiculos {
    public List<String> leertxt(String direccion){
        
        String texto="";
        List<String> ejemplo= new ArrayList<>();
        try{
        BufferedReader bf=new BufferedReader(new FileReader(direccion));
        String temp="";
        String bfRead;
        while((bfRead = bf.readLine()) != null){
        //bulce mientras se lee lon datos
            ejemplo.add(temp= temp+bfRead+"\n");
        //guardar el texto del archivo
        }
        ejemplo.size();
        texto=temp;
        
        }catch(Exception e){
        System.out.println("No se encontro archivo");
        }
    
   return ejemplo;
    }
  
}
