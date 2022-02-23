<%@ page language="java" contentType="text/html; charset=utf8"
	pageEncoding="utf8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<div style="float: left; width: 50%;">
	<form name="merchandiserOrderEditForm" method="get"
		action="merchandiserEdit.htm">
		<input type="hidden" name="orderId" value="${selectedOrderID}">
		<table>
			<tr>
				<td>Order Status</td>
				<td><select name="orderStatus">
						<option value="Ordered"
							<c:if test="${orderStatus eq 'Ordered'}">selected="selected"</c:if>>
							Ordered
						</option>
						<option value="Pending"
							<c:if test="${orderStatus eq 'Pending'}">selected="selected"</c:if>>
							Pendusers.editing
						</option>
						<option value="Delivered"
							<c:if test="${orderStatus eq 'Delivered'}">selected="selected"</c:if>>
							Delivered
						</option>
				</select>
				</td>
			</tr>
			<tr>
				<td>Delivery Date</td>
				<td><input type="text" name="deliveryDate"
					value="${deliveryDate}"></td>
			</tr>
			<tr>
				<td>Gift</td>
				<td><input type="checkbox" name="isGift"
					<c:if test="${isGift}">checked="checked"</c:if>></td>
			</tr>
		</table>
	</form>
</div>