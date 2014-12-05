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
public class Lapin {
    private int age;
    private String nom;

    public Lapin(int age, String nom) {
        this.age = age;
        this.nom = nom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    
    public void crier() {
        System.out.println("HAAAAAAAAAA");
    }
    
}
