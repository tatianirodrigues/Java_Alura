/**
 * 
 */
package bytebank;

/**
 * @author tatianirodrigues
 *
 */
public class TesteReferencias {

	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 800; // primeiraComta nao e uma conta e uma flecha pra uma conta 
		
		System.out.println("saldo primeira conta: " + primeiraConta.saldo );
		
		Conta segundaComta = primeiraConta; // nao esta criando um novo objto conta esta so pegando a mesma referencia do primerio objto (priemria conta)
		
		System.out.println("saldo segunda conta: " + segundaComta.saldo);
		
		segundaComta.saldo += 100;
		
		System.out.println("novo saldo segunda conta: " + segundaComta.saldo);
		System.out.println("novo saldo primeira conta: " + primeiraConta.saldo); // muda tb o saldo da primeira conta, pq as duas variaveis etao apontando para o mesmo objeto
		
		if(primeiraConta == segundaComta) {
			System.out.println("sao a mesma conta");
		}
		
	}
}
