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
<script type="text/javascript">
	function confirmAction(URL,elid,qst){
		if(confirm(qst)){
			a simpleload(URL,elid)
		}
		return false
	}
	//function clickListener(e) {

		//var id = e.getAttribute(id);
		//console.document.write(id);
		//return id;
	//}
</script>
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
								<li><a><i class="fa fa-table"></i> Relat�rios <span
										class="fa fa-chevron-down"></span></a>
									<ul class="nav child_menu" style="display: none">
										<li><a href="RelatorioDia.html">Relat�rio do Dia</a></li>
									</ul></li>
								<li><a><i class="fa fa-road"></i> Loca��es <span
										class="fa fa-chevron-down"></span></a>
									<ul class="nav child_menu" style="display: none">
										<li><a href="Locacao.jsp">Loca��o</a></li>
										<li><a href="Devolucao.jsp">Devolu��o</a></li>
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
								<h1>Edi��o de Autom�vel</h1>
							</div>
							<div class="x_panel">
								<!--conteudo---------------------------->
								<div class="x_content">
									<br />
									<form id="demo-form2" data-parsley-validate
									action="EditarBuscarCarro" method="post"
										class="form-horizontal form-label-left">

										<div class="form-group">
											<label class="control-label col-md-3 col-sm-3 col-xs-12">Parametro<span
												class="required">*</span>
											</label>
											<div class="col-md-3 col-sm-3 col-xs-12">
												<select required="required" class="form-control" name="parametro">
													<option></option>
													<option>Placa</option>
													<option>Fabricante</option>
													<option>Preco</option>
													<option>Modelo</option>
												</select>
											</div>
										</div>

										<div class="form-group">
											<label class="control-label col-md-3 col-sm-3 col-xs-12"
												for="pesquise">Pesquise<span class="required">*</span>
											</label>
											<div class="col-md-6 col-sm-6 col-xs-12">
												<input type="text" id="pesquise" name="pesquise" required="required"
													class="form-control col-md-7 col-xs-12">
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
																<th>Modelo</th>
																<th>Placa</th>
																<th>Chassi</th>
																<th>Estado</th>
																<th>Cidade</th>
																<th>Fabricante</th>
																<th>Km</th>
																<th>Km Livre</th>
																<th>Km Controlado</th>
																<th>Grupo</th>
																<th>Acessorio</th>
																<th>Status</th>
																<th>Agencia</th>
																<th>Editar</th>
															</tr>
														<tbody>
															<%
																VeiculoTO to = (VeiculoTO) request.getAttribute("listaVeiculos");
																ArrayList<Veiculo> listaVeiculos = to.getlistaVeiculos();
																for (Veiculo veiculo : listaVeiculos) {

																	out.println("<tr id = " + veiculo.getCodigo() + ">");
																	out.println("<th>" + veiculo.getCodigo() + "</th>");
																	out.println("<td>" + veiculo.getModelo() + "</td>");
																	out.println("<td>" + veiculo.getPlaca() + "</td>");
																	out.println("<td>" + veiculo.getChassi() + "</td>");
																	out.println("<td>" + veiculo.getEstado() + "</td>");
																	out.println("<td>" + veiculo.getCidade() + "</td>");
																	out.println("<td>" + veiculo.getFabricante() + "</td>");
																	out.println("<td>" + veiculo.getKm() + "</td>");
																	out.println("<td>" + veiculo.getKm_livre() + "</td>");
																	out.println("<td>" + veiculo.getKm_controlado() + "</td>");
																	out.println("<td>" + veiculo.getGrupo() + "</td>");
																	out.println("<td>" + veiculo.getAcessorio() + "</td>");
																	out.println("<td>" + veiculo.getStatus() + "</td>");
																	out.println("<td>" + veiculo.getAgencia() + "</td>");

																	out.println("<td><a href=EditarRetornarCarro?id="
																			+ veiculo.getCodigo() + ">"

																			+ "Editar" + "</a></td>");

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