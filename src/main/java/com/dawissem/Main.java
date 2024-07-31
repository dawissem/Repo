package com.dawissem;

import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Produit produitVide = new Produit();

        Produit produit1 = new Produit(1021.0, "Lait", "Delice", (int) 0.7);
        Produit produit2 = new Produit(2510.0, "Yaourt", "Vitalait", (int) 0.0); // prix initialisé à 0.0
        Produit produit3 = new Produit(3250.0, "Tomate", "Sicam", (int) 1.200);

        produit1.afficher();
        produit2.afficher();
        produit3.afficher();

        produit1.setPrix(0.700);
        produit1.afficher();

        produit2.setPrix(0.5); 

        produit2.afficher();
        produit3.afficher();

        System.out.println(produit1);
        System.out.println(produit2);
        System.out.println(produit3);

        produit1.setDateExpiration(new Date(2024, 8, 31)); // Exemple de date
        produit2.setDateExpiration(new Date(2024, 9, 15));
        produit3.setDateExpiration(new Date(2024, 10, 20));

        produit2.afficher();
        produit3.afficher();
    }
}