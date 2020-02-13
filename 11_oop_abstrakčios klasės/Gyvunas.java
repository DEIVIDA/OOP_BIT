import java.util.List;

public abstract class Gyvunas implements Comparable<Gyvunas>{

	private String name;
	private String type;

	/**
	 * @param name String, gyvuno vardas
	 * @param type String, gyvuno tipas
	 */
	public Gyvunas(String name, String type) {
		this.name = name;
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	@Override
	public int compareTo(Gyvunas o) {
		// TODO Auto-generated method stub
		if (this.getType()==o.getType()) {
			return this.getName().compareTo( o.getName() );
		} return this.getType().compareTo( o.getType() );	
		
	}
	
	/**
	 * Gyvuno paieska pagal varda
	 * @param list List<Gyvunas>
	 * @param vardas String
	 */
	public static void searchByName(List<Gyvunas> list, String vardas) {
		int noName = 0;
		for (int i = 0; i < list.size(); i++) {			
			if (list.get(i).getName().compareTo(vardas)==0) {
				System.out.println(list.get(i));
				noName++;
			}
		}
		if (noName==0) System.out.println("Tokio gyvuno nera sarase!");
	}
	

	

}
