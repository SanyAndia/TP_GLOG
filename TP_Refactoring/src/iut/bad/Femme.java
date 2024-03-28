package iut.bad;

public class Femme {
	private String Nom;
	private String Prenom;
	private int Age;

	public Femme(String nom, String prenom, int age) {
		Nom = nom;
		Prenom = prenom;
		Age = age;
	}

	public String getNom() {
		return Nom;
	}

	public void setNom(String nom) {
		Nom = nom;
	}

	public String getPrenom() {
		return Prenom;
	}

	public void setPrenom(String prenom) {
		Prenom = prenom;
	}

	public int getAge() {
		return Age;
	}

	public void setAge(int age) {
		Age = age;
	}

}
