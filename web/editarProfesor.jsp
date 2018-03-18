<%@page import="Modelo.Profesor"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <%
    Profesor p=(Profesor)request.getSession().getAttribute("profesor");
    if(p!=null){
        if(p.getTipoU()==1){
            response.sendRedirect("menuProfesor.jsp");
        }
    }else{
        response.sendRedirect("index.jsp");
    }
    %>
    <head>
        <meta charset="utf-8" />
        <link rel="icon" type="image/png" href="assets/img/colegio.ico">
        <link rel="apple-touch-icon" sizes="76x76" href="assets/img/apple-icon.png">
        <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />

        <title>Gestion Profesor</title>

        <meta content='width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0' name='viewport' />
        <meta name="viewport" content="width=device-width" />

        <!-- Bootstrap core CSS     -->
        <link href="assets/css/bootstrap.min.css" rel="stylesheet" />
        <link href="assets/css/paper-kit.css?v=2.1.0" rel="stylesheet"/>

        <!--  CSS for Demo Purpose, don't include it in your project     -->
        <link href="assets/css/demo.css" rel="stylesheet" />

        <!--     Fonts and icons     -->
        <link href='http://fonts.googleapis.com/css?family=Montserrat:400,300,700' rel='stylesheet' type='text/css'>
        <link href="http://maxcdn.bootstrapcdn.com/font-awesome/latest/css/font-awesome.min.css" rel="stylesheet">
        <link href="assets/css/nucleo-icons.css" rel="stylesheet" />

    </head>
    <body style="background-color:black">
        <%@include file="headerAdmin.jsp" %>
        <div class="container-fluid text-center">    
            <div class="row content">
                <div class="col-sm-2 sidenav">

                </div>
                <div class="col-sm-8 text-left"> 
                    <br>
                    <br>
                    <br>
                    <br>


                    <div class="container">
                       <a class href="crearProfesor.jsp">
                            <button type="button" class="btn btn-default btn-round"> Crear Profesor</button>
                        </a>                      
                        <a  href="editarProfesor.jsp">
                            <button type="button" class="btn btn-default btn-round">Editar Profesor</button>
                        </a>                      
                        <a  href="verProfesor.jsp">
                            <button   type="button" class="btn btn-default btn-round">Ver Profesor</button>  
                        </a>                       
                        <a  href="eliminarProfesor.jsp">
                            <button   type="button" class="btn btn-default btn-round">Eliminar Profesor</button>  
                        </a>
                        <br>
                        <br>



                        <form id="CrearP" style="display:none; ">
                            <div class="form-group">
                                <label style="color:white">Cedula:</label>
                                <input  class="form-control form-control-success" name="cedula"  value="">
                            </div>
                            <div class="form-group">
                                <label style="color:white">Nombre:</label>
                                <input  class="form-control form-control-success" name="nombre"  value="">
                            </div>
                            <div class="form-group">
                                <label style="color:white" >Usuario:</label>
                                <input  class="form-control form-control-success" name="usuario" r value="">
                            </div>
                            <div class="form-group">
                                <label style="color:white" >Contraseña:</label>
                                <input  class="form-control form-control-success" name="password"  value="">
                            </div>
                            <div class="form-group">
                                <label style="color:white" >Tipo de Usuario:</label>
                                <input  class="form-control form-control-success" name="tipousuario"  value="">
                            </div>
                            <div class="form-group">
                                <label style="color:white">Fecha de Nacimiento:</label>
                                <input  class="form-control form-control-success" name="fechanacimiento"  value="">
                            </div> 
                            <div class="form-group">
                                <label style="color:white">Tipo de Sangre:</label>
                                <input  class="form-control form-control-success" name="tiposangre"  value="">
                            </div> 
                            <div class="form-group">
                                <div class="form-group">
                                    <label style="color:white">RH:</label>
                                    <input  class="form-control form-control-success" name="rh" value="">
                                </div> 
                                <label style="color:white">Correo:</label>
                                <input  class="form-control form-control-success" name="correo"  value="">
                            </div>
                            <div class="form-group">
                                <label style="color:white">Celular:</label>
                                <input  class="form-control form-control-success" name="celular"  value="">
                            </div> 
                            <div class="form-group">
                                <label style="color:white">Direccion:</label>
                                <input  class="form-control form-control-success" name="direccion"  value="">
                            </div> 
                            <div class="form-group">
                                <label style="color:white">Estudios:</label>
                                <input  class="form-control form-control-success" name="estudios"  value="">
                            </div> 
                            <div class="form-group">
                                <label style="color:white">Experiencia:</label>
                                <input  class="form-control form-control-success" name="celular" value="">
                            </div> 
                            <button type="submit" class="btn btn-neutral" name="Enviar">Enviar</button>
                        </form>



                        <div  class="EditarP" class="form-group" style="display:none;" >
                            <label style="color:white" >Buscar Profesor:</label>
                            <input  class="form-control form-control-success" name="cedula" value="">
                        </div>




                        <form class="EditarP" style="display:none; ">
                            <br>
                            <div class="form-group">
                                <label style="color:white">Cedula:</label>
                                <input  class="form-control form-control-success" name="cedula"  value="">
                            </div>
                            <div class="form-group">
                                <label style="color:white">Nombre:</label>
                                <input  class="form-control form-control-success" name="nombre"  value="">
                            </div>
                            <div class="form-group">
                                <label style="color:white" >Usuario:</label>
                                <input  class="form-control form-control-success" name="usuario"  value="">
                            </div>
                            <div class="form-group">
                                <label style="color:white" >Contraseña:</label>
                                <input  class="form-control form-control-success" name="password"  value="">
                            </div>
                            <div class="form-group">
                                <label style="color:white" >Tipo de Usuario:</label>
                                <input  class="form-control form-control-success" name="tipousuario"  value="">
                            </div>
                            <div class="form-group">
                                <label style="color:white">Fecha de Nacimiento:</label>
                                <input  class="form-control form-control-success" name="fechanacimiento"  value="">
                            </div> 
                            <div class="form-group">
                                <label style="color:white">Tipo de Sangre:</label>
                                <input  class="form-control form-control-success" name="tiposangre"  value="">
                            </div> 
                            <div class="form-group">
                                <div class="form-group">
                                    <label style="color:white">RH:</label>
                                    <input  class="form-control form-control-success" name="rh"  value="">
                                </div> 
                                <label style="color:white">Correo:</label>
                                <input  class="form-control form-control-success" name="correo"  value="">
                            </div>
                            <div class="form-group">
                                <label style="color:white">Celular:</label>
                                <input  class="form-control form-control-success" name="celular"  value="">
                            </div> 
                            <div class="form-group">
                                <label style="color:white">Direccion:</label>
                                <input  class="form-control form-control-success" name="direccion" value="">
                            </div> 
                            <div class="form-group">
                                <label style="color:white">Estudios:</label>
                                <input  class="form-control form-control-success" name="estudios"  value="">
                            </div> 
                            <div class="form-group">
                                <label style="color:white">Experiencia:</label>
                                <input  class="form-control form-control-success" name="celular"  value="">
                            </div> 
                            <button type="submit" class="btn btn-neutral" name="Enviar">Enviar</button>
                        </form>



                        <div  class="VerP" class="form-group" style="display:none;" >
                            <label style="color:white" >Buscar Profesor:</label>
                            <input  class="form-control form-control-success" name="documento" value="">
                        </div>



                        <form class="VerP" style="display:none; ">
                            <br>
                            <div class="form-group">
                                <label style="color:white">Cedula:</label>
                                <input  class="form-control form-control-success" name="cedula" readonly="readonly" value="">
                            </div>
                            <div class="form-group">
                                <label style="color:white">Nombre:</label>
                                <input  class="form-control form-control-success" name="nombre" readonly="readonly" value="">
                            </div>
                            <div class="form-group">
                                <label style="color:white" >Usuario:</label>
                                <input  class="form-control form-control-success" name="usuario" readonly="readonly" value="">
                            </div>
                            <div class="form-group">
                                <label style="color:white" >Contraseña:</label>
                                <input  class="form-control form-control-success" name="password" readonly="readonly" value="">
                            </div>
                            <div class="form-group">
                                <label style="color:white" >Tipo de Usuario:</label>
                                <input  class="form-control form-control-success" name="tipousuario" readonly="readonly" value="">
                            </div>
                            <div class="form-group">
                                <label style="color:white">Fecha de Nacimiento:</label>
                                <input  class="form-control form-control-success" name="fechanacimiento" readonly="readonly" value="">
                            </div> 
                            <div class="form-group">
                                <label style="color:white">Tipo de Sangre:</label>
                                <input  class="form-control form-control-success" name="tiposangre" readonly="readonly" value="">
                            </div> 
                            <div class="form-group">
                                <div class="form-group">
                                    <label style="color:white">RH:</label>
                                    <input  class="form-control form-control-success" name="rh" readonly="readonly" value="">
                                </div> 
                                <label style="color:white">Correo:</label>
                                <input  class="form-control form-control-success" name="correo" readonly="readonly" value="">
                            </div>
                            <div class="form-group">
                                <label style="color:white">Celular:</label>
                                <input  class="form-control form-control-success" name="celular" readonly="readonly" value="">
                            </div> 
                            <div class="form-group">
                                <label style="color:white">Direccion:</label>
                                <input  class="form-control form-control-success" name="direccion" readonly="readonly" value="">
                            </div> 
                            <div class="form-group">
                                <label style="color:white">Estudios:</label>
                                <input  class="form-control form-control-success" name="estudios" readonly="readonly" value="">
                            </div> 
                            <div class="form-group">
                                <label style="color:white">Experiencia:</label>
                                <input  class="form-control form-control-success" name="celular" readonly="readonly" value="">
                            </div> 

                        </form>



                        <form id="EliminarP" style="display:none; ">                                              
                            <div class="form-group">
                                <label style="color:white">Profesor a Eliminar:</label>
                                <input  class="form-control form-control-success" name="cedula" value="">
                            </div>

                            <button type="submit" class="btn btn-neutral" name="Enviar">Enviar</button>
                        </form>



                    </div>
                </div>
            </div>




    </body>
    <script src="assets/js/jquery-3.2.1.js" type="text/javascript"></script>
    <script src="assets/js/jquery-ui-1.12.1.custom.min.js" type="text/javascript"></script>
    <script src="assets/js/popper.js" type="text/javascript"></script>
    <script src="assets/js/bootstrap.min.js" type="text/javascript"></script>

    <!-- Switches -->
    <script src="assets/js/bootstrap-switch.min.js"></script>

    <!--  Plugins for Slider -->
    <script src="assets/js/nouislider.js"></script>

    <!--  Plugins for DateTimePicker -->
    <script src="assets/js/moment.min.js"></script>
    <script src="assets/js/bootstrap-datetimepicker.min.js"></script>

    <!--  Paper Kit Initialization and functons -->
    <script src="assets/js/paper-kit.js?v=2.1.0"></script>
</html>

