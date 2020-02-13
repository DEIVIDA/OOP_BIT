
public class Zuvis extends Gyvunas{

	private int pelekuKiekis;

	public Zuvis(String name) {
		super(name, "Zuvis");
	}

	@Override
	public String toString() {
		return "" + this.getType() + ". " + "Vardas: " + this.getName() + ", peleku kiekis: " + this.pelekuKiekis;
	}

	public int getPelekuKiekis() {
		return this.pelekuKiekis;
	}

	public void setPelekuKiekis(int pelekuKiekis) {
		this.pelekuKiekis = pelekuKiekis;
	}
	
}
