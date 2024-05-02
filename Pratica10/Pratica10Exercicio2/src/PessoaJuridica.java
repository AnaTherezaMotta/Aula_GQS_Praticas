
public class PessoaJuridica {
		String nome;
		String cnpj;
		
		public PessoaJuridica(String nome, String cnpj) {
			this.nome = nome;
			this.cnpj = cnpj;
		}
		
		public String getNome() {
			return(nome);
		}
		
		public void setNome(String nome) {
			this.nome = nome;
		}
		
		public String getCNPJ() {
			return(cnpj);
		}
		
		public void setCNPJ(String cnpj) {
			this.cnpj = cnpj;
		}
		
	
		@Override
	    public String toString() {
	        return "Nome: " + nome + ", CNPJ: " + cnpj;
	    }
}
