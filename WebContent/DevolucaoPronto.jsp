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
								<b>
									<h1>Devolucao</h1>
								</b>
							</div>
							<div class="x_panel">
								<!--conteudo---------------------------->
								<div class="x_content">
									<br />
									<form id="demo-form2" data-parsley-validate
										class="form-horizontal form-label-left">

										<div class="form-group">
											<label class="col-sm-3 control-label">Numero locacao</label>
											<%
												String num = (String) request.getAttribute("idlocacao");
												double total = (double) request.getAttribute("total");
												String cidade = (String) request.getAttribute("cidadeDev");
												String estado = (String) request.getAttribute("estadoDev");
												String km = (String) request.getAttribute("km");
											%>
											<div class="col-sm-3">
												<div class="input-group">
													<input type="text" class="form-control" value="<%=num%>"
														readonly="readonly" name="locacao">
												</div>
											</div>
										</div>



										<div class="form-group">
											<label class="control-label col-md-3 col-sm-3 col-xs-12"
												for="estadoDev">Estado Devolução<span
												class="required">*</span>
											</label>
											<div class="col-md-3 col-sm-3 col-xs-12">
												<input type="text" id="estadoDev" name="estadoDev"
													value="<%=estado%>" readonly="readonly"
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
													value="<%=cidade%>
													required="
													required" class="form-control col-md-7 col-xs-12"
													readonly="readonly">
											</div>
										</div>
										<br>

										<div class="form-group">
											<label class="control-label col-md-3 col-sm-3 col-xs-12"
												for="pesquise">KM</label>
											<div class="col-md-3 col-sm-3 col-xs-12">
												<input type="search" readonly="readonly" id="pesquise"
													value="<%=km%>" class="form-control col-md-7 col-xs-12"
													readonly="readonly">

											</div>
										</div>
										<br>

										<div class="form-group">
											<label class="control-label col-md-3 col-sm-3 col-xs-12"
												for="pesquise">Total</label>
											<div class="col-md-3 col-sm-3 col-xs-12">
												<input type="text" id="pesquise" readonly="readonly"
													class="form-control col-md-7 col-xs-12" value="<%=total%>">
											</div>
										</div>

										<div class="form-group">
											<div class="col-md-6 col-sm-6 col-xs-12 col-md-offset-3">
												<button type="submit" class="btn btn-success">Devolver</button>
												<!-- <button type="submit" class="btn btn-primary">Cancelar</button>-->
												
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