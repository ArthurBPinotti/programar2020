package suplemento;

public class TestarJson {

	public static void main(String args[]) {
		// cria uma pessoa
		Pessoa p = new Pessoa("Jo�o da Silva", "josilva@gmail.com", "99232-1212");
		// obt�m a vers�o json da pessoa e exibe essas informa��es
		System.out.println(p.json());
	}
}
