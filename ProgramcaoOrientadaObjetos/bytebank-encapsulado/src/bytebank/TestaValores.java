/**
 * 
 */
package bytebank;

/**
 * @author tatianirodrigues
 *
 */
public class TestaValores {

	public static void main(String[] args) {
		
		Conta conta = new Conta (1337, 88228);
		
		
		System.out.println(conta.getAgencia());
		
		Conta conta2 = new Conta (1337, 8855);
		Conta conta3 = new Conta (1337, 8456);
		
		System.out.println("Total: " + conta.getTotal());
		System.out.println(Conta.getTotal());// da pra chamar a classe pq o getter é static 
		
		
	}
}
