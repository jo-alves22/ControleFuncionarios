
class Funcionario{
	//Atributos
	String nome;
	String departamento;
	double salario;
	Data dataEntrada;
	String rg;

	void recebeAumento(double valorAumento){
		this.salario += valorAumento;
	}

	double calculaGanhoAnual(){
		double salarioAnual = this.salario * 12;
		return salarioAnual;
	}

	String mudaDepartamento(String setor){
		this.departamento = setor;
		return this.departamento;
	}

	void mostra(){
		System.out.println("======== Funcionario ========= ");
		System.out.println("Nome: " + this.nome);
		System.out.println("RG: " + this.rg);
		System.out.println("Salario mensal: " + this.salario);
		System.out.println("Salario anual: " + this.calculaGanhoAnual());
		System.out.println("Departamento: " + this.departamento);
		System.out.println("Data de entrada: " + this.dataEntrada.dia + "/" + this.dataEntrada.mes + "/" + this.dataEntrada.ano);
		System.out.println("============================== ");
	}
}