/**
 * 
 */
package bytebank;

/**
 * @author tatianirodrigues
 *
 */
public class ControleBonificacao {
	
	private double soma;
	
	public void registra(Funcionario funcionario){ // Mesmo usando uma referencia generica ao excutar o codigo vai chamar o metodo especifico
		
		double bonificacao = funcionario.getBonificacao();
		this.soma += bonificacao;	
	}

	public double getSoma() {
		return soma;
	}

}
