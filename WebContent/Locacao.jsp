<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="java.util.*, java.text.*"%>
<%@page import="Model.*, TO.*"%>
<!DOCTYPE html>
<html lang="pt">

<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta charset="utf-8">

<title>Master Car Locadora</title>

<!--  CSS -------->
<link href="css/bootstrap.min.css" rel="stylesheet">
<link href="fonts/css/font-awesome.min.css" rel="stylesheet">
<link href="css/custom.css" rel="stylesheet">
<link href="css/floatexamples.css" rel="stylesheet" />

<!--  JS ---------->
<script src="js/jquery.min.js"></script>
<script src="js/bootstrap.min.js"></script>
<script src="js/custom.js"></script>


</head>


<body class="nav-md">

	<div class="container body">


		<div class="main_container">

			<div class="col-md-3 left_col">
				<div class="left_col scroll-view">

					<div class="navbar nav_title" style="border: 0;">
						<a href="Principal.html" class="site_title"><span>Master
								Car</span></a>
					</div>
					<div class="clearfix"></div>

					<!-- /menu prile quick info -->

					<br />

					<!-- sidebar menu -->
					<div id="sidebar-menu"
						class="main_menu_side hidden-print main_menu">

						<div class="menu_section">
							<ul class="nav side-menu">
								<li><a><a href="Principal.html"><i
											class="fa fa-home"></i>Home</a></a></li>
								<li><a><i class="fa fa-automobile"></i> Carro <span
										class="fa fa-chevron-down"></span></a>
									<ul class="nav child_menu" style="display: none">
										<li><a href="CadastrarCarro.html">Cadastrar</a></li>
										<li><a href="ConsultarCarro.html">Consultar</a></li>
										<li><a href="EditarCarro.html">Editar</a></li>
										<li><a href="ExcluirCarro.html">Excluir</a></li>
									</ul></li>
								<li><a><i class="fa fa-user"></i> Cliente <span
										class="fa fa-chevron-down"></span></a>
									<ul class="nav child_menu" style="display: none">
										<li><a href="CadastrarCliente.html">Cadastrar</a></li>
										<li><a href="ConsultarCliente.html">Consultar</a></li>
										<li><a href="EditarCliente.html">Editar</a></li>
										<li><a href="ExcluirCliente.html">Excluir</a></li>
									</ul></li>
								<li><a><i class="fa fa-table"></i> Relatórios <span
										class="fa fa-chevron-down"></span></a>
									<ul class="nav child_menu" style="display: none">
										<li><a href="RelatorioDia.html">Relatório do Dia</a></li>
									</ul></li>
								<li><a><i class="fa fa-road"></i> Locações <span
										class="fa fa-chevron-down"></span></a>
									<ul class="nav child_menu" style="display: none">
										<li><a href="Locacao.jsp">Locação</a></li>
										<li><a href="Devolucao.jsp">Devolução</a></li>
									</ul></li>
							</ul>
						</div>

					</div>
					<!-- /sidebar menu -->

					<!-- /menu footer buttons -->
				</div>
			</div>

			<!-- top navigation -->
			<div class="top_nav">

				<div class="nav_menu">
					<nav class="" role="navigation">
						<div class="nav toggle">
							<a id="menu_toggle"><i class="fa fa-bars"></i></a>
						</div>

					</nav>
				</div>

			</div>
			<!-- /top navigation -->


			<!-- page content -->
			<div class="right_col" role="main">

				<br />
				<div class="">

					<div class="row">
						<div class="col-md-12">
							<div class="x_panel">
								<h1>Locação</h1>
							</div>
							<div class="x_panel">
								<!--conteudo---------------------------->
								<div class="x_content">
									<br />
									<form id="demo-form2" data-parsley-validate 
										class="form-horizontal form-label-left" action ="Locacao"  method ="post">
										<%
											String codigVec = request.getParameter("idcarro");
											if (codigVec == null) {
												codigVec = " ";
											}
											String codigCli = request.getParameter("idcliente");
											if (codigCli == null || codigCli == "null") {
												codigCli = " ";
											}
										%>
										<div class="form-group">
											<label class="col-sm-3 control-label">Cliente</label>

											<div class="col-sm-3">
												<div class="input-group">
													<input type="text" class="form-control" 
														value="<%=codigCli%>" readonly="readonly" name="cliente"> <span
														class="input-group-btn"><a
														href="ConsultarClienteLocacao.jsp?idcarro=<%=codigVec%>">
															<button type="button" class="btn btn-primary">
																...</button>
													</a> </span>
												</div>
											</div>
										</div>

										<div class="form-group">
											<label class="col-sm-3 control-label">Veiculo</label> <input
												type="hidden" name="idcliente" value="<%=codigCli%>" />
											<div class="col-sm-3">
												<div class="input-group">
													<input type="text" class="form-control" name="veiculo"
														value="<%=codigVec%>" readonly="readonly" /> <span
														class="input-group-btn"> <a
														href="ConsultarCarroLocacao.jsp?idcliente=<%=codigCli%>" >


															<button type="button" class="btn btn-primary">...</button>
													</a>
													</span>
												</div>
											</div>
										</div>

										<div class="form-group">
											<label class="control-label col-md-3 col-sm-3 col-xs-12"
												for="estadoLoc">Data da Devolução<span
												class="required">*</span>
											</label>
											<div class="col-md-3 col-sm-3 col-xs-12">
												<input type="date" id="datadev" name="datadev"
													required="required" class="form-control col-md-7 col-xs-12">
											</div>
										</div>	
											
											
										<div class="form-group">
											<label class="control-label col-md-3 col-sm-3 col-xs-12"
												for="placa">Tarifa </label>
											<div class="radio">
												<label> <input type="radio" id="kmLivre"
													class="flat" checked name="iCheckTarifa" value ="Km livre"> Km Livre<br>
													<input type="radio" id="kmControlado" class="flat"
													name="iCheckTarifa" value="Km controlado"> Km Controlado
												</label>
											</div>
										</div>
										<br>
										<div class="form-group">
											<label class="control-label col-md-3 col-sm-3 col-xs-12"
												for="estadoLoc">Estado Locacação<span
												class="required">*</span>
											</label>
											<div class="col-md-3 col-sm-3 col-xs-12">
												<input type="text" id="estadoLoc" name="estadoLoc"
													required="required" class="form-control col-md-7 col-xs-12">
											</div>
										</div>

										<div class="form-group">
											<label class="control-label col-md-3 col-sm-3 col-xs-12"
												for="cidadeLoc">Cidade Locacação<span
												class="required">*</span>
											</label>
											<div class="col-md-3 col-sm-3 col-xs-12">
												<input type="text" id="cidadeLoc" name="cidadeLoc"
													required="required" class="form-control col-md-7 col-xs-12">
											</div>
										</div>
										<br>
										<div class="form-group">
											<label class="control-label col-md-3 col-sm-3 col-xs-12"
												for="estadoDev">Estado Devolução<span
												class="required">*</span>
											</label>
											<div class="col-md-3 col-sm-3 col-xs-12">
												<input type="text" id="estadoDev" name="estadoDev"
													required="required" class="form-control col-md-7 col-xs-12">
											</div>
										</div>

										<div class="form-group">
											<label class="control-label col-md-3 col-sm-3 col-xs-12"
												for="cidadeDev">Cidade Devolução<span
												class="required">*</span>
											</label>
											<div class="col-md-3 col-sm-3 col-xs-12">
												<input type="text" id="cidadeDev" name="cidadeDev"
													required="required" class="form-control col-md-7 col-xs-12">
											</div>
										</div>
										<br>

										<div class="form-group">

											<ul class="nav nav-tabs">
												<li class="active" ><a data-toggle="tab" href="#debito">Pagamento
														Debito |</a></li>
												<li><a data-toggle="tab" href="#credito">Pagamento
														Credito |</a></li>
											</ul>

											<div class="tab-content">
												<br>
												<div id="debito" class="tab-pane fade in active">
													<div class="form-group">
														<label for="banco"
															class="control-label col-md-3 col-sm-3 col-xs-12">Banco
														</label>
														<div class="col-md-3 col-sm-3 col-xs-12">
															<input id="banco" class="form-control col-md-7 col-xs-12"
																 type="text" name="banco">
														</div>
													</div>

													<div class="form-group">
														<label class="control-label col-md-3 col-sm-3 col-xs-12"
															for="agencia">Agencia
														</label>
														<div class="col-md-3 col-sm-3 col-xs-12">
															<input type="text" id="agencia" name="agencia"
																class="form-control col-md-7 col-xs-12">
														</div>
													</div>
													<div class="form-group">
														<label class="control-label col-md-3 col-sm-3 col-xs-12"
															for="nome">Nome Titular
														</label>
														<div class="col-md-3 col-sm-3 col-xs-12">
															<input type="text" id="nome" name="nome"
																class="form-control col-md-7 col-xs-12">
														</div>
													</div>
													<div class="form-group">
														<label class="control-label col-md-3 col-sm-3 col-xs-12"
															for="cpf">CPF
														</label>
														<div class="col-md-3 col-sm-3 col-xs-12">
															<input type="text" id="cpf" name="cpf"
																class="form-control col-md-7 col-xs-12">
														</div>
													</div>

													<div class="form-group">
														<label class="control-label col-md-3 col-sm-3 col-xs-12"
															for="conta">Conta Corrente
														</label>
														<div class="col-md-3 col-sm-3 col-xs-12">
															<input type="text" id="conta" name="conta"
																class="form-control col-md-7 col-xs-12">
														</div>
													</div>
												</div>


												<div id="credito" class="tab-pane fade">
													<div class="form-group">
														<label class="control-label col-md-3 col-sm-3 col-xs-12"
															for="nome">Nome Titular
														</label>
														<div class="col-md-3 col-sm-3 col-xs-12">
															<input type="text" id="nomeCred" name="nomeCred"
																class="form-control col-md-7 col-xs-12">
														</div>
													</div>

													<div class="form-group">
														<label class="control-label col-md-3 col-sm-3 col-xs-12"
															for="cpf">CPF>
														</label>
														<div class="col-md-3 col-sm-3 col-xs-12">
															<input type="text" id="cpfCred" name="cpfCred"
																class="form-control col-md-7 col-xs-12">
														</div>
													</div>

													<div class="form-group">
														<label class="control-label col-md-3 col-sm-3 col-xs-12"
															for="cartao">Numero do Cartão
														</label>
														<div class="col-md-3 col-sm-3 col-xs-12">
															<input type="text" id="cartao" name="cartao"
																class="form-control col-md-7 col-xs-12">
														</div>
													</div>

													<div class="form-group">
														<label class="control-label col-md-3 col-sm-3 col-xs-12"
															for="codigo">Código de Segurança
														</label>
														<div class="col-md-3 col-sm-3 col-xs-12">
															<input type="text" id="codigoSeg" name="codigoSeg"
																class="form-control col-md-7 col-xs-12">
														</div>
													</div>

													<div class="form-group">
														<label class="control-label col-md-3 col-sm-3 col-xs-12">Data
															Validade
														</label>
														<div class="col-md-3 col-sm-3 col-xs-12">
														<input id="data" name= "dataVal"
																class="date-picker form-control col-md-7 col-xs-12"
																 type="date">
														</div>
													</div>
													<div class="form-group">
														<div class="col-xs-6">
															<p class="lead">Bandeira</p>
															<div class="radio">
																<label> <input type="radio" id="visa"
																	class="flat" checked name="iCheck" value= "visa"><img
																	src="images/visa.png" alt="Visa"><br> <br>
																	<input type="radio" id="mastercard" class="flat"
																	name="iCheck" value= "masterCard"> <img src="images/mastercard.png"
																	alt="Mastercard"><br> <br> <input
																	type="radio" id="american" class="flat" name="iCheck" value= "american">
																	<img src="images/american-express.png"
																	alt="American Express"><br> <br> <input
																	type="radio" id="paypal" class="flat" name="iCheck" value= "Paypal">
																	<img src="images/paypal2.png" alt="Paypal"><br>
																	<br> 
																	
																	
																</label>
															</div>
														</div>

													</div>
												</div>
											</div>

										</div>


										<div class="form-group">
											<div class="col-md-6 col-sm-6 col-xs-12 col-md-offset-3">

												<button type="submit" class="btn btn-success">Locar</button>
											</div>
										</div>

									</form>
									
										<form id="demo-form2" data-parsley-validate
										
											class="form-horizontal form-label-right">
											<div class="col-md-6 col-sm-6 col-xs-12 col-md-offset-3">
											<button type="submit" class="btn btn-primary"
												onclick="Locacao.jsp">Cancelar</button>
												</div>
										</form>
									
								</div>
							</div>
							<!--conteudo fim------------------------>
						</div>
					</div>
				</div>
			</div>
			<!-- /page content -->
		</div>
	</div>

</body>

</html>