package fisica;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
//		forcaCentripeta forcaCentri = new forcaCentripeta();
		forcaElastica forcaElas = new forcaElastica();
		forcaPeso forcaPeso = new forcaPeso();
		impulso imp = new impulso();
		MRU mru = new MRU();
		MRUV mruv = new MRUV();
		velocidadeMedia veloMed = new velocidadeMedia();
		
		System.out.println("Qual � o peso de um corpo (em kg): ");
		forcaPeso.massa = teclado.nextFloat();
		System.out.println("Qual a gravidade?");
		forcaPeso.gravidade = teclado.nextFloat();
		System.out.printf("O peso �: %s KG\n", forcaPeso.calcularForcaPeso());
		
		System.out.println("---------------------------------- ");
		
		System.out.println("Para saber o impulso de um objeto, precisamos de algumas informa��es, sendo ela a For�a M�dia, digite-a abaixo");
		imp.forcaMedia = teclado.nextFloat();
		System.out.println("Tempo percorrido:");
		imp.intTempo = teclado.nextFloat();
		System.out.printf("A for�a total de impulso total �: %s kg/f \n", imp.calcularforcaImpulso());
		
		System.out.println("----------------------------------");
		
		System.out.println("Para sabermos a for�a el�stica, precisamos da constante e variavel, digite a constante:");
		forcaElas.constanteK = teclado.nextFloat();
		System.out.println("Digite agora sua vari�vel X:");
		forcaElas.forcaEL = teclado.nextFloat();
		System.out.printf("A for�a el�stica de um objeto �: %s \n", forcaElas.calcularForcaElastica());
		
		System.out.println("----------------------------------");
		
		System.out.println("A velocidade m�dia de um objeto � calculada atrav�s de alguns fatores, dentre eles esta a posi��o e o tempo, inicial e final, conforme o programa pedir, insira os valores para calcular a velocidade m�dia:");
		System.out.println("-");
		System.out.println("Digite a posi��o inicial:");
		veloMed.posicaoInicial = teclado.nextFloat();
		System.out.println("Digite a posi��o final:");
		veloMed.posicaoFinal = teclado.nextFloat();
		System.out.println("Digite o tempo inicial:");
		veloMed.tempoInicial = teclado.nextFloat();
		System.out.println("Digite o tempo final:");
		veloMed.tempoFinal = teclado.nextFloat();
		System.out.printf("A velocidade m�dia calculada foi: %s m/s \n", veloMed.calcularVelocidadeMedia());
		
		System.out.println("-----------------------------------");
		
		System.out.println("O movimento retil�neo uniforme se da por duas informa��es, posi��o e tempo, portanto digite a posi��o:");
		mru.posicaoMRU = teclado.nextFloat();
		System.out.println("Digite o tempo:");
		mru.tempoMRU = teclado.nextFloat();
		System.out.printf("O resultado final �:%s s \n",mru.calcularMRU());
		
		System.out.println("-------------------");
		
		System.out.println("Para sabermos o MRUV, inicialmente precisamos da velocidade inicial, portanto digite-a:");
		mruv.velocidadeInicialMRUV = teclado.nextFloat();
		System.out.println("Acelera��o:");
		mruv.aceleracaoMRUV = teclado.nextFloat();
		System.out.println("Tempo:");
		mruv.tempoMRUV = teclado.nextFloat();
		System.out.printf("O resultado final �:%s s", mruv.calcularMRUV());
		
	}

}
