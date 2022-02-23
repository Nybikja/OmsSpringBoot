<div align="Center" style="margin: 0; text-align: center;">
	<form action="${page}" style="margin: 0; text-align: center; display: inline;">
		<input type="hidden" name="pageCommand" value="first"
			style="display: inline;" /> <input id="first" type="submit"
			value="First" name="first"
			<c:if test="${!searchModel.isFirstPage()}"> disabled="disabled" </c:if> />
	</form>

	<form action="${page}" style="margin: 0; text-align: center; display: inline;">
		<input type="hidden" name="pageCommand" value="previous"
			style="display: inline;" /> <input id="previous" type="submit"
			value="Backward" name="previous"
			<c:if test="${!searchModel.isPreviousPage()}"> disabled="disabled" </c:if> />
	</form>

	<form action="${page}" style="margin: 0; text-align: center; display: inline;">
		<input type="hidden" name="pageCommand" value="next"
			style="display: inline;" /> <input id="next" type="submit"
			value="Forward" name="next"
			<c:if test="${!searchModel.isNextPage()}"> disabled="disabled" </c:if> />
	</form>

	<form action="${page}" style="margin: 0; text-align: center; display: inline;">
		<input type="hidden" name="pageCommand" value="last"
			style="display: inline;" /> <input id="last" type="submit"
			value="Last" name="last"
			<c:if test="${!searchModel.isLastPage()}"> disabled="disabled" </c:if> />
	</form>
</div>


<h4>
	Page #: <span id="pageNumber">${pageNumber}</span> from <span
		id="pageCount">${pages}</span>
</h4>