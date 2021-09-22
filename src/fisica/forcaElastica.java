package fisica;

public class forcaElastica {
	public float forcaEL;
	public float constanteK;
	public float variavelX;
	
	public float calcularForcaElastica() {
		float totalFE = this.constanteK * this.variavelX;
		return totalFE;
	}
}
