<!DOCTYPE html>
<html>
<head>
<meta http-equiv="content-type" content="text/html;charset=UTF-8" />
<meta charset="utf-8" />
<title>MasterPage</title>

<meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no" />


<link href="assets/plugins/pace/pace-theme-flash.css" rel="stylesheet" type="text/css" media="screen"/>
<link href="assets/plugins/jquery-slider/css/jquery.sidr.light.css" rel="stylesheet" type="text/css" media="screen"/>
<!-- BEGIN CORE CSS FRAMEWORK -->
<link href="assets/plugins/boostrapv3/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
<link href="assets/plugins/boostrapv3/css/bootstrap-theme.min.css" rel="stylesheet" type="text/css"/>
<link href="assets/plugins/font-awesome/css/font-awesome.css" rel="stylesheet" type="text/css"/>
<link href="assets/css/animate.min.css" rel="stylesheet" type="text/css"/>
<!-- END CORE CSS FRAMEWORK -->

<!-- BEGIN CSS TEMPLATE -->
<link href="assets/css/style.css" rel="stylesheet" type="text/css"/>
<link href="assets/css/responsive.css" rel="stylesheet" type="text/css"/>
<link href="assets/css/custom-icon-set.css" rel="stylesheet" type="text/css"/>

<!-- END CSS TEMPLATE -->
<script src="biblioteca/utilidades.js" type="text/javascript"></script>

  <link rel="stylesheet" href="assets/css/dialog.css" type="text/css">
  <script src="//code.jquery.com/jquery-1.10.2.js"></script>
  <script src="//code.jquery.com/ui/1.11.1/jquery-ui.js"></script>
  <script src="https://maps.googleapis.com/maps/api/js?v=3.exp&sensor=false"></script>
 <script src="/js/Proyectoalta.js"></script>
<script>
</script>
</head>
<!-- END HEAD -->

<!-- BEGIN BODY -->
<body class="" onload = "init()">
        
	
<!-- BEGIN HEADER -->
<div class="header navbar navbar-inverse "> 
  <!-- BEGIN TOP NAVIGATION BAR -->
  <div class="navbar-inner">
	<div class="header-seperation"> 
		<ul class="nav pull-left notifcation-center" id="main-menu-toggle-wrapper" style="display:none">	
		 <li class="dropdown"> <a id="main-menu-toggle" href="#main-menu"  class="" > <div class="iconset top-menu-toggle-white"></div> </a> </li>		 
		</ul>
      <!-- BEGIN LOGO -->
   <img src="assets/img/logo.png" class="logo" alt=""  data-src="assets/img/logo.png" data-src-retina="assets/img/logo2x.png" width="106" height="60"/>

    
      <!-- END LOGO --> 
      <ul class="nav pull-right notifcation-center">	
        
		<li class="dropdown" id="portrait-chat-toggler" style="display:none"> <a href="#sidr" class="chat-menu-toggle"> <div class="iconset top-chat-white "></div> </a> </li>        
      </ul>
      </div>
      <!-- END RESPONSIVE MENU TOGGLER --> 
      <div class="header-quick-nav" id = "header">
	    
	    <!-- BEGIN TOP NAVIGATION MENU -->
	  <div class="pull-left"> 
        <ul class="nav quick-section">
          <li class="quicklinks"> <a href="#" class="" id="layout-condensed-toggle" >
            <div class="iconset top-menu-toggle-dark"></div>
            </a> </li>
        </ul>
       
	  </div>
	 <!-- END TOP NAVIGATION MENU -->
	 <!-- BEGIN CHAT TOGGLER -->
      <div class="pull-right"> 
		<div class="chat-toggler">	
				<a href="#" class="dropdown-toggle" id="my-task-list" data-placement="bottom"  data-content='' data-toggle="dropdown" data-original-title="Notificaciones">
					<div class="user-details"> 
						<div class="username" id="headerUser">			
						</div>						
					</div> 
					<div class="iconset top-down-arrow"></div>
				</a>	
				<div id="notification-list" style="display:none">
					<div style="width:300px" id="notificationsUser">				
				        </div>				
				</div>
				<div class="profile-pic" id="pictureUser"> 
					
				</div>       			
			</div>
		 <ul class="nav quick-section ">
			
			<li class="quicklinks"> <span class="h-seperate"></span></li> 
			<li class="quicklinks"> 	
			<a id="chat-menu-toggle" href="#sidr" class="chat-menu-toggle" ><div class="iconset top-chat-dark "></div>
			</a> 
			</li> 
		</ul>
      </div>
	   <!-- END CHAT TOGGLER -->
      </div> 
      <!-- END TOP NAVIGATION MENU --> 
   
  </div>
  <!-- END TOP NAVIGATION BAR --> 
      </div> 
<!-- END HEADER -->
<!-- BEGIN CONTAINER -->
<div class="page-container row-fluid">
  <!-- BEGIN SIDEBAR -->
  <div class="page-sidebar" id="main-menu"> 
  <!-- BEGIN MINI-PROFILE -->
   <div class="page-sidebar-wrapper" id="main-menu-wrapper">
      <div class="user-info-wrapper">
     
       <div style="color: white" id="hiUser"></div>
    
	<div class="profile-wrapper" id="pictureMenuUser">
        </div>
    <div class="user-info" id="menuUser"></div>
   </div>
  <!-- END MINI-PROFILE -->
   
   <!-- BEGIN SIDEBAR MENU -->	
    <ul id="menuUserOptions">
      <br><br>
      <li class=""><a href="#"><i class="fa fa-folder-open"></i><span class="title">Biblioteca</span><span
							class="arrow"></span></a>
						<ul class="sub-menu">
							<li><a href="../biblioteca.jsp">Lista de Archivos </a></li>
							<li><a href="./multimedia.jsp">Subir archivo </a></li> 
							<!-- <li><a href="#"> Editar Proyectos </a></li> -->
						</ul></li>
    <li class=""><a href="Proyectoalta.jsp"><i class="fa fa-folder-open"></i><span class="title">Proyectos</span><span class="arrow"></span></a>
	 <ul class="sub-menu">
	         <li > <a href="#">  Lista de Proyectos </a> </li>
		 <li > <a href="http://1-dot-focal-furnace-615.appspot.com/views/Proyectoalta.jsp">  Alta de Proyectos </a> </li>
	         <li > <a href="http://1-dot-focal-furnace-615.appspot.com/views/EditProyectos.jsp"> Editar Proyectos </a> </li>
        </ul>
     </li>
	    <li class=""> <a href="#"> <i class="fa fa-road"></i><span class="title">Obras</span><span class="arrow"></span></a>
	       <ul class="sub-menu">
		   <li > <a href="#"> Lista de Obras</a> </li>
		   <li > <a href="http://1-dot-focal-furnace-615.appspot.com/views/Obraalta.jsp"> Alta de Obras</a> </li>
		   <li > <a href="http://1-dot-focal-furnace-615.appspot.com/views/EditObra.jsp"> Editar Obras</a> </li>
               </ul>
	  </li>
        <li class=""> <a href="#">  <i class="fa fa-tasks"></i><span class="title">Conceptos</span><span class="arrow"></span></a>
	   <ul class="sub-menu">
	           <li > <a href="#"> Lista de Conceptos</a> </li>
		   <li > <a href="http://1-dot-focal-furnace-615.appspot.com/views/AltaConcepto.jsp"> Alta de Conceptos</a> </li>
		   <li > <a href="#"> Editar Conceptos</a> </li>
               </ul>
	  </li>
	  <li class=""> <a href="#"> <i class="fa fa-sitemap"></i> <span class="title">Empresas</span><span class="arrow "></span></a>
	   <ul class="sub-menu">
	           <li > <a href="#"> Lista de Empresas</a> </li>
		   <li > <a href="http://1-dot-focal-furnace-615.appspot.com/views/Empresaalta.jsp"> Alta de Empresas</a> </li>
		   <li > <a href="#"> Editar Empresas</a> </li>
               </ul>
	  </li>
	  <li class=""> <a href="#"> <i class="fa fa-users"></i> <span class="title">Usuarios</span><span class="arrow"></span></a>
	   <ul class="sub-menu">
	           <li > <a href="#"> Lista de Usuarios</a> </li>
		   <li > <a href="#"> Alta de Usuarios</a> </li>
		   <li > <a href="#"> Editar Usuarios</a> </li>
               </ul>
	  </li>
	   <li class=""> <a href="#"> <i class="fa fa-edit"></i> <span class="title">Cat&aacute;logos</span><span class="arrow"></span></a>
	   <ul class="sub-menu">
	           <li > <a href="#"> Maquinaria y Equipo</a> </li>
		   <li > <a href="#"> Tipos de Empresas</a> </li>
		   <li > <a href="#"> Tipos de Usuarios</a> </li>
               </ul>
	  </li>
	   
   </ul>
	
	<div class="clearfix">
   </div>
    <!-- END SIDEBAR MENU --> 
  </div>
  </div>
  <a href="#" class="scrollup">Scroll</a>
   <div class="footer-widget">		
	Control de Avance de Obras 
  </div>
  <!-- END SIDEBAR --> 
  <!-- BEGIN PAGE CONTAINER-->
  <div class="page-content"> 
    <!-- BEGIN SAMPLE PORTLET CONFIGURATION MODAL FORM-->
    <div id="portlet-config" class="modal hide">
      <div class="modal-header">
        <button data-dismiss="modal" class="close" type="button"></button>
        <h3>Widget Settings</h3>
      </div>
      <div class="modal-body"> Widget settings form goes here </div>
    </div>
    <div class="clearfix"></div>
    <div class="content"> 
        <div class="grid-body no-border"> <br>
                  <div class="row">
                    <div class="col-md-8 col-sm-8 col-xs-8">
			<br>
			<div class="page-title">
			<center><h3><b> Alta de proyectos</b></h3></center>	
		        </div>
			<br>
		       <div class="form-group">
			<div align="right"><button class="btn btn-primary btn-cons " alingh>Guardar</button></div>
                        <label class="form-label">Nombre largo del proyecto</label>
                        <span class="help">e.j. "Carretera M&eacute;xico - Puebla"</span>
		
                        <div class="controls">
                          <input type="text" class="form-control" id="nombre_largo">
                        </div>
                      </div>
		        <div class="form-group">
                        <label class="form-label">Nombre corto del proyecto</label>
                        <span class="help">e.j. "M&eacute;xico - Puebla"</span>
                        <div class="controls">
                          <input type="text" class="form-control" id="nombre_corto">
                        </div>
                      </div>
			<div class="form-group">
                        <label class="form-label">Descripci&oacute;n</label>
                        <div class="controls">
                          <input type="text" class="form-control" id="id_Descripcion">
                        </div>
                      </div>
			<div class="form-group">
                        <label class="form-label">Dependencia</label>
                           <a href="./Altaempresa.jsp">
                           <button class="btn btn-primary btn-cons " alingh>Dar de alta Dependencia</button>
                        	</a>
                        <div class="controls">
		    <select id="empresa" style="width:100%">
                   
                  </select>
		     
                        </div>
                      </div>
		   
		   <div class="form-group">
                        <label class="form-label">Secretar&iacute;a</label>
                           <a href="./Altaempresa.jsp">
                        	<button class="btn btn-primary btn-cons " alingh>Dar de alta Secretar&iacute;a</button>
                        	</a>
                        <div class="controls">
                         
		   
		   
		    <select id="secretaria" style="width:100%">
   
                  </select>
		     
                        </div>
                      </div>
              
                 <div class="form-group">
                        <label class="form-label">Directivo</label>
                           <a href="./AltaUsuario.jsp">
                        	<button class="btn btn-primary btn-cons " alingh>Dar de alta Directivo</button>
                        	</a>
                        <div class="controls">
                         
		   
		   
		    <select id="directivo" style="width:100%" onchange="changedirectivo()">
            <option value="??" >Seleccione Directivo</option>
   
                  </select>
		     
                        </div>
                      </div>
              
              
		   <div class="form-group">
                        <div class="controls">
                          <button class="btn btn-block btn-success "  id="mapaenviar">Elegir Ubicaci&oacute;n</button><br>
                        </div>
                      </div>
		   <div class="form-group">
			
                        <div class="controls">
                       
                        </div>
                      </div>
		   
		   
		  
		<!--   <img 
		   src="http://1-dot-focal-furnace-615.appspot.com/serve?blob-key=AMIfv96hHN_Kbirtn6gWVgAs-Anzddj5iuyX4BIXTCOsilVhbaop1XS9BHtXeDxw_nPXCzL_78AnO-LaNAXx2YMfB_wjk-iq3NYjIEzKafmO9IEOre5v20-M8yix1sS8gpj8yWHH7o4G8P2az_3xPAH0PkZA4cKoqgudUmdhXgT-QgvAmmfsJ4Y"
		   />
		-->
		
		   <br><br>
		    </div>
		    
		
		  </div>
		  
	    </div>
	 
    </div>
  
  </div>

 
<!-- END CONTAINER --> 
<!-- BEGIN CHAT --> 
<div id="sidr" class="chat-window-wrapper">
	<div id="main-chat-wrapper" >
	<div class="chat-window-wrapper fadeIn" id="chat-users" >
		<div class="chat-header">	
		<div class="pull-left">
			<input type="text" placeholder="Buscar">
		</div>		
			<div class="pull-right" style="margin: 5px">
			      
				<button class="btn btn-block btn-success" style="margin-top: 10px">ok</button>
			</div>			
		</div>	
		<div class="side-widget">
		   <div class="side-widget-title">Grupos</div>
		    <div class="side-widget-content">
			 <div id="groups-list">
				<ul class="groups" >
					<li><a href="#"><div class="status-icon green"></div>CONAGUA</a></li>
					<li><a href="#"><div class="status-icon green"></div>SEGOB</a></li>
				</ul>
			</div>
			</div>
		</div>
		<div class="side-widget fadeIn">
		   <div class="side-widget-title">favoritos</div>
		   <div id="favourites-list">
		    <div class="side-widget-content" >
				<div class="user-details-wrapper active" data-chat-status="online" data-chat-user-pic="assets/img/profiles/d.jpg" data-chat-user-pic-retina="assets/img/profiles/d2x.jpg" data-user-name="Jane Smith">
					<div class="user-profile">
						<img src="assets/img/profiles/d.jpg"  alt="" data-src="assets/img/profiles/d.jpg" data-src-retina="assets/img/profiles/d2x.jpg" width="35" height="35">
					</div>
					<div class="user-details">
						<div class="user-name">
						Maria Cardenas 
						</div>
						<div class="user-more">
						Intendente
						</div>
					</div>
					<div class="clearfix"></div>
				</div>
				<div class="user-details-wrapper active" data-chat-status="online" data-chat-user-pic="assets/img/profiles/d.jpg" data-chat-user-pic-retina="assets/img/profiles/d2x.jpg" data-user-name="Jane Smith">
					<div class="user-profile">
						<img src="assets/img/profiles/d.jpg"  alt="" data-src="assets/img/profiles/d.jpg" data-src-retina="assets/img/profiles/d2x.jpg" width="35" height="35">
					</div>
					<div class="user-details">
						<div class="user-name">
						Luz Flores 
						</div>
						<div class="user-more">
						Supervisor
						</div>
					</div>
					<div class="clearfix"></div>
				</div>
								
			</div>
			</div>
		</div>
		
	</div>

	<div class="chat-window-wrapper fadeIn" id="messages-wrapper" style="display:none">
	
	<div class="clearfix"></div>	
	<div class="chat-messages-header">
	
	<a href="#" class="chat-back"><i class="icon-custom-cross"></i></a>
	</div>
	<div></div>
	<div class="chat-messages">
		
		<div class="user-details-wrapper " >
		  <br><br>
      <div class="grid simple">
            <div class="grid-title no-border">
	    <img src="assets/img/profiles/avatar_small.png"  alt="" data-src="assets/img/profiles/avatar_small.png" data-src-retina="assets/img/profiles/avatar_small2x.png" width="35" height="35" />   
             <span class="semi-bold" style="font-size: large"> Maria Cardenas </span>
              </div>
            <div class="grid-body no-border">
              <div class="row-fluid">
                <div class="scroller" data-height="220px" data-always-visible="1">
                  <p><span class="semi-bold">Dependencia:</span> CONAGUA</p>
		  <p><span class="semi-bold">Cargo:</span> Intendente</p>
		  <p><span class="semi-bold">Telefono(s):</span> 55-54056519 </p>
		 <p><span class="semi-bold">Correo (s):</span> <input readonly="true" id="mail" style="background-color: transparent; border: hidden" size="30" value="intendente@conagua.com"></input></p>
		 <button  class="btn btn-block btn-success" onClick="enviarCorreo('mapa_proyectos')">Enviar correo</button>
                </div>
                </div>
              </div>
            </div>
          </div>
			    
			
			<div class="clearfix"></div>
		   
	</div>
	</div>
	
	</div>
</div>
<!-- END CHAT --> 
<!-- END CONTAINER -->
<div id="dialog-message" title="Mapa" > 
<div id="map-canvas"style="width:00px; height:00px" ></div>
</div>
<!-- BEGIN CORE JS FRAMEWORK--> 
<script src="assets/plugins/jquery-1.8.3.min.js" type="text/javascript"></script> 
<script src="assets/plugins/jquery-ui/jquery-ui-1.10.1.custom.min.js" type="text/javascript"></script> 
<script src="assets/plugins/bootstrap/js/bootstrap.min.js" type="text/javascript"></script> 
<script src="assets/plugins/breakpoints.js" type="text/javascript"></script> 
<script src="assets/plugins/jquery-unveil/jquery.unveil.min.js" type="text/javascript"></script> 
<script src="assets/plugins/jquery-block-ui/jqueryblockui.js" type="text/javascript"></script> 
<!-- END CORE JS FRAMEWORK --> 
<!-- BEGIN PAGE LEVEL JS --> 	
<script src="assets/plugins/jquery-slider/jquery.sidr.min.js" type="text/javascript"></script> 	
<script src="assets/plugins/jquery-slimscroll/jquery.slimscroll.min.js" type="text/javascript"></script> 
<script src="assets/plugins/pace/pace.min.js" type="text/javascript"></script>  
<script src="assets/plugins/jquery-numberAnimate/jquery.animateNumbers.js" type="text/javascript"></script>
<!-- END PAGE LEVEL PLUGINS --> 	

<!-- BEGIN CORE TEMPLATE JS --> 
<script src="assets/js/core.js" type="text/javascript"></script> 
<script src="assets/js/chat.js" type="text/javascript"></script> 
<script src="assets/js/demo.js" type="text/javascript"></script> 
<!-- END CORE TEMPLATE JS --> 
</body>
</html>