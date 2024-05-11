package Tarea3;

public class Palabra {
	
	//Variables: 
	
	private int id;
	private String palaleman;
	private String palespanyol;
	private String palingles;
	
	//Constructor:
	
	public Palabra(int id, String palaleman, String palespanyol, String palingles) {
		this.id=id;
		this.palaleman=palaleman;
		this.palespanyol=palespanyol;
		this.palingles=palingles;
	}
	
	//Métodos:
	
	@Override
	public String toString() {
		return "ID palabra: " + id + ", Alemán: " + palaleman + ", Español: " + palespanyol + ", Inglés: "
				+ palingles + ".";
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPalaleman() {
		return palaleman;
	}

	public void setPalaleman(String palaleman) {
		this.palaleman = palaleman;
	}

	public String getPalespanyol() {
		return palespanyol;
	}

	public void setPalespanyol(String palespanyol) {
		this.palespanyol = palespanyol;
	}

	public String getPalingles() {
		return palingles;
	}

	public void setPalingles(String palingles) {
		this.palingles = palingles;
	}
}
