/**
 * 
 */
package bytebank;

/**
 * @author tatianirodrigues
 *
 */
public class ContaCorrente extends Conta {
	
	//Construtor
	public ContaCorrente(int agencia, int numero) {
		super(agencia, numero);
	}
	
	//Metodos
	@Override
	public boolean saca(double valor) { 
		double saqueComTaxa = valor + 0.2;
		return super.saca(saqueComTaxa);
	}

//	@Override
//	public void deposita(double valor) {
//		super.getSaldo() += valor;
//	}
	
	@Override
	public void deposita(double valor) {
		super.saldo += valor;
	}
	

}
