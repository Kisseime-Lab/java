/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package org.example.day_1;

/**
 *
 * @author ktevot
 */
public class Project_1 {

    public static void main(String[] args) {
        Animal chien = new Chien();
        Animal chat = new Chat();
        System.out.println(chien.bouger());
        System.out.println(chat.bouger());
    }
}

abstract class Animal {
    protected int pates;

    public abstract String manger();

    public abstract String bouger();
}

class Chien extends Animal {
    @Override
    public String bouger() {
        return "Le Chien marche";
    }

    @Override
    public String manger() {
        return "Le chien mange";

    }

    public Chien() {
        this.pates = 4;
    }
}

class Chat extends Animal {

    @Override
    public String bouger() {
        return "Le chat marche";
    }

    @Override
    public String manger() {
        return "Le chat mange";
    }

    public Chat() {
        this.pates = 4;
    }

}

