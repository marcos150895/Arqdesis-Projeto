package Model;

public class Veiculo {
	private String grupo,acessorio,chassi, placa, cidade, estado, modelo, fabricante,status,agencia;
	private double km_livre, km_controlado, km;
	private int codigo;
	public String getGrupo() {
		return grupo;
	}
	public void setGrupo(String grupo) {
		this.grupo = grupo;
	}
	public String getAcessorio() {
		return acessorio;
	}
	public void setAcessorio(String acessorio) {
		this.acessorio = acessorio;
	}
	public String getChassi() {
		return chassi;
	}
	public void setChassi(String chassi) {
		this.chassi = chassi;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getFabricante() {
		return fabricante;
	}
	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}
	public double getKm_livre() {
		return km_livre;
	}
	public void setKm_livre(double km_livre) {
		this.km_livre = km_livre;
	}
	public double getKm_controlado() {
		return km_controlado;
	}
	public void setKm_controlado(double km_controlado) {
		this.km_controlado = km_controlado;
	}
	public double getKm() {
		return km;
	}
	public void setKm(double km) {
		this.km = km;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getAgencia() {
		return agencia;
	}
	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
}
