/**
 * 
 */
package bytebank;

/**
 * @author tatianirodrigues
 *
 */
public class TesteSacaValoresNegativos {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Conta conta = new Conta();
		
		conta.deposita(100);
		conta.saca(200);
		// botou o saldo(um atributo) no private para so usar metodos 
		System.out.println(conta.getSaldo());
		System.out.println(conta.saca(200));
	}

}