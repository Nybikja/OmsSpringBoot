<%@ page language="java" contentType="text/html; charset=utf8"
	pageEncoding="utf8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<div>
	<table style="position: center">
		<thead>
			<tr>
				<th>Item Number</th>
				<th>Item Name</th>
				<th>Item Description</th>
				<th>Dimension</th>
				<th>Price</th>
				<th>Quantity</th>
				<th>Price per Line</th>
			</tr>
		</thead>

		<c:forEach items="${listOfOrderItems}" var="seletedOrderItem">
			<tr>
				<td>${seletedOrderItem.product.id}</td>
				<td>${seletedOrderItem.product.productName}</td>
				<td>${seletedOrderItem.product.productDescription}</td>
				<td>${seletedOrderItem.dimension.dimensionName}</td>
				<td>${seletedOrderItem.itemPrice}</td>
				<td>${seletedOrderItem.quantity}</td>
				<td>${seletedOrderItem.cost}</td>
			</tr>
		</c:forEach>
	</table>
</div>