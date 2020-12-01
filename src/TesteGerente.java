
public class TesteGerente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gerente g1 = new Gerente();

		g1.setNome("Gerente 1");
		g1.setCpf("00088877441");
		g1.setSalario(5000.0);
		g1.setSenha(2222);
		
		g1.autentica(2222);
		System.out.println(g1);
		System.out.println(g1.getBonificacao());
	}

}
