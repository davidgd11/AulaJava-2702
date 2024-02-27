package br.com.fiap;

public class TesteFolhaDePagamento {

	public static void main(String[] args) {
		
		FolhaDePagamento fp = new FolhaDePagamento();
		
		fp.salarioBruto = 5000.00;
		fp.numeroDeDependentes = 2;
		fp.descontoINSS = 10;
		fp.valorPlanoDeSaude = 50.00;
		
		System.out.println("Salario bruto: " + fp.salarioBruto);
		System.out.println("Dependentes: " + fp.numeroDeDependentes);
		System.out.println("Desconto INSS: " + fp.descontoINSS);
		System.out.println("Valor do plano de saúde: " + fp.valorPlanoDeSaude);
		
		
		System.out.println("\nSalario líquido é: R$" + fp.calcularSalarioLiquido());	
		

	}

}
