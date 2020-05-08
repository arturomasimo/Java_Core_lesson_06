package lession6;

public class  Worker{
	private String pib;
	private String posada;
	
	public Worker(String pib, String posada) {
		super();
		this.pib = pib;
		this.posada = posada;
	}

	@Override
	public String toString() {
		return "Worker [pib=" + pib + ", posada=" + posada + "]";
	}

	
	
}
