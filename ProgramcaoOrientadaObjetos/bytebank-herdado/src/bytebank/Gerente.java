package bytebank;

public class Gerente extends Funcionario implements Autenticavel {

	private int senha;

	//Metodo
	public boolean autentica(int senha) {
		if (this.senha == senha) {
			return true;
		} else {
			return false;
		}
	}
	//Sobrecarga
	public boolean autentica(String login, int senha) {
		if (this.senha == senha) {
			return true;
		} else {
			return false;
		}
	}

	public double getBonificacao() {
		return super.getSalario();
	}

	// Setter
	public void setSenha(int senha) {
		this.senha = senha;
	}

}
