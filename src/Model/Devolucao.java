package Model;

public class Devolucao {
	private int codigoDevolucao,codigoLocacao;
	private String estado,cidade;
	private double total;
	public int getCodigoDevolucao() {
		return codigoDevolucao;
	}
	public void setCodigoDevolucao(int codigoDevolucao) {
		this.codigoDevolucao = codigoDevolucao;
	}
	public int getCodigoLocacao() {
		return codigoLocacao;
	}
	public void setCodigoLocacao(int codigoLocacao) {
		this.codigoLocacao = codigoLocacao;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
}
