
public class Teste {

	public static void main(String[] args) {
		Funcionario funcionario2 = new Funcionario();
		funcionario2.setSalario(3000.0);
		
		System.out.println(funcionario2.getTipo());
		System.out.println(funcionario2.getBonificacao());
		
		Funcionario f2 = new Funcionario();
		f2.setSalario(5000.0);
		f2.setTipo(2);
		f2.getBonificacao();
		
		System.out.println(f2.getTipo());
		System.out.println(f2.getBonificacao());

	}

}
