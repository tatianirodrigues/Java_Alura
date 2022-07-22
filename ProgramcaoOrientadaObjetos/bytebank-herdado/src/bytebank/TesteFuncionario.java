/**
 * 
 */
package bytebank;

/**
 * @author tati
 *
 */
public class TesteFuncionario {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Gerente funcionario = new Gerente();
		funcionario.setNome("Tatiani");
		funcionario.setCpf("44444-4");
		funcionario.setSalario(2600.00);
		
		System.out.println(funcionario.getNome());
		System.out.println(funcionario.getBonificacao());
	}

}
