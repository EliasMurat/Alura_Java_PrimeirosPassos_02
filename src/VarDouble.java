public class VarDouble {

	public static void main(String[] args) {
		double salario = 1000.50;
		System.out.println("Meu sal�rio �: " + salario); 
		//Meu sal�rio �: 1000.5
		
		/*
		 *  O double(ponto flutuante) consegue receber um vaor inteiro,
		 *	mas um inteiro(int) n�o consegue receber um double.
		 */
		
		double divisao = 3.14 / 2;
		System.out.println(divisao);
		
		int outraDivisao = 5 / 2;
		System.out.println(outraDivisao);
		
		//Se os dois valores � ser dividido n�o ter ponto, ent�o o resultado � arredondado.
		double novaTentativa = 5 / 2;
		System.out.println(novaTentativa);
		
		//Se um dos dois valores � ser dividido ter ponto, ent�o o resultado � com v�rgula.
		double novaTentativa2 = 5.0 / 2;
		System.out.println(novaTentativa2);		
	}
	
}
