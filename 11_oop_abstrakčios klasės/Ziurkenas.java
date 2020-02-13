
public class Ziurkenas extends Gyvunas {

	private int uodegosIlgis;
	private String spalva;

	public Ziurkenas(String name) {
		super(name, "Ziurkenas");

	}

	@Override
	public String toString() {
		return "" + this.getType() + ". " + "Vardas: " + this.getName() + ", uodegos ilgis: " + this.uodegosIlgis + "cm, spalva: " + this.spalva;
	}

	public int getUodegosIlgis() {
		return this.uodegosIlgis;
	}

	public void setUodegosIlgis(int uodegosIlgis) {
		this.uodegosIlgis = uodegosIlgis;
	}

	public String getSpalva() {
		return this.spalva;
	}

	public void setSpalva(String spalva) {
		this.spalva = spalva;
	}
}
