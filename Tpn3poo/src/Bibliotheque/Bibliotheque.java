package Bibliotheque;

import java.util.ArrayList;

public class Bibliotheque {
	private ArrayList<membre> membres;
	private ArrayList<livre> livres;
	private ArrayList<pret> pretes;

	public Bibliotheque() {
		membres = new ArrayList<membre>();
		livres = new ArrayList<livre>();
		pretes = new ArrayList<pret>();
	}

	public void ajouterLivre(livre nouvLivre) {
		this.livres.add(nouvLivre);
	}

	public void supprimerLivre(String supLivre) {
		for (livre livre : livres) {
			if (livre.titre.equals(supLivre)) {
				this.livres.remove(livre);
				break;
			}
		}
	}

	public void ajouterMembre(membre membre) {
		this.membres.add(membre);
	}

	public void supprimerMembre(String membrenom, String membrepre) {
		for (membre membre : membres) {
			if (membre.nom.equals(membrenom) && membre.prenom.equals(membrepre)) {
				this.membres.remove(membre);
				break;
			}
		}
	}

	public void emprunterLivre(String titre, membre emprunteur) {
		for (livre livre : livres) {
			if (livre.titre.equals(titre) && livre.getDispo()) {
				for (membre mem : membres) {
					if (mem.equals(emprunteur)) {
						livre.setEprenteur(emprunteur);
						this.pretes.add(new pret(livre, mem));
					}
				}

			}
		}
	}

	public void retournerLivre(String titre) {
		for (livre livre : livres) {
			if (livre.titre.equals(titre) && !livre.getDispo()) {
				livre.setDispo(true);
				livre.emprenteur =  (new membre("NULL", "NULL", 0));
			}
		}
	}

////////////////////////declaration class livre//////////////////////////////////
	public class livre {
		private String titre;
		private double prix;
		private boolean disponible = true;
		private Bibliotheque.membre emprenteur;

		public livre(String titre, double prix) {
			this.titre = titre;
			this.prix = prix;
		}

		public String getTitre() {
			return this.titre;
		}

		public boolean getDispo() {
			return this.disponible;
		}

		public double getPrix() {
			return this.prix;
		}

		public void setEprenteur(membre emprenteur) {
			this.setDispo(false);
			this.emprenteur = emprenteur;
		}

		public String getEmprenteur() {
			if (this.getDispo() == true) {
				return "NULL";
			}
			return this.emprenteur.toString();
		}

		public void setDispo(boolean changes) {
			this.disponible = changes;
		}

		public String toString() {
			return this.getTitre() + " " + this.getPrix() + " Emprenteur info : " + this.getEmprenteur();
		}

	}

////////////////////////declaration class membre//////////////////////////////////
	public class membre {
		private String nom, prenom;
		private int age;

		public membre(String nom, String prenom, int age) {
			this.nom = nom;
			this.prenom = prenom;
			this.age = age;
		}

		public String toString() {
			return this.nom + " " + this.prenom + " " + this.age;
		}
	}

////////////////////////declaration class pret//////////////////////////////////
	public class pret {
		private membre emprenteur;
		private livre livre;

		public pret(livre livre, membre membre) {
			this.emprenteur = membre;
			this.livre = livre;
		}

		public String toString() {
			return this.livre + "";
		}

	}

////////////////////////Public main Test Class//////////////////////////////////	
	public static void main(String[] args) {
		Bibliotheque lib = new Bibliotheque();
		Bibliotheque.livre v1 = lib.new livre("v1", 200.0);
		Bibliotheque.livre v2 = lib.new livre("v2", 200.0);
		lib.ajouterLivre(v1);
		lib.ajouterLivre(v2);
		Bibliotheque.membre m1 = lib.new membre("sa3id", "Merad", 19);
		Bibliotheque.membre m2 = lib.new membre("malek", "Merad", 20);
		lib.ajouterMembre(m1);
		lib.ajouterMembre(m2);
		System.out.println(lib.livres);
		lib.emprunterLivre("v1", m2);
		lib.emprunterLivre("v2", m1);
		System.out.println(lib.membres);
		System.out.println(lib.pretes);
		System.out.println(lib.livres);

	}

}


//كل كلاص وحدها. بدل الاسامي كابس ماج . ريقل لي ميتود
