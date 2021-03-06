
package com.softserveinc.edu.oms.service.interfaces;

import com.softserveinc.edu.oms.domain.entities.Order;
import com.softserveinc.edu.oms.repository.params.SortProperties;
import com.softserveinc.edu.oms.web.order.SearchFilterOptions;

import java.util.List;


public interface IOrderService extends ServiceForPaging<Order> {
	List<Order> find(Integer startingFrom, Integer maxResult,
			SearchFilterOptions options, SortProperties sortProperties);

	Long getRowCount(SearchFilterOptions options);

	/**
	 * return max order number from table Orders
	 * 
	 * @return
	 */
	Integer getMaxOrderNumber();

	/**
	 * returns false if specified orderNumber doesn't exists in table
	 * 
	 * @param orderNumber
	 * @return
	 */
	Boolean orderNumberExists(Integer orderNumber);
}
