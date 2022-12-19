package desafio.logica;

public class Usuario {

	String usuarios[] = new String[1];

	public String nome;
	public String email;
	public String senha;

	public Usuario() {
	}

	public Usuario(String nome, String email, String senha) {
		this.nome = nome;
		this.email = email;
		this.senha = senha;
	}

	public String getNome() {
		return nome;
	}

	public String getEmail() {
		return email;
	}

	public String getSenha() {
		return senha;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public void imprimirDados() {
		System.out.println("Usuario: " + getNome());
		System.out.println("Login  : " + getEmail());
	}
}
