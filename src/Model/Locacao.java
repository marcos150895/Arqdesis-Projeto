package Model;

public class Locacao {
	private int id_cliente, id_veiculo,id_locacao;
	private String tarifa_locacao, estado_locacao, cidade_locacao, estado_devolucao,
			cidade_devolucao;
	private String pag_deb_banco, pag_deb_agencia, pag_deb_titular;
	private String pag_deb_cpf, pag_deb_conta, pag_cred_titular, pag_cred_cpf;
	private String pag_cred_n_cartao, pag_cred_cod_seguranca,
			pag_cred_data_validade, pag_cred_bandeira, data_horalocacao;
	private String cpf_cliente, nome_cliente;
	private String modelo_veiculo, placa_veiculo, fabricante_veiculo;
	

	public int getId_cliente() {
		return id_cliente;
	}

	public void setId_cliente(int id_cliente) {
		this.id_cliente = id_cliente;
	}

	public int getId_veiculo() {
		return id_veiculo;
	}

	public void setId_veiculo(int id_veiculo) {
		this.id_veiculo = id_veiculo;
	}

	public String getTarifa_locacao() {
		return tarifa_locacao;
	}

	public void setTarifa_locacao(String tarifa_locacao) {
		this.tarifa_locacao = tarifa_locacao;
	}

	public String getEstado_locacao() {
		return estado_locacao;
	}

	public void setEstado_locacao(String estado_locacao) {
		this.estado_locacao = estado_locacao;
	}

	public String getCidade_locacao() {
		return cidade_locacao;
	}

	public void setCidade_locacao(String cidade_locacao) {
		this.cidade_locacao = cidade_locacao;
	}

	public String getEstado_devolucao() {
		return estado_devolucao;
	}

	public void setEstado_devolucao(String estado_devolucao) {
		this.estado_devolucao = estado_devolucao;
	}

	public String getCidade_devolucao() {
		return cidade_devolucao;
	}

	public void setCidade_devolucao(String cidade_devolucao) {
		this.cidade_devolucao = cidade_devolucao;
	}

	public String getPag_deb_banco() {
		return pag_deb_banco;
	}

	public void setPag_deb_banco(String pag_deb_banco) {
		this.pag_deb_banco = pag_deb_banco;
	}

	public String getPag_deb_agencia() {
		return pag_deb_agencia;
	}

	public void setPag_deb_agencia(String pag_deb_agencia) {
		this.pag_deb_agencia = pag_deb_agencia;
	}

	public String getPag_deb_titular() {
		return pag_deb_titular;
	}

	public void setPag_deb_titular(String pag_deb_titular) {
		this.pag_deb_titular = pag_deb_titular;
	}

	public String getPag_deb_cpf() {
		return pag_deb_cpf;
	}

	public void setPag_deb_cpf(String pag_deb_cpf) {
		this.pag_deb_cpf = pag_deb_cpf;
	}

	public String getPag_deb_conta() {
		return pag_deb_conta;
	}

	public void setPag_deb_conta(String pag_deb_conta) {
		this.pag_deb_conta = pag_deb_conta;
	}

	public String getPag_cred_titular() {
		return pag_cred_titular;
	}

	public void setPag_cred_titular(String pag_cred_titular) {
		this.pag_cred_titular = pag_cred_titular;
	}

	public String getPag_cred_cpf() {
		return pag_cred_cpf;
	}

	public void setPag_cred_cpf(String pag_cred_cpf) {
		this.pag_cred_cpf = pag_cred_cpf;
	}

	public String getPag_cred_n_cartao() {
		return pag_cred_n_cartao;
	}

	public void setPag_cred_n_cartao(String pag_cred_n_cartao) {
		this.pag_cred_n_cartao = pag_cred_n_cartao;
	}

	public String getPag_cred_cod_seguranca() {
		return pag_cred_cod_seguranca;
	}

	public void setPag_cred_cod_seguranca(String pag_cred_cod_seguranca) {
		this.pag_cred_cod_seguranca = pag_cred_cod_seguranca;
	}

	public String getPag_cred_data_validade() {
		return pag_cred_data_validade;
	}

	public void setPag_cred_data_validade(String pag_cred_data_validade) {
		this.pag_cred_data_validade = pag_cred_data_validade;
	}

	public String getPag_cred_bandeira() {
		return pag_cred_bandeira;
	}

	public void setPag_cred_bandeira(String pag_cred_bandeira) {
		this.pag_cred_bandeira = pag_cred_bandeira;
	}

	public String getData_horalocacao() {
		return data_horalocacao;
	}

	public void setData_horalocacao(String data_horalocacao) {
		this.data_horalocacao = data_horalocacao;
	}

	public String getData_devo() {
		return data_devo;
	}

	public void setData_devo(String data_devo) {
		this.data_devo = data_devo;
	}

	public int getId_locacao() {
		return id_locacao;
	}

	public void setId_locacao(int id_locacao) {
		this.id_locacao = id_locacao;
	}

	public String getCpf_cliente() {
		return cpf_cliente;
	}

	public void setCpf_cliente(String cpf_cliente) {
		this.cpf_cliente = cpf_cliente;
	}

	public String getNome_cliente() {
		return nome_cliente;
	}

	public void setNome_cliente(String nome_cliente) {
		this.nome_cliente = nome_cliente;
	}

	public String getPlaca_veiculo() {
		return placa_veiculo;
	}

	public void setPlaca_veiculo(String placa_veiculo) {
		this.placa_veiculo = placa_veiculo;
	}

	public String getModelo_veiculo() {
		return modelo_veiculo;
	}

	public void setModelo_veiculo(String modelo_veiculo) {
		this.modelo_veiculo = modelo_veiculo;
	}

	public String getFabricante_veiculo() {
		return fabricante_veiculo;
	}

	public void setFabricante_veiculo(String fabricante_veiculo) {
		this.fabricante_veiculo = fabricante_veiculo;
	}

	private String data_devo;
}
