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
		
		System.out.println("Qual é o peso de um corpo (em kg): ");
		forcaPeso.massa = teclado.nextFloat();
		System.out.println("Qual a gravidade?");
		forcaPeso.gravidade = teclado.nextFloat();
		System.out.printf("O peso é: %s KG\n", forcaPeso.calcularForcaPeso());
		
		System.out.println("---------------------------------- ");
		
		System.out.println("Para saber o impulso de um objeto, precisamos de algumas informações, sendo ela a Força Média, digite-a abaixo");
		imp.forcaMedia = teclado.nextFloat();
		System.out.println("Tempo percorrido:");
		imp.intTempo = teclado.nextFloat();
		System.out.printf("A força total de impulso total é: %s kg/f \n", imp.calcularforcaImpulso());
		
		System.out.println("----------------------------------");
		
		System.out.println("Para sabermos a força elástica, precisamos da constante e variavel, digite a constante:");
		forcaElas.constanteK = teclado.nextFloat();
		System.out.println("Digite agora sua variável X:");
		forcaElas.forcaEL = teclado.nextFloat();
		System.out.printf("A força elástica de um objeto é: %s \n", forcaElas.calcularForcaElastica());
		
		System.out.println("----------------------------------");
		
		System.out.println("A velocidade média de um objeto é calculada através de alguns fatores, dentre eles esta a posição e o tempo, inicial e final, conforme o programa pedir, insira os valores para calcular a velocidade média:");
		System.out.println("-");
		System.out.println("Digite a posição inicial:");
		veloMed.posicaoInicial = teclado.nextFloat();
		System.out.println("Digite a posição final:");
		veloMed.posicaoFinal = teclado.nextFloat();
		System.out.println("Digite o tempo inicial:");
		veloMed.tempoInicial = teclado.nextFloat();
		System.out.println("Digite o tempo final:");
		veloMed.tempoFinal = teclado.nextFloat();
		System.out.printf("A velocidade média calculada foi: %s m/s \n", veloMed.calcularVelocidadeMedia());
		
		System.out.println("-----------------------------------");
		
		System.out.println("O movimento retilíneo uniforme se da por duas informações, posição e tempo, portanto digite a posição:");
		mru.posicaoMRU = teclado.nextFloat();
		System.out.println("Digite o tempo:");
		mru.tempoMRU = teclado.nextFloat();
		System.out.printf("O resultado final é:%s s \n",mru.calcularMRU());
		
		System.out.println("-------------------");
		
		System.out.println("Para sabermos o MRUV, inicialmente precisamos da velocidade inicial, portanto digite-a:");
		mruv.velocidadeInicialMRUV = teclado.nextFloat();
		System.out.println("Aceleração:");
		mruv.aceleracaoMRUV = teclado.nextFloat();
		System.out.println("Tempo:");
		mruv.tempoMRUV = teclado.nextFloat();
		System.out.printf("O resultado final é:%s s", mruv.calcularMRUV());
		
	}

}
