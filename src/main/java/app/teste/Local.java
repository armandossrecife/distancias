package app.teste;

public class Local {
	String descricao;
	double latitude;
	double logintude;
	
	public Local() {
		
	}
	
	public Local(String descricao, double latitude, double longitude) {
		this.descricao = descricao;
		this.latitude = latitude;
		this.logintude = longitude;
	}
	
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
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
