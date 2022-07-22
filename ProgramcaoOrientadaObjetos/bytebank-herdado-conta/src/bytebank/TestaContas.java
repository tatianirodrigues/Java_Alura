/**
 * 
 */
package bytebank;

/**
 * @author tatianirodrigues
 *
 */
public class TestaContas {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ContaCorrente cc = new ContaCorrente(111, 111);
		cc.deposita(100);
		
		ContaPoupanca cp = new ContaPoupanca(222, 222);
		cp.deposita(200);
		cc.transfere(10, cp);
		
		System.out.println("Saldo da Conta Corrente: " + cc.getSaldo());
		System.out.println("Saldo da Conta Poupanca: " + cp.getSaldo());
	}

}
