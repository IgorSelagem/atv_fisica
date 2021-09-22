package fisica;

public class forcaPeso {
	public String nome;
	public float peso;
	public float massa;
	public float gravidade;
	
	public float calcularForcaPeso() {
		float totalPeso = this.massa * this.gravidade;
		return totalPeso;
	}
}
