package fisica;

public class velocidadeMedia {
	public float velocidadeMedia;
	public float posicaoInicial;
	public float posicaoFinal;
	public float tempoInicial;
	public float tempoFinal;
	
	public float calcularVelocidadeMedia() {
		float calcularPosicao = this.posicaoFinal - this.posicaoInicial;
		float calcularTempo = this.tempoFinal - this.tempoInicial;
		float calculoVM = calcularPosicao / calcularTempo;
		
		return calculoVM;
	}
}
