
public class Gerente extends Funcionario {
// O gerente herda da classe funcionário
	private int senha;

	public boolean autentica(int senha) {
		if (this.senha == senha) {
			return true;
		} else {
			return false;
		}
	}
	
	public int getSenha() {
		return this.senha;
	}
	
	public void setSenha(int senha) {
		this.senha = senha;
	}
	
	public double getBonificacao() {
		System.out.println("Chamando o método de bonificacao de Gerente");
		return super.getBonificacao() + super.getSalario(); //SUPER indica que o método/atributo veio da classe-mãe
	}
}
