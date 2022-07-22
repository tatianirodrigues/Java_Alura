/**
 * 
 */
package bytebank;

/**
 * @author tatianirodrigues
 *
 */
public class CriarConta {

	public static void main(String[] args) {
		Conta primeiraConta = new Conta(); // variavel do tipo conta chamda primeiraConta
		primeiraConta.saldo = 200; //a variavel criada dentro da classe conta esta sendo "acionada', usa o . pra fazer isso
		System.out.println(primeiraConta.saldo);
		
		primeiraConta.saldo += 100;
		System.out.println (primeiraConta.saldo);
	
		Conta segundaConta = new Conta();
		segundaConta.saldo = 50;
		
		System.out.println("a primeira conta tem: " + primeiraConta.saldo);
		System.out.println ("a segunta conta tem:" + segundaConta.saldo);
	
		System.out.println(primeiraConta.agencia); // quando o java cria objetos o valor default deles/ padrao e zero, o boolean e false
	}	
}

