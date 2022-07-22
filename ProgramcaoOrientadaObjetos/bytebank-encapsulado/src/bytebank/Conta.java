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
	private int agencia;
	private int numero;
	private Cliente titular; // classe cliente
	//Cliente titular = new Cliente (); --> isso funciona e dai n precisa ficar criando novos cliente quando for rodar no main
	private static int total; // static "da classe", todo objeto conta agr tem acesso a esse mesmo total, nao e um total caracteristico para cada um, o total e da classe e nao do objeto
	//static e um atributo da classe
	
	//Construtor
	public Conta(int agencia, int numero) { //--> e um construtor de um objeti nao e um metodo, ele ta obrigando q qndo tu cria esse conta vc de os valores do numeor e da agencia
		Conta.total++; // aqui nao usa this. usa Conta. por causa do static
		System.out.println("O total de conta é " + Conta.total);
		
		// pode por um if aqui se quiser 
		
		this.agencia = agencia;
		this.numero = numero;
		System.out.println("estou criando uma conta " + this.numero);
	} 
	
	//Metodos
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
	// Metodo para informar o saldo agr q ele esta privado
	
	// Getters and Setters
	public double getSaldo() { //-> getter
		return this.saldo;
	}
	public int getNumero() {
		return this.numero;
	}
	public void setNumero(int numero) {// normamente metodos que alteram o atributo sao void
		if(numero < 0 || numero > 999999 ) {
			System.out.println("Atencao numero invalido!!");
			return;
		}
		this.numero = numero;

	}
	public int getAgencia () { // a variavel nova aqui tem o mesmo nome do atributo, e tudo bem pq qndo falamos do atributo usamos o this.
		return this.agencia;
	}
	public void setAgencia(int agencia) {
		if (agencia <=0) {
			System.out.println( "nao pode valor menos igual a 0");
			return; // --> como e void n poe nada do lado
		}
		this.agencia = agencia;
	}
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	public Cliente getTitular() {
		return titular;
	}
	public static int getTotal() { //bota o static pra poder invocar a classe no main Conta.gettotal()
		return Conta.total;// dentro de um metodo statico nao da de usar this., ele so vai acessar atributos etaticos
	}
}