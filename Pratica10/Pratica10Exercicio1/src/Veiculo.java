
public class Veiculo {
	private String numChassi;
	private String marca;
	private String placa;
	private int ano;
	private String modelo;
	
	
	public Veiculo(String numChassi, String placa, String marca, String modelo, int ano) {
        this.numChassi = numChassi;
        this.marca = marca;
        this.placa = placa;
        this.ano = ano;
        this.modelo = modelo;
        
    }
	
	public String getNumChassi() {
		return(numChassi);
	}
	
	public void setNumChassi(String numChassi) {
		this.numChassi = numChassi;
	}
	
	public String getMarca() {
		return(marca);
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public String getPlaca() {
		return(placa);
	}
	
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	
	public int getAno() {
		return(ano);
	}
	
	public void setAno(int ano) {
		this.ano = ano;
	}
	
	public String getModelo() {
		return(modelo);
	}
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	@Override
    public String toString() {
        return "Veiculo{" +
                "numeroChassi='" + numChassi + '\'' +
                ", marca='" + marca + '\'' +
                ", placa='" + placa + '\'' +
                ", ano='" + ano + '\'' +
                ", modelo=" + modelo +
                '}';
    }
}
