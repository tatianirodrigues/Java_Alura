/**
 * 
 */
package bytebank;

/**
 * @author tatianirodrigues
 *
 */
public class TestaGettersAndSetters {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Conta conta = new Conta (7777, 888);
		
		conta.setNumero(55);
		System.out.println(conta.getNumero());
	
		conta.setAgencia(400);
		System.out.println(conta.getAgencia());
		
		Cliente cliente = new Cliente();
		
		conta.setTitular(cliente);
		
		cliente.setNome("Tatiani Pereira");
		System.out.println(conta.getTitular().getNome());
		
		conta.getTitular().setProfissao("Professor");
		System.out.println(conta.getTitular().getProfissao());
		
		//agr em duas linhas
		Cliente titularDaConta = conta.getTitular();
		titularDaConta.setProfissao("Medico");
		System.out.println(titularDaConta.getProfissao());
			
	}
}

