/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplopoo;

import java.util.Scanner;

/**
 *
 * @author Toshiba
 */
public class EjemploPOO {
    private String nombre;
    private int edad;
    
    public void inicializar(){
        Scanner lector = new Scanner(System.in);
        System.out.println("Digite el nombre");
        nombre = lector.next();
        System.out.println("Digite la edad");
        edad = lector.nextInt();
    }
    
    public void imprimir(){
        System.out.println("el nombre es: "+nombre);
        System.out.println("la edad es: "+edad);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        EjemploPOO persona = new EjemploPOO();
        persona.inicializar();
        persona.imprimir();
    
    }
    
}
