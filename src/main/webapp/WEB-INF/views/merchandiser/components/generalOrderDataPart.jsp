<%@ page language="java" contentType="text/html; charset=utf8"
	pageEncoding="utf8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<div style="float: left; width: 50%;">
	<table>
		<tr>
			<td>Customer Name</td>
			<td>${customerName}</td>
		</tr>
		<tr>
			<td>Customer Type</td>
			<td>${customerType}</td>
		</tr>
		<tr>
			<td>Order Number</td>
			<td>${orderNumber}</td>
		</tr>
		<tr>
			<td>Total Price</td>
			<td>${totalPrice}</td>
		</tr>
		<tr>
			<td>Total Number Of Items</td>
			<td>${totalNumberOfItems}</td>
		</tr>
		<tr>
			<td>Assignee</td>
			<td>${assigneeName}</td>
		</tr>
		<tr>
			<td>Date of Ordering</td>
			<td>${dateOfOrdering}</td>
		</tr>
		<tr>
			<td>Preferable Delivery Date</td>
			<td>${preferableDeliveryDate}</td>
		</tr>
	</table>
</div>