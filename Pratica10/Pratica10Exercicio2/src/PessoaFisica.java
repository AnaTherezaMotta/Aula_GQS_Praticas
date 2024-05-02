
public class PessoaFisica {
		String nome;
		String cpf;
		
		public PessoaFisica(String nome, String cpf) {
	        this.nome = nome;
	        this.cpf = cpf;
	        
	    }
		
		public String getNome() {
			return(nome);
		}
		
		public void setNome(String nome) {
			this.nome = nome;
		}
		
		public String getCPF() {
			return(cpf);
		}
		
		public void setCPF(String cpf) {
			this.cpf = cpf;
		}
		
		 @Override
		    public String toString() {
		        return "Nome: " + nome + ", CPF: " + cpf;
		    }
		
}
