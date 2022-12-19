package desafio.logica;

public class Twitter {

	String postagem[] = new String[100];

	public Usuario usuario;
	public String twitter;

	public Twitter() {}

	public Twitter(Usuario usuario, String twitter) {
		this.usuario = usuario;
		this.twitter = twitter;
	}
	
	public String[] getPostagem() {
		return postagem;
	}
	
	public String getTwitter() {
		return twitter;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setPostagem(String[] postagem) {
		this.postagem = postagem;
	}
	public void setTwitter(String twitter) {
		this.twitter = twitter;
	}

	public String postar(Usuario usuario, String postagem) {
		return "Usuario " + usuario.getNome() + " twittou -> " + getPostagem() ;
	}
}
