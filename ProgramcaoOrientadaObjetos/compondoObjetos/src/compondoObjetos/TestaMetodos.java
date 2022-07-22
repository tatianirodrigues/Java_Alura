/**
 * 
 */
package compondoObjetos;

import java.util.Scanner;

/**
 * @author tatianirodrigues
 *
 */
public class TestaMetodos {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		Pessoa tatiani = new Pessoa();
		Endereco enderecoDaTati = new Endereco();
		
		System.out.println("Digite o seu nome:");
		tatiani.nome = entrada.nextLine();
		

		tatiani.endereco = enderecoDaTati;
		
		enderecoDaTati.cidade = "Florianopolis";
		
		Empresa universoDaLuva = new Empresa();
		Endereco enderecoDaLuva = new Endereco();
		
		universoDaLuva.endereco = enderecoDaLuva;
		
		enderecoDaLuva.bairro = "Ingleses";
		
		
		System.out.println(enderecoDaTati.cidade);
		System.out.println(enderecoDaLuva.bairro);
		System.out.println(tatiani.endereco.cidade);
		
	}

}
