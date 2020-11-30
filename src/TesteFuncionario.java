
public class TesteFuncionario {

	public static void main(String[] args) {
		 
		Funcionario funcionario1 = new Funcionario("Nilo Rodrigues", "00088877755", 2500.0);
		
		funcionario1.setCpf("000.991.654-12");
		
		System.out.println(funcionario1.getNome());
		System.out.println(funcionario1.getCpf());
		System.out.println(funcionario1.getSalario());
	}

}
