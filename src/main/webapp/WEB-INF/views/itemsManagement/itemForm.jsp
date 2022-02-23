<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>

<script type="text/javascript" src="js/json.min.js"></script>
<script type="text/javascript" src="js/jquery-1.6.2.js"></script>




<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
	<script type="text/javascript" src="js/jquery-1.6.2.js"></script>
	<script type="text/javascript">
		$(document).ready(function () {

			$(document).ready(function () {
				$(".all").fadeIn(1500);
			});


			$("#table tr:nth-child(2n)").addClass("odd");
		});
	</script>

	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>OMS
	</title>
	<link rel="stylesheet" type="text/css"
		  href="<c:url value="/css/style.css"/>"/>
</head>
<body>

<div class="all" style="display: none;">
	<div id="main">

		<div id="logo">
			<h1>Ordering Management System.</h1>
			<h2>Simple. Slim. Genius.</h2>
		</div>

		<div id="menubar">
			<ul id="nav">
				<c:set var="adminLink">
					Administration
				</c:set>
				<c:set var="itemsLink">
					Item Management
				</c:set>
				<c:set var="ordersLink">
					Ordering
				</c:set>
				<c:set var="infoLink">
					User Info
				</c:set>

				<c:set var="current">
					items
				</c:set>

				<sec:authorize access="hasRole('ROLE_Administrator')">
					<li <c:if test="${current == 'admin'}">class="cur"</c:if>><a
							href="/OMS/users.htm">${adminLink}</a>
					</li>
				</sec:authorize>

				<sec:authorize access="hasRole('ROLE_Supervisor')">
					<li <c:if test="${current == 'items'}">class="cur"</c:if>><a
							href="/OMS/itemManagement.htm">${itemsLink}</a>
					</li>
				</sec:authorize>

				<sec:authorize
						access="hasAnyRole('ROLE_Administrator','ROLE_Customer','ROLE_Merchandiser')">
					<li <c:if test="${current == 'orders'}">class="cur"</c:if>><a
							href="/OMS/order.htm">${ordersLink}</a>
					</li>
				</sec:authorize>

				<li <c:if test="${current=='info'}">class="cur"</c:if>><a
						href="/OMS/userInfo.htm">${infoLink}</a></li>

				<li class="spec"><a href="/OMS/logout.htm" class="spec"><img
						alt="logout" src="resources/logout.png"> </a></li>
			</ul>
		</div>


		<div id="site_content">
			<div id="content">
				<div id="edit">
					<h3>This page is appointed for creating new product.</h3>

					<br />
					<form:form method="POST" commandName="productModel"
							   style="margin: 0; text-align: left;">
						<form:hidden path="id" />

						<table>
							<tr>
								<td>Product Name:</td>
								<td><form:input path="productName" id="name" /></td>
							</tr>
							<tr>
								<td>Product description:</td>
								<td><form:textarea id="description" path="productDescription" cols="27" rows="4"/>
								</td>
							</tr>
							<tr>
								<td>Product price:</td>
								<td><form:input id="price" path="productPrice"/>
								</td>
							</tr>
						</table>

						<input type="submit" value="OK" />
						<input type="button" value="Cancel"
							   onClick="location.href='itemManagement.htm'" />
					</form:form>
				</div>
			</div>
		</div>

		<div id="footer">
			<a href="http://www.google.com.ua">inspired by Google:)</a>
		</div>

	</div>
</div>
</body>
</html>