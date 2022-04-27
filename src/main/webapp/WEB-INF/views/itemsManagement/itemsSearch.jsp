<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>

<h4>
	Products found: <span id="recordsFound">${productSearchModel.recordsFound}</span>
</h4>

<fieldset>
	<legend>Products found:</legend>
	<form:form id="searchForm" method="GET" action="${searchItems}"
		modelAttribute="productSearchModel" style="width: 100%;">
		<form:label path="">Field Filter:</form:label>

		<form:select id="field" path="selectField" items="${selectFields}" />
		<form:input id="searchField" path="searchValue" style="width: 270px;" />


		<input type="submit" value="Search" name="search" />
	</form:form>

</fieldset>
<p style="margin: 0; text-align: right;">
	<a href="${resizeItemsList}">Show ${productSearchModel.pageSizeChange}
		items</a>
</p>