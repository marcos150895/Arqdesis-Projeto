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
								<li><a><i class="fa fa-road"></i> Locaçôes <span
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
								<h1>Edição de Automóvel</h1>
							</div>
							<div class="x_panel">
								<%
									VeiculoTO to = (VeiculoTO) request.getAttribute("veiculo");
									ArrayList<Veiculo> lista = to.getlistaVeiculos();
									Veiculo vl = lista.get(0);

									System.out.println(request.getAttribute("id")
											+ " id da pag veiculoForm");
									request.setAttribute("id", vl.getCodigo());
								%>
								<!--conteudo---------------------------->
								<div class="x_content">
									<br />
									<form id="demo-form2" data-parsley-validate
										class="form-horizontal form-label-left" action="AlterarCarro"
										method="post">
										<div class="form-group">
											<label class="control-label col-md-3 col-sm-3 col-xs-12"
												for="codigo">Codigo <span class="required">*</span>
											</label>

											<div class="col-md-6 col-sm-6 col-xs-12">
												<input type="text" name="codigo" id="codigo"
													required="required" class="form-control col-md-7 col-xs-12"
													value="<%=vl.getCodigo()%>" readonly="readonly">

											</div>
										</div>

										<div class="form-group">
											<label class="control-label col-md-3 col-sm-3 col-xs-12"
												for="modelo">Modelo<span class="required">*</span>
											</label>
											<div class="col-md-3 col-sm-3 col-xs-12">
												<input type="text" id="modelo" name="modelo"
													required="required" class="form-control col-md-7 col-xs-12"
													value="<%=vl.getModelo()%>">
											</div>
										</div>
										<div class="form-group">
											<label class="control-label col-md-3 col-sm-3 col-xs-12"
												for="placa">Placa<span class="required">*</span>
											</label>
											<div class="col-md-3 col-sm-3 col-xs-12">
												<input type="text" id="placa" name="placa"
													required="required" class="form-control col-md-7 col-xs-12"
													value="<%=vl.getPlaca()%>">
											</div>
										</div>
										<div class="form-group">
											<label for="chassi"
												class="control-label col-md-3 col-sm-3 col-xs-12">Chassi<span
												class="required">*</span>
											</label>
											<div class="col-md-3 col-sm-3 col-xs-12">
												<input id="chassi" class="form-control col-md-7 col-xs-12"
													required="required" type="text" name="chassi"
													value="<%=vl.getChassi()%>">
											</div>
										</div>

										<div class="form-group">
											<label class="control-label col-md-3 col-sm-3 col-xs-12"
												for="estado">Estado<span class="required">*</span>
											</label>
											<div class="col-md-3 col-sm-3 col-xs-12">
												<input type="text" id="estado" name="estado"
													required="required" class="form-control col-md-7 col-xs-12"
													value="<%=vl.getEstado()%>">
											</div>
										</div>
										<div class="form-group">
											<label class="control-label col-md-3 col-sm-3 col-xs-12"
												for="cidade">Cidade<span class="required">*</span>
											</label>
											<div class="col-md-3 col-sm-3 col-xs-12">
												<input type="text" id="cidade" name="cidade"
													required="required" class="form-control col-md-7 col-xs-12"
													value="<%=vl.getCidade()%>">
											</div>
										</div>
										<div class="form-group">
											<label class="control-label col-md-3 col-sm-3 col-xs-12"
												for="fabricante">Fabricante<span class="required">*</span>
											</label>
											<div class="col-md-3 col-sm-3 col-xs-12">
												<input type="text" id="fabricante" name="fabricante"
													required="required" class="form-control col-md-7 col-xs-12"
													value="<%=vl.getFabricante()%>">
											</div>
										</div>

										<div class="form-group">
											<label class="control-label col-md-3 col-sm-3 col-xs-12"
												for="km">Km<span class="required">*</span>
											</label>
											<div class="col-md-3 col-sm-3 col-xs-12">
												<input type="text" id="km" name="km" required="required"
													class="form-control col-md-7 col-xs-12"
													value="<%=vl.getKm()%>">
											</div>
										</div>
										<div class="form-group">
											<label class="control-label col-md-3 col-sm-3 col-xs-12"
												for="kmlivre">Km Livre<span class="required">*</span>
											</label>
											<div class="col-md-3 col-sm-3 col-xs-12">
												<input type="text" id="kmlivre" name="kmlivre"
													required="required" class="form-control col-md-7 col-xs-12"
													value="<%=vl.getKm_livre()%>">
											</div>
										</div>
										<div class="form-group">
											<label class="control-label col-md-3 col-sm-3 col-xs-12"
												for="kmrodado">Km Controlado<span class="required">*</span>
											</label>
											<div class="col-md-3 col-sm-3 col-xs-12">
												<input type="text" id="kmrodado" name="kmrodado"
													required="required" class="form-control col-md-7 col-xs-12"
													value="<%=vl.getKm_controlado()%>">
											</div>
										</div>

										<div class="form-group">
											<label class="control-label col-md-3 col-sm-3 col-xs-12">Grupo*</label>
											<div class="col-md-3 col-sm-3 col-xs-12">
												<select class="form-control" name="grupo"
													value="<%=vl.getGrupo()%>">
													<option>A Economico</option>
													<option>C Economico com Ar</option>
													<option>F Intermediario</option>
													<option>G Intermediario Wagon Especial</option>
													<option>H Executivo</option>
													<option>I Utilitario</option>
													<option>K Executivo Luxo</option>
													<option>M Intermediario Wagon</option>
													<option>N Pick up</option>
													<option>P 4 x 4 Especial</option>
													<option>R Minivan</option>
													<option>U Furgao</option>
													<option>Y Blindado</option>
												</select>
											</div>
										</div>

										<div class="form-group">
											<label class="control-label col-md-3 col-sm-3 col-xs-12">Acessório</label>
											<div class="col-md-3 col-sm-3 col-xs-12">
												<select class="form-control" name="acessorio"
													value="<%=vl.getAcessorio()%>">
													<option></option>
													<option>Navegador GPS</option>
													<option>Cadeira de Bebe</option>
													<option>Motorista</option>
												</select>
											</div>
										</div>

										<div class="form-group">
											<label class="control-label col-md-3 col-sm-3 col-xs-12">Status*</label>
											<div class="col-md-3 col-sm-3 col-xs-12">
												<select class="form-control" name="status"
													value="<%=vl.getStatus()%>">
													<option>Disponivel</option>
													<option>Nao Disponivel</option>
												</select>
											</div>
										</div>

										<div class="form-group">
											<label class="control-label col-md-3 col-sm-3 col-xs-12">Agência*</label>
											<div class="col-md-3 col-sm-3 col-xs-12">
												<select class="form-control" name="agencia"
													value="<%=vl.getAgencia()%>">
													<option>01</option>
													<option>02</option>
												</select>
											</div>
										</div>


										<div class="form-group">
											<div class="col-md-6 col-sm-6 col-xs-12 col-md-offset-3">
												<button type="submit" class="btn btn-success">Salvar</button>
											</div>
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