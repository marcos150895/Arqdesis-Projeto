<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="java.util.*, java.text.*"%>
<%@page import="Model.*, TO.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
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
<SCRIPT LANGUAGE="JavaScript" TYPE="text/javascript">
	function decisao(codigo) {
		decisao = confirm("Clique em um botão!");

		if (decisao) {

			alert(codigo);
		} else {

			window.location.href = "ExcluirCliente.html";

		}
	}
</SCRIPT>

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
									<h1>Exclusão de Cliente</h1>
								</b>
							</div>
							<div class="x_panel">
								<!--conteudo---------------------------->
								<div class="x_content">
									<br />
									<form id="demo-form2" data-parsley-validate
										action="ExcluirBuscarCliente" method="post"
										class="form-horizontal form-label-left">

										<div class="form-group">
											<label class="control-label col-md-3 col-sm-3 col-xs-12">Parametro<span
												class="required">*</span>
											</label>
											<div class="col-md-3 col-sm-3 col-xs-12">
												<select required="required" id="parametro" name="parametro"
													class="form-control">
													<option></option>
													<option>CPF</option>
													<option>Nome</option>
													<option>RG</option>

												</select>
											</div>
										</div>

										<div class="form-group">
											<label class="control-label col-md-3 col-sm-3 col-xs-12"
												for="pesquise">Pesquise<span class="required">*</span>
											</label>
											<div class="col-md-6 col-sm-6 col-xs-12">
												<input type="text" id="pesquise" name="pesquise"
													required="required" class="form-control col-md-7 col-xs-12">
											</div>
										</div>

										<div class="form-group">
											<div class="col-md-6 col-sm-6 col-xs-12 col-md-offset-3">
												<button type="submit" class="btn btn-success">Consultar</button>
											</div>
										</div>






										<div class="col-md-12 col-sm-12 col-xs-12">
											<div class="x_panel">
												<div class="x_content">
													<table class="table table-hover">
														<thead>
															<tr>
																<th>#</th>
																<th>Nome</th>
																<th>CPF</th>
																<th>RG</th>
																<th>Validade CNH</th>
																<th>Data Nascimento</th>
																<th>Genero</th>
																<th>E.E</th>
																<th>Telefone Residencial</th>
																<th>Telefone Celular</th>
																<th>Telefone Comercial</th>
																<th>Email</th>
															</tr>
														</thead>
														<tbody>
															<%
																ClienteTO to = (ClienteTO) request.getAttribute("listaClientes");
																ArrayList<Cliente> lista = to.getLista();
																for (Cliente cliente : lista) {

																	out.println("<tr name = " + cliente.getCodigoCliente() + ">");
																	out.println("<th>" + cliente.getCodigoCliente() + "</th>");
																	out.println("<td>" + cliente.getNome() + "</td>");
																	out.println("<td>" + cliente.getCpf() + "</td>");
																	out.println("<td>" + cliente.getRg() + "</td>");
																	out.println("<td>" + cliente.getValidade_cnh() + "</td>");
																	out.println("<td>" + cliente.getData_nasc() + "</td>");
																	out.println("<td>" + cliente.getGenero() + "</td>");
																	out.println("<td>" + cliente.getEe() + "</td>");
																	out.println("<td>" + cliente.getTelefone() + "</td>");
																	out.println("<td>" + cliente.getCelular() + "</td>");
																	out.println("<td>" + cliente.getComercial() + "</td>");

																	out.println("<td>" + cliente.getEmail() + "</td>");
																	out.println("<td><a href=ExcluirCliente?id="+cliente.getCodigoCliente() + ">"
																			
																			+ "Excluir"
																			+ "</a></td>");

																	out.println("</tr>");
																}
															%>

														</tbody>
													</table>

												</div>
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