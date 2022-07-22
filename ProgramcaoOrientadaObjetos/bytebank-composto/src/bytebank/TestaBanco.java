/**
 * 
 */
package bytebank;

/**
 * @author tatianirodrigues
 *
 */
public class TestaBanco {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cliente tatiani = new Cliente();
		tatiani.nome = "Tatiani Pereira Rodrigues";
		tatiani.cpf = "22222.00";
		tatiani.profissao = "Pedagoga";
		
		Conta contaDaTatiani = new Conta();
		contaDaTatiani.deposita(200);
		
		// assoscia o cliente tatiani com a contaDaTatiani
		contaDaTatiani.titular = tatiani; // linha liga os dois objetos "cliente e conta", ela compoe os dois objetos
		
		System.out.println(contaDaTatiani.titular.nome);
		System.out.println(tatiani.nome);
	}

}
