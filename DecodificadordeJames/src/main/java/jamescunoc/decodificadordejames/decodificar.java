/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jamescunoc.decodificadordejames;

import java.util.Scanner;

/**
 *
 * @author james
 */
public class decodificar {
    Scanner entrada=new Scanner(System.in);
    public String Secuencia1;
    public String Secuencia2;
    
    
    public void pideADN1(){
        System.out.println("Ingresa la secuencia 1 del ADN:");
        Secuencia1=entrada.nextLine();
        pideADN2();
    }
    
    public void pideADN2(){
        System.out.println("Ingresa la secuencia 2 del ADN:");
        Secuencia2=entrada.nextLine();
        
        proceso();
    }
    
    
    public void proceso(){
        
    }
    
    
}
