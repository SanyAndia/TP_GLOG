package iut.bad;

public class Femme extends Humain implements Consommation{
	
	public Femme(String nom, String prenom, int age) {
        super(nom, prenom, age);
    }
	
	@Override
    public void manger() {
        System.out.println("La femme mange.");
    }

    @Override
    public void boire() {
        System.out.println("La femme boit.");
    }

    public static void main(String[] args) {
        Homme homme = new Homme("Jean", "Dupont", 30);
        Femme femme = new Femme("Marie", "Dupont", 25);

        homme.ami(femme);
    }
}
