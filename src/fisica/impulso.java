package fisica;

public class impulso {
	public float impulso;
	public float forcaMedia;
	public float intTempo;
	
	public float calcularforcaImpulso() {
		float totalForcaImpulso = this.forcaMedia * this.intTempo;
		return totalForcaImpulso;
	}
}
