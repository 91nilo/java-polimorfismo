
public class Funcionario {
	
	private String nome;
	private String cpf;
	private double salario; //as classes-filho conseguem ver o atributo, outras não.
	private int tipo = 0; // 0 - Funcionário Comum ; 1 - Gerente; 2 - Diretor;
	
	public Funcionario(String nome, String cpf, double salario) {
		this.nome = nome;
		this.cpf = cpf;
		this.salario = salario;
	}
	
	public Funcionario() {
		
	}
	public double getBonificacao() {
		
		if(this.tipo == 0) {
			return this.salario * 0.05;
		} else if(this.tipo == 1) {
			return this.salario;
		}else {
			return this.salario + 1000.0;
		}
	}
	
	public int getTipo() {
		return this.tipo;
	}
	
	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCpf() {
		return this.cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public double getSalario() {
		return this.salario;
	}
	
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public String toString() {
		return "Nome: " + this.nome + "\nCPF: " + this.cpf + "\nSalário: " + this.salario;
	}
	
}
