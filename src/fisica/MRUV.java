package fisica;

public class MRUV {
	public float velocidadeInicialMRUV;
	public float aceleracaoMRUV;
	public float tempoMRUV;
	
	public float calcularMRUV() {
		float totalMRUV = this.velocidadeInicialMRUV + this.aceleracaoMRUV * this.tempoMRUV;
		return totalMRUV;
	}
}
