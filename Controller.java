import java.util.Scanner;  // Import the Scanner class

class Controller{
	public static void main(String[] args){
		//Criando um funcionario
		Funcionario f1 = new Funcionario();

		f1.nome = "Jonas";
		f1.salario = 1000;
		f1.departamento = "Compras";
		f1.rg = "88.999.777-99";
		Data data = new Data();
		data.dia = 15;
		data.mes = 8;
		data.ano = 2011;
		f1.dataEntrada = data;

		// Comparação de funcionários com os mesmos atributos. 
		// Mesmo passando a mesma informação nos atributos eles serão diferentes, pois somente com a mesma referência de ponteiro serão iguais
		Funcionario f2 = new Funcionario();
		f2.nome = "Danilo";
		f2.salario = 100;

		// Mesmo que os funcionários 
		Funcionario f3 = f2;
		if (f2 == f3) {
			System.out.println("iguais");
		} else {
			System.out.println("diferentes");
		}


		Scanner sc = new Scanner(System.in);
		System.out.println("Deseja promover o funcionario e dar aumento de salario? S/N");
		String resposta = sc.nextLine();  // Read user input
    	if(resposta.equals("S")){

    		//Promovendo o funcionario e aumentando o salário

    		System.out.println("Qual o novo departamento?");
    		String novoDepartamento = sc.nextLine();

    		System.out.println("Qual o valor do aumento?");
    		double aumento = sc.nextInt();
			f1.recebeAumento(aumento);
			f1.mudaDepartamento(novoDepartamento); 

			f1.mostra();

    	} else{

    		f1.mostra();

    	}

		
		
		


	}
}