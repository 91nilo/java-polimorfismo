//Aula sobre polimorfismo
public class TesteReferencias {

	public static void main(String[] args) {
		
		Funcionario g1 = new Gerente();
		
		g1.setNome("Marcos");
		g1.setSalario(5000.0);
		
		Funcionario f = new Funcionario();
		f.setSalario(2000.0);
		
		EditorVideo ev = new EditorVideo();
		ev.setSalario(2500);
		
		ControleBonificacao controle = new ControleBonificacao();
		//Polimorfismo - mesmo usando a refer�ncia gen�rica no m�todo, ao executar o c�digo, 
		//sempre ser� chamado o m�todo espec�fico.
		controle.registra(g1);
		controle.registra(f);
		controle.registra(ev);
		
		System.out.println(controle.getSoma());
	}

}
