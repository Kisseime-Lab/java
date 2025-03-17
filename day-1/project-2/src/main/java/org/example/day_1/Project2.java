/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package org.example.day_1;

/**
 *
 * @author ktevot
 */
public class Project2 {

    public static void main(String[] args) {
        Forme cercle = new Cercle(5);
        Forme rectangle = new Rectangle(5, 5);
        System.out.println("Aire du cercle " + cercle.calculerAire());
        System.out.println("Aire du rectangle " + rectangle.calculerAire());
    }
}


abstract class Forme{
   public abstract double calculerAire();
}

class Cercle extends Forme {
    private double rayon;

    @Override
    public double calculerAire() {
        return 2 * Math.PI * rayon;
    }
    public Cercle(double rayon) {
        this.rayon = rayon;
    }
    
}

class Rectangle extends Forme {
    private double  largeur;
    private double  longueur;
    @Override
    public double calculerAire() {
        return largeur * longueur;
    }

    public Rectangle(double largeur, double longueur) {
        this.largeur = largeur;
        this.longueur = longueur;
    }
    
}