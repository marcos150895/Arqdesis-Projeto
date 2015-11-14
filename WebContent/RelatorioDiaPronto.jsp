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
                        <a href="Principal.html" class="site_title"><span>Master Car</span></a>
                    </div>
                    <div class="clearfix"></div>

                    <!-- /menu prile quick info -->

                    <br />

                    <!-- sidebar menu -->
                    <div id="sidebar-menu" class="main_menu_side hidden-print main_menu">

                        <div class="menu_section">
                            <ul class="nav side-menu">
                                <li><a><a href="Principal.html"><i class="fa fa-home"></i>Home</a></a>
                                </li>
                                <li><a><i class="fa fa-automobile"></i> Carro <span class="fa fa-chevron-down"></span></a>
                                    <ul class="nav child_menu" style="display: none">
                                        <li><a href="CadastrarCarro.html">Cadastrar</a>
                                        </li>
                                        <li><a href="ConsultarCarro.html">Consultar</a>
                                        </li>
                                        <li><a href="EditarCarro.html">Editar</a>
                                        </li>
                                        <li><a href="ExcluirCarro.html">Excluir</a>
                                        </li>
                                    </ul>
                                </li>
                                <li><a><i class="fa fa-user"></i> Cliente <span class="fa fa-chevron-down"></span></a>
                                    <ul class="nav child_menu" style="display: none">
                                        <li><a href="CadastrarCliente.html">Cadastrar</a>
                                        </li>
                                        <li><a href="ConsultarCliente.html">Consultar</a>
                                        </li>
                                        <li><a href="EditarCliente.html">Editar</a>
                                        </li>
                                        <li><a href="ExcluirCliente.html">Excluir</a>
                                        </li>
                                    </ul>
                                </li>
                                <li><a><i class="fa fa-table"></i> Relatórios <span class="fa fa-chevron-down"></span></a>
                                    <ul class="nav child_menu" style="display: none">
                                        <li><a href="RelatorioDia.html">Relatório do Dia</a>
                                        </li>
                                    </ul>
                                </li>
                                <li><a><i class="fa fa-road"></i> Locações <span class="fa fa-chevron-down"></span></a>
                                    <ul class="nav child_menu" style="display: none">
                                        <li><a href="Locacao.jsp">Locação</a>
                                        </li>
                                        <li><a href="Devolucao.jsp">Devolução</a>
                                        </li>
                                    </ul>
                                </li>
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
                              <b> <h1>Relatório do Dia</h1></b>
                            </div>
							<div class="x_panel">
                            <!--conteudo---------------------------->
							<div class="x_content">
                                    <br />
                                    <form id="demo-form2" data-parsley-validate class="form-horizontal form-label-left"
                                    action ="BuscarLocacaoDia" method = "post">
											
											<div class="form-group">
												<label class="control-label col-md-3 col-sm-3 col-xs-12">Selecione uma Data <span class="required">*</span>
												</label>
												<div class="col-md-3 col-sm-3 col-xs-12">
													<input id="pesquise" name="pesquise" class="date-picker form-control col-md-7 col-xs-12" required="required" type="date">
													
												</div>
											</div> 
											
                                        <div class="form-group">
                                            <div class="col-md-6 col-sm-6 col-xs-12 col-md-offset-3">
                                                <button type="submit" class="btn btn-success">Pesquisar</button>
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
                                                <th>Fabricante</th>
                                                <th>Placa</th>
												<th>Nome Cliente</th>
                                                <th>CPF Cliente</th>
                                                <th>Data Prevista Devolução</th>
                                            </tr>
                                            </thead>
                                            <tbody>
														<%
														LocacaoTO to = (LocacaoTO)request.getAttribute("listaLocacao");
														int total = 0;
														
														ArrayList<Locacao> listaLocacao = to.getlistaLocacao(); 
														 for (Locacao locacao : listaLocacao) {
 
															out.println("<td>" + locacao.getId_locacao()
																	+ "</td>");
															out.println("<td>" + locacao.getModelo_veiculo()
																		+ "</td>");
															out.println("<td>" + locacao.getPlaca_veiculo()
																	+ "</td>");
															out.println("<td>" + locacao.getFabricante_veiculo()
																	+ "</td>");
															out.println("<td>" + locacao.getNome_cliente()
																		+ "</td>");
															out.println("<td>" + locacao.getCpf_cliente()
																	+ "</td>");
															out.println("<td>" + locacao.getData_horalocacao()
																	+ "</td>");	
															out.println("</tr>" );
															total ++;
														 }
														%>

														</tbody>
                                        
                                        </table>

                                </div>
                            </div>
                        </div>

										<div class="form-group">
                                            <label class="control-label col-md-3 col-sm-3 col-xs-12" for="pesquise">Total de Relatórios</label>
                                            <div class="col-md-3 col-sm-3 col-xs-12">
                                                <input type="text" id="pesquise" value="<%=total %>" readonly="readonly" class="form-control col-md-7 col-xs-12">
                                            </div>
											</div>
											
                                        <!--<div class="form-group">
                                              <div class="col-md-6 col-sm-6 col-xs-12 col-md-offset-3">
                                                <button type="submit" class="btn btn-success">Imprimir</button>
                                            </div>
                                        </div>-->
										
										
										
										

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