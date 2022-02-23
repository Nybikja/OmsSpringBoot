<%@ page language="java" contentType="text/html; charset=utf8"
	pageEncoding="utf8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<div>
	<c:choose>
		<c:when test="${pageModel.hasElementsToShow()}"><jsp:include
				page="/WEB-INF/views/pageableControlerViews/pageResizeListWithAjax.jsp"></jsp:include>
			<jsp:include page="merchandiserOrderItemsTable.jsp"></jsp:include>
			<h3>
				Page:
				${pageModel.currentPage} / ${pageModel.numberOfPages}
			</h3>
			<jsp:include
				page="/WEB-INF/views/pageableControlerViews/pageActionButtonsWithAjax.jsp"></jsp:include></c:when>
		<c:otherwise>There is no items in this order.</c:otherwise>
	</c:choose>
</div>