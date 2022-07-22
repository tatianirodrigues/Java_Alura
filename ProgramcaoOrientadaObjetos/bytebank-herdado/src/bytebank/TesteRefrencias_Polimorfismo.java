/**
 * 
 */
package bytebank;

/**
 * @author tati
 *
 */
public class TesteRefrencias_Polimorfismo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		Gerente gerente = new Gerente();
		gerente.setNome("Tatiani");
		gerente.setSalario(5000);
		

		EditorVideo editor = new EditorVideo();
		editor.setSalario(2500);
		
		Designer designer = new Designer();
		designer.setSalario(2000);
		
		ControleBonificacao controle = new ControleBonificacao();
		controle.registra(gerente);
	
		controle.registra(editor);
		controle.registra(designer);
		
		System.out.println(controle.getSoma());
		
	}
    
}
