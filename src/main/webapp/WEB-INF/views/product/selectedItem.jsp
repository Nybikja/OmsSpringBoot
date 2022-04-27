<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@page import = "com.softserveinc.edu.oms.web.product.model.ListProductModel"  %>
<fieldset>

	<form:form modelAttribute="model" method="post" action="products.htm" id="doneForm">
		<form:hidden path="orderId"/>
		<form:hidden path="orderItemId"/>
		<form:hidden path="searchProperty"/>
		<form:hidden path="searchValue"/>
		<form:hidden path="ascending"/>
		<form:hidden path="sortPropertyName"/>
		<form:hidden path="id"/>
		<table>
			<tr>
				<td>Item</td>
				<td><c:if test="${(!empty model.id) &&(model.id!='')&&(model.id!=null)}">${selectedProduct.name }</c:if>
				</td>
			</tr>
			<tr>
				<td>Price</td>
				<td><c:if test="${(model.id!=null)}">${selectedProduct.price }</c:if>
				</td>
			</tr>
			<tr>
				<td>Quantity</td>
				<td><form:input path="quantity"/></td>
			</tr>
			<tr>
				<td>Dimension</td>
				<td><form:select path="dimension" items="<%=ListProductModel.DIMENSIONS %>" /></td>
			</tr>
		</table>
		<input type="hidden" name="done"/>
	</form:form>
	
	<table>
	<tr>
		<td>
			<form:form modelAttribute="model" id = "resetForm" method="post" action="products.htm" >
				<%@include file="hidden.jsp" %>
				<input type="hidden" name="reset"/>
				<input type="submit" value="Reset">
			</form:form>
		</td>
		
		<td>
			<input type="submit" value="Done" onclick="javascript:$('#doneForm').submit()"/>
		</td>
		
		<td>
			<form:form id = "cancelForm" method="get" action="orderItems.htm">
				<input type="hidden" name="orderId" value="${model.orderId }"/>
				<input type="submit" value="Cancel">
			</form:form>
		</td>
	</tr>
	</table>
</fieldset>