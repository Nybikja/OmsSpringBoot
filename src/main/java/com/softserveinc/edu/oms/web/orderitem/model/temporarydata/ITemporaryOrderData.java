package com.softserveinc.edu.oms.web.orderitem.model.temporarydata;

import com.softserveinc.edu.oms.domain.entities.Order;
import com.softserveinc.edu.oms.service.interfaces.IOrderItemService;
import com.softserveinc.edu.oms.service.interfaces.IOrderService;
import com.softserveinc.edu.oms.service.interfaces.IOrderStatusService;
import com.softserveinc.edu.oms.web.orderitem.model.temporarydata.beans.TemporaryOrder;
import com.softserveinc.edu.oms.web.orderitem.model.temporarydata.beans.TemporaryOrderItem;

import java.util.List;

public interface ITemporaryOrderData {

	TemporaryOrder getTempOrder();

	List<TemporaryOrderItem> getOrderItems();

	Integer getNumberOfItems();

	Boolean getIsSaved();

	Boolean getIsEditable();

	void setIsEditable(boolean b);

	Order getOrder();

	List<TemporaryOrderItem> getOrderItems(Integer startingFrom,
			Integer maxResult);

	void insertOrUpdate(final TemporaryOrderItem orderItem);

	void remove(Integer orderItemId);

	void submit(IOrderService orderService, IOrderItemService orderItemService,
			IOrderStatusService orderStatusService);

	TemporaryOrderItem findById(int parseInt);
}
