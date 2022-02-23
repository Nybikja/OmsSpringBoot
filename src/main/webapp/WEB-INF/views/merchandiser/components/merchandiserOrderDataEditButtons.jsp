<%@ page language="java" contentType="text/html; charset=utf8"
	pageEncoding="utf8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<div style="float: right;">
	<form style="display: inline;">
		<input type="button" value="Save"
			onclick="document.merchandiserOrderEditForm.submit()" />
	</form>
	<form method="get" action="order.htm" style="display: inline;">
		<input type="submit" value="Cancel">
	</form>
</div>