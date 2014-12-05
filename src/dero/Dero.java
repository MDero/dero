/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dero;

/**
 *
 * @author Maxime
 */
public class Dero {
    static int i = 0;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Hello world");
        Lapin lap = new Lapin(12, "Bob");
        while(i <= 10) {
            lap.crier();
            i = i +1;
        }
        System.out.println("Coucou");
    }
    
}
