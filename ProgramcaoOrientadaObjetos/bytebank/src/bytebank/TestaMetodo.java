/**
 * 
 */
package bytebank;

/**
 * @author tatianirodrigues
 *
 */
public class TestaMetodo {

	public static void main(String[] args) {
		Conta contaDaTati = new Conta();
		contaDaTati.saldo = 100; // = e para atributo
		contaDaTati.deposita(50); // ivonacao de metodo e ()
		
		System.out.println(contaDaTati.saldo);
		
		boolean conseguiuSacar = contaDaTati.saca(20);
		
		System.out.println(contaDaTati.saldo);
		System.out.println(conseguiuSacar );
		
		
		Conta contaDaAna = new Conta();
		contaDaAna.deposita(1000);
		
		contaDaAna.transfere(300, contaDaTati);
		
		if (contaDaAna.transfere(300, contaDaTati)) { // esse metodo devolve um boolean
			System.out.println("Transf feita");
		} else {
			System.out.println("Faltou dinheiro");
		}
		System.out.println(contaDaAna.saldo);
		System.out.println(contaDaTati.saldo);
		
		contaDaTati.titular = "Tatiani Pereira Rodrigues";
		System.out.println(contaDaTati.titular);
		
		
	}
}