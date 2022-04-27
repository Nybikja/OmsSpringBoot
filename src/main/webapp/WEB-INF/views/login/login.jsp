<%@ page language="java" contentType="text/html; charset=utf8"
	pageEncoding="utf8"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
	<script type="text/javascript" src="js/jquery-1.6.2.js"></script>
	<script type="text/javascript">
		$(document).ready(function() {

			$(document).ready(function() {
				$(".all").fadeIn(1500);
			});


			$("#table tr:nth-child(2n)").addClass("odd");
		});
	</script>

	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>OMS
	</title>
	<link rel="stylesheet" type="text/css"
		  href="<c:url value="/css/style.css"/>" />
</head>
<body>

<div class="all" style="display: none;">
	<div id="main">

		<div id="logo">
			<h1>Ordering Management System.</h1>
			<h2>Simple. Slim. Genius.</h2>
		</div>

		<div id="site_content">
			<div id="content">
				<div id="edit">
					<fieldset>
						<legend>Login</legend>
						<c:if test="${not empty param.login_error}">
							<font color="red"> Your login attempt was not successful, try again.<br /> <br /> Reason: <c:out
									value="${SPRING_SECURITY_LAST_EXCEPTION.message}" />. </font>
						</c:if>

						<form name="f" action="<c:url value='j_spring_security_check'/>"
							  method="POST">
							<table>
								<tr>
									<td>User:</td>
									<td><input type='text' name='j_username' />
									</td>
								</tr>
								<tr>
									<td>Password:</td>
									<td><input type='password' name='j_password'></td>
								</tr>
								<tr>
									<td><input type="checkbox" name="_spring_security_remember_me">
									</td>
									<td>remember me</td>
								</tr>

								<tr>
									<td colspan='2'><input name="submit" type="submit"><input
											name="reset" type="reset"></td>
								</tr>
							</table>
						</form>
					</fieldset>
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