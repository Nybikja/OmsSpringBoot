<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>

<h4>
	Number of Found users <span id="usersFound">${searchModel.recordsFound}</span>
</h4>

<fieldset>
	<legend>Search by</legend>
	<form:form id="searchForm" method="GET" action="${searchUsers}"
		commandName="searchModel" style="width: 100%;">
		<form:label path="">Field Filter:</form:label>

		<form:select id="field" path="selectField" items="${userSelectFields}" />
		<form:select id="condition" path="selectCondition" items="${selectConditions}" />
		<form:input id="searchField" path="searchValue" style="width: 270px;" />


		<input type="submit" value="Search" name="search" />
	</form:form>

</fieldset>
<p style="margin: 0; text-align: right;">
	<a href="${resizeUsersList}">Show ${searchModel.pageSizeChange}
		items</a>
</p>