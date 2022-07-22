/**
 * 
 */
package bytebank;

/**
 * @author tatianirodrigues
 *
 */
public class ContaPoupanca extends Conta {
	
	//Construtor
	public ContaPoupanca(int agencia, int numero) {
		super(agencia, numero);
	}
	public void deposita(double valor) {
		super.saldo += valor;
	}

}
