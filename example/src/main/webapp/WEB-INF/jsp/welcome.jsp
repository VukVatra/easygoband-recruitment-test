<!DOCTYPE html>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html lang="en" ng-app="easyGoBandApp">
<head>

<link rel="stylesheet" type="text/css"
	href="webjars/bootstrap/3.3.7/css/bootstrap.min.css" />
<link rel="stylesheet" href="/js/angular/select2/angular/select.css">

<c:url value="/css/main.css" var="jstlCss" />
<link href="${jstlCss}" rel="stylesheet" />

</head>
<body>

	<nav class="navbar navbar-inverse">
		<div class="container">
			<div class="navbar-header">
				<a class="navbar-brand" href="#">EasyGoBand</a>
			</div>
			<div id="navbar" class="collapse navbar-collapse">
				<ul class="nav navbar-nav">
					<li class="active"><a href="#">Proveedores de Acceso</a></li>
				</ul>
			</div>
		</div>
	</nav>

	<div class="container" ng-controller="ProvidersController">

		<h4>Listado de sesiones</h4>
		<ui-select ng-model="selectedSession"
			ng-change="selectSession(selectedSession)"> 
			<ui-select-match>
				<span ng-bind="$select.selected.sessionName"></span> 
			</ui-select-match> 
			<ui-select-choices repeat="i in (sessions | filter: $select.search) track by i.sessionName">
				<span ng-bind="i.sessionName"></span> 
			</ui-select-choices> 
		</ui-select>

		<h4 ng-show="selectedSession" style="padding-top: 5%;">
			Proveedores <small class="pull-right">{{selectedSession.providers.length}} resultados</small>
		</h4>
		<table ng-show="selectedSession" class="table table-stripped table-hover">
			<thead>
				<tr>
					<th>access_group_name</th>
					<th>access_group_id</th>
					<th>total_uses</th>
					<th>event_id</th>
					<th>structure_decode</th>
					<th>name</th>
					<th>modified</th>
					<th>id</th>
					<th>basic_product_id</th>
				</tr>
			</thead>
			<tbody>
				<tr ng-repeat="p in selectedSession.providers track by $index">
					<td>{{p.access_group_name}}</td>
					<td>{{p.access_group_id}}</td>
					<td>{{p.total_uses}}</td>
					<td>{{p.event_id}}</td>
					<td>{{p.structure_decode}}</td>
					<td>{{p.name}}</td>
					<td>{{p.modified | date : 'dd/mm/yyyy @ HH:mm'}}</td>
					<td>{{p.id}}</td>
					<td>{{p.basic_product_id}}</td>
				</tr>
			</tbody>
		</table>

	</div>

	<script src="/js/jquery/jquery.js"></script>
	<script src="/js/angular/angular.js"></script>
	<script type="text/javascript"
		src="webjars/bootstrap/3.3.7/js/bootstrap.min.js"></script>
	<script src="/js/angular/select2/angular/select.js"></script>

	<script src="app/modules/easyGoBand.module.js"></script>
	<script src="app/controllers/providers/providers.controller.js"></script>

</body>

</html>