package app.teste;

public class Usuario {
	String nome;
	double latitude;
	double logintude;
	
	public Usuario() {
		
	}
	
	public Usuario(String nome, double latitude, double longitude) {
		this.nome = nome;
		this.latitude = latitude;
		this.logintude = longitude;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String descricao) {
		this.nome = descricao;
	}
	public double getLatitude() {
		return latitude;
	}
	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}
	public double getLogintude() {
		return logintude;
	}
	public void setLogintude(double logintude) {
		this.logintude = logintude;
	}

}
