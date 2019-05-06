/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin32;

/**
 *
 * @author ecollazodominguez
 */
public class Boletin32 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Alumno alum = new Alumno("alba", 7);
        Alumno.Enderezo enderezo=alum.new Enderezo("Alfoso V", 5);
        
        alum.amosar();
        alum.setNota(10);
        alum.amosar();
    }
    
}
