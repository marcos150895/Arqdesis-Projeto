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
									<h1>Edição de Cliente</h1>
								</b>
							</div>
							<div class="x_panel">
								<%
									ClienteTO to = (ClienteTO) request.getAttribute("cliente");
									ArrayList<Cliente> lista = to.getLista();
									Cliente cl = lista.get(0);

									System.out.println(request.getAttribute("id")
											+ " id da pag clienteForm");
									request.setAttribute("id", cl.getCodigoCliente());
								%>


								<!--conteudo---------------------------->
								<div class="x_content">
									<br />
									<form id="demo-form2" data-parsley-validate
										action="AlterarCliente" method="post"
										class="form-horizontal form-label-left">
										<div class="form-group">
											<label class="control-label col-md-3 col-sm-3 col-xs-12"
												for="codigo">Codigo <span class="required">*</span>
											</label>

											<div class="col-md-6 col-sm-6 col-xs-12">
												<input type="text" name="codigo" id="codigo"
													required="required" readonly="readonly" class="form-control col-md-7 col-xs-12"
													value="<%=cl.getCodigoCliente()%>">

											</div>
										</div>
										<div class="form-group">
											<label class="control-label col-md-3 col-sm-3 col-xs-12"
												for="nome">Nome Completo <span class="required">*</span>
											</label>
											<div class="col-md-6 col-sm-6 col-xs-12">
												<input type="text" name="nome" id="nome" required="required"
													class="form-control col-md-7 col-xs-12"
													value="<%=cl.getNome()%>">


											</div>
										</div>
										<div class="form-group">
											<label class="control-label col-md-3 col-sm-3 col-xs-12"
												for="kmrodado">Email </label>
											<div class="col-md-6 col-sm-6
													col-xs-12">
												<input type="text" id="email" name="email"
													required="required" class="form-control col-md-7 col-xs-12"
													value="<%=cl.getEmail()%>">
											</div>
										</div>
										<div class="form-group">
											<label class="control-label col-md-3 col-sm-3 col-xs-12"
												for="CPF">CPF<span class="required">*</span>
											</label>
											<div class="col-md-3 col-sm-3 col-xs-12">
												<input type="text" id="cpf" name="cpf" required="required"
													class="form-control col-md-7 col-xs-12"
													value="<%=cl.getCpf()%>">
											</div>
										</div>
										<div class="form-group">
											<label for="chassi"
												class="control-label col-md-3 col-sm-3 col-xs-12">RG<span
												class="required">*</span>
											</label>
											<div class="col-md-3 col-sm-3 col-xs-12">
												<input id="rg" class="form-control col-md-7 col-xs-12"
													required="required" type="text" name="rg"
													value="<%=cl.getRg()%>">
											</div>
										</div>

										<div class="form-group">
											<label class="control-label col-md-3 col-sm-3 col-xs-12">Validade
												CNH*</label>
											<div class="col-md-3 col-sm-3 col-xs-12">
												<select class="form-control" id="mes_validade_cnh"
													name="mes_validade_cnh"
													value="<%=cl.getValidade_cnh().substring(2)%>">
													<option>2015</option>
                                                    <option>2016</option>
                                                    <option>2017</option>
                                                    <option>2018</option>
                                                    <option>2019</option>
                                                    <option>2020</option>
												</select> <select class="form-control" id="ano_validade_cnh"
													name="ano_validade_cnh"
													value="<%=cl.getValidade_cnh().substring(2, 4)%>">
													<option>01</option>
                                                    <option>02</option>
                                                    <option>03</option>
                                                    <option>04</option>
                                                    <option>05</option>
                                                    <option>06</option>
                                                    <option>07</option>
                                                    <option>08</option>
                                                    <option>09</option>
                                                    <option>10</option>
                                                    <option>11</option>
                                                    <option>12</option>
												</select>

											</div>
										</div>


										<div class="form-group">
											<label class="control-label col-md-3 col-sm-3 col-xs-12"
												for="estado">Data de Nascimento<span
												class="required">*</span>
											</label>
											<div class="col-md-3 col-sm-3 col-xs-12">
												<input type="date" id="nascimento"
													name="nascimento" required="required"
													class="form-control col-md-7 col-xs-12"
													value ="<%=cl.getData_nasc()%>">
											</div>
										</div>
										<div class="form-group">
											<label class="control-label col-md-3 col-sm-3 col-xs-12">Genero*</label>
											<div class="col-md-3 col-sm-3 col-xs-12">
												<select class="form-control" id=genero name=genero>
													<option>Masculino</option>
													<option>Feminino</option>
												</select>
											</div>
										</div>
										<div class="form-group">
											<label class="control-label col-md-3 col-sm-3 col-xs-12">E.E*</label>
											<div class="col-md-3 col-sm-3 col-xs-12" >
												<select class="form-control" id="ee" name="ee">
													<option>SP</option>
													<option>RJ</option>
												</select>
											</div>
										</div>

										<div class="form-group">
											<label class="control-label col-md-3 col-sm-3 col-xs-12"
												for="telRes">Telefone Residencial </label>
											<div class="col-md-3 col-sm-3 col-xs-12">
												<input type="text" id="telRes" name="telRes"
													 class="form-control col-md-7 col-xs-12"
													value="<%=cl.getTelefone()%>">
											</div>
										</div>
										<div class="form-group">
											<label class="control-label col-md-3 col-sm-3 col-xs-12"
												for="kmlivre">Telefone Celular </label>
											<div class="col-md-3 col-sm-3 col-xs-12">
												<input type="text" id="telCel" name="telCel"
													 class="form-control col-md-7 col-xs-12"
													value="<%=cl.getCelular()%>">
											</div>
										</div>
										<div class="form-group">
											<label class="control-label col-md-3 col-sm-3 col-xs-12"
												for="kmrodado">Telefone Comercial </label>
											<div class="col-md-3 col-sm-3 col-xs-12">
												<input type="text" id="telCom" name="telCom"
													 class="form-control col-md-7 col-xs-12"
													value="<%=cl.getComercial()%>">
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