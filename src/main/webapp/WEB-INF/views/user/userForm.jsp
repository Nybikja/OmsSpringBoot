<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
		 pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>

<script type="text/javascript" src="js/json.min.js"></script>
<script type="text/javascript" src="js/jquery-1.6.2.js"></script>
<script type="text/javascript" src="js/user/addEditUser.js"></script>

<script type="text/javascript">
	var editedName = "${userModel.login}";
</script>





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
					admin
				</c:set>

				<sec:authorize access="hasRole('ROLE_Administrator')">
					<li <c:if test="${current == 'admin'}">class="cur"</c:if>><a
							href="/users.htm">${adminLink}</a>
					</li>
				</sec:authorize>

				<sec:authorize access="hasRole('ROLE_Supervisor')">
					<li <c:if test="${current == 'items'}">class="cur"</c:if>><a
							href="/itemManagement.htm">${itemsLink}</a>
					</li>
				</sec:authorize>

				<sec:authorize
						access="hasAnyRole('ROLE_Administrator','ROLE_Customer','ROLE_Merchandiser')">
					<li <c:if test="${current == 'orders'}">class="cur"</c:if>><a
							href="/order.htm">${ordersLink}</a>
					</li>
				</sec:authorize>

				<li <c:if test="${current=='info'}">class="cur"</c:if>><a
						href="/userInfo.htm">${infoLink}</a></li>

				<li class="spec"><a href="/logout.htm" class="spec"><img
						alt="logout" src="resources/logout.png"> </a></li>
			</ul>
		</div>


		<div id="site_content">
			<div id="content">
				${userModel.login}

				<div id="edit">
					<h3>This page is appointed for creating new user for particular role.</h3>

					<br />
					<form:form method="POST" modelAttribute="userModel"
							   style="margin: 0; text-align: left;">
						<form:hidden path="id" />
						<form:hidden path="customerTypeID" />
						<form:hidden path="balance" />

						<table>
							<tr>
								<td>Login Name:</td>
								<td><form:input path="login" id="login" /><img id="nameLoader"
																			   alt="please wait:)" src="resources/ajax-loader-small.gif" /><span
										id="nameError" class="error"></span> <form:errors path="login"
																						  class="error" /></td>
							</tr>
							<tr>
								<td>First Name:</td>
								<td><form:input id="firstName" path="firstName" /><span
										id="firstNameError" class="error"></span> <form:errors
										path="firstName" class="error" />
								</td>
							</tr>
							<tr>
								<td>Last Name:</td>
								<td><form:input id="lastName" path="lastName" /><span
										id="lastNameError" class="error"></span> <form:errors
										path="lastName" class="error" />
								</td>
							</tr>
							<tr>
								<td>Password:</td>
								<td><form:password id="password" path="password" /><span
										id="passwordError" class="error"></span> <form:errors
										path="password" class="error" />
								</td>
							</tr>
							<tr>
								<td>Confirm Password:</td>
								<td><form:password id="confirmPassword" path="confirmPassword" /><span
										id="confirmError" class="error"></span> <form:errors
										path="confirmPassword" class="error" />
								</td>
							</tr>
							<tr>
								<td>Email Address:</td>
								<td><form:input id="email" path="email" /> <span
										id="emailError" class="error"></span> <form:errors id="emailError"
																						   path="email" class="error" /></td>
							</tr>
							<tr>
								<td>Region:</td>
								<td><form:select path="regionID" items="${regions}"
												 itemValue="id" />
							</tr>
						</table>


						<fieldset style="width: 300px; margin: 0; text-align: left;">
							<legend>Role</legend>

							<table>
								<c:forEach items="${roles}" var="role">
									<tr>
										<td><form:radiobutton path="roleID" value="${role.id}"
															  label="${role.toString()}" />
										</td>
									</tr>
								</c:forEach>
							</table>
						</fieldset>

						<br />

						<input type="submit" value="Create" onclick="return processSubmit()" />
						<input type="button" value="Cancel"
							   onClick="location.href='users.htm'" />
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