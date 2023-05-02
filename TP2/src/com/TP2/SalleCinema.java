package com.TP2;

public class SalleCinema {


     private String filmProjete;
     private int capacite;
     private int nbPlacesDisponibles;
     private double prixBillet;
     private int nbPlacesVendues;
     
     public SalleCinema(String filmProjete, int capacite, int nbPlacesDisponibles, double prixBillet) {
         this.filmProjete = filmProjete;
         this.capacite = capacite;
         this.nbPlacesDisponibles = nbPlacesDisponibles;
         this.prixBillet = prixBillet;
         this.nbPlacesVendues = capacite - nbPlacesDisponibles;
     }
     
     public void vendrePlace() {
         if (!estPleine()) {
             nbPlacesDisponibles--;
             nbPlacesVendues++;
         }
     }
     
     public boolean estPleine() {
         return nbPlacesDisponibles == 0;
     }
     
     public int nbPlacesDisponibles() {
         return nbPlacesDisponibles;
     }
     
     public double tauxRemplissage() {
         return  nbPlacesVendues / capacite;
     }
     
     public String toString() {
         return "Film projeté : " + filmProjete + "\n" +
                "Tarif : " + prixBillet + "\n" +
                "Nombre de places : " + capacite + "\n" +
                "Taux remplissage : " + tauxRemplissage() + "\n" +
                "Nombre de places disponibles : " + nbPlacesDisponibles;
     }

     public class main {
         public static void main() {
             SalleCinema salle = new SalleCinema("The departed", 80,50, 500);
             
             System.out.println("Informations sur la salle de cinéma :\n" + salle.toString());
             
             salle.vendrePlace();
             salle.vendrePlace();
             
             System.out.println("\nAprès la vente de 2 places :\n" + salle.toString());
         }
     }
}