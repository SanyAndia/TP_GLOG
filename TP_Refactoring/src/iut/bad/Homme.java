package iut.bad;

public class Homme extends Humain implements Consommation{
	
	public Homme(String nom, String prenom, int age) {
        super(nom, prenom, age);
    }
	
	@Override
    public void manger() {
        System.out.println("L'homme mange.");
    }

    @Override
    public void boire() {
        System.out.println("L'homme boit.");
    }
}
