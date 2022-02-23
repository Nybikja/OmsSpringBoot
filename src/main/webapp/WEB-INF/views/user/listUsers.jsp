<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>

<script type="text/javascript" src="js/jquery-1.6.2.js"></script>

<script type="text/javascript">
	function deleteItem(id) {
		var url = "${deleteUser}?userID=" + id;
		var OK = confirm('proceed?');
		if (OK) {
			window.location = url;
		}
	}

	$(document).ready(function() {

		$('#field').change(function() {
			processSearch();
		});

		$('#condition').change(function() {
			processSearch();
		});

		var timer = null;

		$('#searchField').keyup(function() {
			clearTimeout(timer);
			timer = setTimeout(function() {
				processSearch();
			}, 500);
		});
	});

	function processSearch() {
		var data = $('#searchForm').serialize();
		$.getJSON('usersAJAX.htm', data, function(response) {
			$("#table").find("tr:gt(0)").remove();
			var records = response.records;

			$.each(records, function() {
				var newRow = "<tr>";

				newRow += "<td>" + this.firstName + "</td>";
				newRow += "<td>" + this.lastName + "</td>";
				newRow += "<td>" + this.login + "</td>";
				newRow += "<td>" + this.role.roleName + "</td>";
				newRow += "<td>" + this.region.regionName + "</td>";
				newRow += "<td><a href='editUser.htm?userID=" + this.id
						+ "'>Edit</a></td>";
				newRow += "<td><a href='javascript:deleteItem(" + this.id
						+ ");'>Delete</a></td>";
				newRow += "</tr>";

				$("#table").append(newRow);
			});

			$('#usersFound').html(response.recordsFound);
			$('#pageNumber').html(response.page);
			$('#pageCount').html(response.pageCount);

			var pageNumber = response.page * 1;
			var pagesCount = response.pageCount * 1;
			if (pageNumber == 1) {
				$('#first').attr('disabled', 'disabled');
				$('#previous').attr('disabled', 'disabled');
			} else {
				$('#first').removeAttr('disabled');
				$('#previous').removeAttr('disabled');
			}

			if (pageNumber == pagesCount) {
				$('#last').attr('disabled', 'disabled');
				$('#next').attr('disabled', 'disabled');
			} else {
				$('#last').removeAttr('disabled');
				$('#next').removeAttr('disabled');
			}
		});
	}
</script>



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
				<div id="list">
					<h2>
						This page is appointed for creating new and managing existing users
					</h2>

					<a href="addUser.htm">Create New User </a>

					<%@include file="userSearch.jsp"%>

					<table id="table">
						<thead>
						<tr>
							<th><a href="${usersSort}?propertyName=firstName">First name </a></th>
							<th><a href="${usersSort}?propertyName=lastName">Last name </a></th>
							<th><a href="${usersSort}?propertyName=login">Login </a></th>
							<th><a href="${usersSort}?propertyName=role">Role </a></th>
							<th><a href="${usersSort}?propertyName=region">Region </a></th>
							<th>Edit</th>
							<th>Delete</th>
						</tr>
						</thead>

						<c:forEach items="${users}" var="user">
							<tr>
								<td>${user.firstName}</td>
								<td>${user.lastName}</td>
								<td>${user.login}</td>
								<td>${user.role}</td>
								<td>${user.region}</td>
								<td><a href="editUser.htm?userID=${user.id}">Edit </a>
								<td><a href='javascript:deleteItem("${user.id}");'>Delete </a>
								</td>
							</tr>
						</c:forEach>
					</table>

					<%@include file="userNavigation.jsp"%>

					<h5>
						<a href="reportUsers.htm">create report
						</a>
					</h5>
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
