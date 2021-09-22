package fisica;

public class MRU {
	public float tempoMRU;
	public float posicaoMRU;
	
	public float calcularMRU() {
		float totalMRU = this.posicaoMRU / this.tempoMRU;
		return totalMRU;
	}
}
