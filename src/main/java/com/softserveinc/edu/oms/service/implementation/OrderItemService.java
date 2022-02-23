package com.softserveinc.edu.oms.service.implementation;

import com.softserveinc.edu.oms.domain.entities.Order;
import com.softserveinc.edu.oms.domain.entities.OrderItem;
import com.softserveinc.edu.oms.repository.OrderRepository;
import com.softserveinc.edu.oms.repository.OrderItemRepository;
import com.softserveinc.edu.oms.repository.params.SortProperties;
import com.softserveinc.edu.oms.service.interfaces.IOrderItemService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@AllArgsConstructor
@Service
public class OrderItemService implements IOrderItemService {

	private final OrderItemRepository orderItemDao;
	private final OrderRepository orderDao;

	@Override
	@Transactional
	public List<OrderItem> findAll(final Integer startingFrom,
			final Integer maxResult) {
//		return orderItemDao.findAll(startingFrom, maxResult);
		return null;


	}

	@Override
	@Transactional
	public List<OrderItem> findAll(final Integer startingFrom,
			final Integer maxResult, final SortProperties sortProperties) {
		return null;

//		return orderItemDao.findAll(startingFrom, maxResult, sortProperties);
	}

	@Override
	@Transactional
	public Long getRowCount() {
		return 0L;
//		return orderItemDao.getRowCount();
	}

	@Override
	@Transactional
	public List<OrderItem> findAll() {
		return null;

//		return orderItemDao.findAll();
	}

	@Override
	@Transactional
	public List<OrderItem> findAll(final SortProperties sortProperties) {
		return null;

//		return orderItemDao.findAll(sortProperties);
	}

	@Override
	@Transactional
	public OrderItem findByID(final Integer id) {
		return orderItemDao.findOne(id);
	}

	@Override
	@Transactional
	public OrderItem insertOrUpdate(final OrderItem orderItem) {
		return orderItemDao.save(orderItem);
	}

	@Override
	@Transactional
	public void delete(final OrderItem orderItem) {
		orderItemDao.delete(orderItem);
	}

	@Override
	@Transactional
	public List<OrderItem> getOrderItemsFromOrder(final Order order,
			final Integer startingFrom, final Integer maxResult) {
//		return orderItemDao.getOrderItemsFromOrder(order, startingFrom, maxResult);
		return null;

	}

	@Override
	@Transactional
	public List<OrderItem> getOrderItemsFromOrder(final Order order) {
		return null;

//		return orderItemDao.getOrderItemsFromOrder(order);
	}

	@Override
	@Transactional
	public Long getRowCountFromOrder(final Order order) {
		return 0L;
//		return orderItemDao.getRowCountFromOrder(order);
	}

	@Override
	@Transactional
	public List<OrderItem> getOrderItemsFromOrder(final Integer orderId) {
		Order order = orderDao.findOne(orderId);
		return getOrderItemsFromOrder(order);
	}

	@Override
	@Transactional
	public List<OrderItem> getOrderItemsFromOrder(final Integer orderId,
			final Integer startingFrom, final Integer maxResult) {
		Order order = orderDao.findOne(orderId);
		return getOrderItemsFromOrder(order, startingFrom, maxResult);
	}

	@Override
	@Transactional
	public Long getRowCountFromOrder(final Integer orderId) {
		Order order = orderDao.findOne(orderId);
		return 0L;
//		return orderItemDao.getRowCountFromOrder(order);
	}

	@Override
	@Transactional
	public void delete(final Integer orderItemId) {
		OrderItem orderItem = orderItemDao.findOne(orderItemId);
		orderItemDao.delete(orderItem);
	}

}
