
public class Autoridade implements FormatadorNome {

	private String nome;
	private String sobrenome;
	private String tratamento;
	private String titulo;
	private String genero;

	
	public Autoridade(String nome, String sobrenome, String tratamento, String genero, String titulo) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.tratamento = tratamento;
		this.genero = genero;
		this.titulo = titulo;
	}
	
	public Autoridade(String nome, String sobrenome, String tratamento, String genero) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.tratamento = tratamento;
		this.genero = genero;
	}
	
	public Autoridade(String nome, String sobrenome, String tratamento) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.tratamento = tratamento;
	}
	
		public String getTratamento() {
		return formatarNome(nome, sobrenome);
	}

	@Override
	public String formatarNome(String nome, String sobrenome) {
		if (this.tratamento == "Respeitoso") {
			if (this.genero == "masculino") {
				return "Sr." + " " + sobrenome;
			}
			return "Sra." + " " + sobrenome;
		}
		if (this.tratamento == "ComTitulo")
			return this.titulo + " " + nome + " " + sobrenome;
		return nome;
		
	}

}
