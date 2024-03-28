package iut.bad;

public class Humain {
	protected String nom;
	protected String prenom;
	protected int age;

	public Humain(String nom, String prenom, int age) {
	  this.nom = nom;
	  this.prenom = prenom;
	  this.age = age;
	}
	
	//methode pour afficher le nom, prénom, age en utilisant un méthode toString
	public void details() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Nom: " + nom + ", Prénom: " + prenom + ", Âge: " + age;
    }  
    
    //méthode boire et manger
    public void manger() {
    	System.out.println("l'Humain mange");
    }
    public void boire() {
    	System.out.println("l'Humain boit");
    }

}
