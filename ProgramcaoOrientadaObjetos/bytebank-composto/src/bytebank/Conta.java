/**
 * 
 */
package bytebank;

/**
 * @author tatianirodrigues
 *
 */

public class Conta{
	private double saldo;
	int agencia;
	int numero;
	Cliente titular; // classe cliente
	//Cliente titular = new Cliente (); --> isso funciona e dai n precisa ficar criando novos cliente quando for rodar no main
	
	public void deposita(double valor) { //void nao devolve nada
		this.saldo = this.saldo + valor; // saldo ta azul pq ele e um atributo
	}
	
	public boolean saca(double valor){// retorna uma booleana
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		} else {
			return false;
		}
	}
	public boolean transfere(double valor,Conta destino) {
		if (this.saldo >= valor ) {
			//this.saldo -= valor; --> outro jeito de fazer mas melhor usar o saca
			this.saca(valor);// this. sig sacar dessa conta que esta invocando o metodo
			destino.deposita(valor);
			return true; // esse return encerra o codigo
		} else {
			return false;// precisa ter return pq e boolean
		}
	}
	
	// metodo para informar o saldo agr q ele esta privado
	public double getSaldo() { //-> getter
		return this.saldo;
	}
}