package desafio.logica;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

// classe responsável por instanciar um novo usuario e twitter
public class Aplicativo {

	static Scanner ler = new Scanner(System.in);
	static LocalDateTime data = LocalDateTime.now();
	static DateTimeFormatter formataData = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
	static Usuario usuario = new Usuario();
	static Twitter twitter = new Twitter();

	public static void main(String[] args) {
		Integer op;
		do {
			MenuInicial();
			System.out.print("Escolha uma opção --> ");
			op = ler.nextInt();
			switch (op) {
			case 1: {
				System.out.println("Opção escolhida: " + op);
				Cadastro();
				break;
			}
			case 2: {
				System.out.println("Opção escolhida: " + op);
				Login();
				break;
			}
			case 3: {
				System.out.println("Opção escolhida: " + op);
				Logout();
				break;
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + op);
			}
		} while (op != 3);
	}

	static void MenuInicial() {
		System.out.println("+---------Menu--------+");
		System.out.println("|1) Cadastro Usuario -|");
		System.out.println("|2) Login Sistema ----|");
		System.out.println("|3) Logout -----------|");
		System.out.println("+---------------------+\n");
	}

	static void MenuLogin() {
		System.out.println("+---- Twitter Ada ----+");
		System.out.println("|1) Twittar ----------|");
		System.out.println("|2) Twittes ----------|");
		System.out.println("|3) Logout -----------|");
		System.out.println("+---------------------+\n");
	}

	static void Cadastro() {
		String nome, email, senha;
		System.out.print("Informe o seu nome de usuario: ");
		nome = ler.next();

		System.out.print("Informe o seu email: ");
		email = ler.next();

		System.out.print("Informe a sua senha: ");
		senha = ler.next();

		System.out.println("Cadastro Realizado com Sucesso em " + formatarData());
		usuario = new Usuario(nome, email, senha);
		usuario.imprimirDados();
	}

	static void Login() {
		System.out.println("login iniciado em " + formatarData());
		System.out.print("Informe o seu email: ");
		String email = ler.next();
		System.out.print("Informe o seu email: ");
		String senha = ler.next();
		if (usuario.getEmail().equalsIgnoreCase(email) && usuario.getSenha().equals(senha)) {
			System.out.println("USUARIO LOGADO COM SUCESSO");
			Integer op;
			do {
				MenuLogin();
				System.out.print("Escolha uma opção --> ");
				op = ler.nextInt();
				switch (op) {
				case 1: {
					System.out.println("O que está acontecendo?");
					String twiter = ler.nextLine();
					twitter.postar(usuario, twiter);
					// twitter.lerPostagem();
					System.out.println(twiter);
					break;
				}
				case 2: {
					System.out.println("Twittes publicados");
					twitter.lerPostagem();
				}

				case 3: {
					System.out.println("Opção escolhida: " + op);
					Logout();
					break;
				}
				default:
					throw new IllegalArgumentException("Unexpected value: " + op);
				}
			} while (op != 3);
		} else {
			System.out.println("O(s) Dado(s) Informado(s) Está(ão) Errado(s)");
		}
	}

	static void Logout() {
		// String dataFormatada
		// dataFormatada = data.format(formatada);
		System.out.println("Logout finalizado em " + formatarData());
		System.out.println("Tenha uma excelente semana!!!");
	}

	static String formatarData() {
		return data.format(formataData);
	}
}
