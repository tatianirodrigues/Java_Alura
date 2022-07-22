/**
 * 
 */
package bytebank;

/**
 * @author tatianirodrigues
 *
 */
public class TestaContaSemCliente {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Conta contaDaMarcela = new Conta();
		
		//Cliente marcela = new Cliente (); nao precisa dessa variavel temporaria pode criar direto como ta ali em baixo 
		//contaDaMarcela.titular = marcela;
		
		contaDaMarcela.titular = new Cliente();
		
		contaDaMarcela.deposita(200);
		
		contaDaMarcela.titular.nome = "Marcela";
		contaDaMarcela.titular.profissao = "Professora";
		
		System.out.println (contaDaMarcela.getSaldo());
		System.out.println(contaDaMarcela.titular.nome);
		System.out.println(contaDaMarcela.titular.profissao);
	}

}
