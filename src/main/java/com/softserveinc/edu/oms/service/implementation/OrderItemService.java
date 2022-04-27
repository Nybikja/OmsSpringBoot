package com.softserveinc.edu.oms.service.implementation;

import com.softserveinc.edu.oms.domain.entities.Order;
import com.softserveinc.edu.oms.domain.entities.OrderItem;
import com.softserveinc.edu.oms.persistence.dao.interfaces.IOrderDao;
import com.softserveinc.edu.oms.persistence.dao.interfaces.IOrderItemDao;
import com.softserveinc.edu.oms.persistence.dao.params.SortProperties;
import com.softserveinc.edu.oms.service.interfaces.IOrderItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class OrderItemService implements IOrderItemService {

	private IOrderItemDao orderItemDao;
	private IOrderDao orderDao;

	@Autowired
	public void setOrderItemDao(final IOrderItemDao orderItemDao) {
		this.orderItemDao = orderItemDao;
	}

	@Autowired
	public void setOrderDao(final IOrderDao orderDao) {
		this.orderDao = orderDao;
	}

	/**
	 * 
	 * @see com.softserveinc.edu.oms.service.interfaces.ServiceForPaging#findAll(Integer,
	 *      Integer)
	 */
	@Override
	@Transactional
	public List<OrderItem> findAll(final Integer startingFrom,
			final Integer maxResult) {
		return orderItemDao.findAll(startingFrom, maxResult);

	}

	/**
	 *
	 * @see com.softserveinc.edu.oms.service.interfaces.ServiceForPaging#findAll(Integer,
	 *      Integer,
	 *      SortProperties)
	 */
	@Override
	@Transactional
	public List<OrderItem> findAll(final Integer startingFrom,
			final Integer maxResult, final SortProperties sortProperties) {

		return orderItemDao.findAll(startingFrom, maxResult, sortProperties);
	}

	/**
	 *
	 * @see com.softserveinc.edu.oms.service.interfaces.Service#getRowCount()
	 */
	@Override
	@Transactional
	public Long getRowCount() {
		return orderItemDao.getRowCount();
	}

	/**
	 *
	 * @see com.softserveinc.edu.oms.service.interfaces.Service#findAll()
	 */
	@Override
	@Transactional
	public List<OrderItem> findAll() {
		return orderItemDao.findAll();
	}

	/**
	 *
	 * @see com.softserveinc.edu.oms.service.interfaces.Service#findAll(com.softserveinc
	 *      .edu.oms.persistence.dao.params.SortProperties)
	 */
	@Override
	@Transactional
	public List<OrderItem> findAll(final SortProperties sortProperties) {
		return orderItemDao.findAll(sortProperties);
	}

	/**
	 *
	 * @see com.softserveinc.edu.oms.service.interfaces.Service#findByID(java.lang
	 *      .Integer)
	 */
	@Override
	@Transactional
	public OrderItem findByID(final Integer id) {
		return orderItemDao.findByID(id);
	}

	/**
	 *
	 * @see com.softserveinc.edu.oms.service.interfaces.Service#insertOrUpdate(com
	 *      .softserveinc.edu.oms.domain.AbstractEntity)
	 */
	@Override
	@Transactional
	public OrderItem insertOrUpdate(final OrderItem orderItem) {
		return orderItemDao.insertOrUpdate(orderItem);
	}

	/**
	 *
	 * @see com.softserveinc.edu.oms.service.interfaces.Service#delete(com.softserveinc
	 *      .edu.oms.domain.AbstractEntity)
	 */
	@Override
	@Transactional
	public void delete(final OrderItem orderItem) {
		orderItemDao.delete(orderItem);
	}

	/**
	 *
	 * @see IOrderItemService#
	 *      getOrderItemsFromOrder(com.softserveinc.edu.oms.domain.entities.Order,
	 *      java.lang.Integer, java.lang.Integer)
	 */
	@Override
	@Transactional
	public List<OrderItem> getOrderItemsFromOrder(final Order order,
			final Integer startingFrom, final Integer maxResult) {
		return orderItemDao.getOrderItemsFromOrder(order, startingFrom,
				maxResult);

	}

	/**
	 *
	 * @see IOrderItemService#
	 *      getOrderItemsFromOrder(com.softserveinc.edu.oms.domain.entities.Order)
	 */
	@Override
	@Transactional
	public List<OrderItem> getOrderItemsFromOrder(final Order order) {
		return orderItemDao.getOrderItemsFromOrder(order);
	}

	/**
	 * @see IOrderItemService#getRowCountFromOrder(Order)
	 */
	@Override
	@Transactional
	public Long getRowCountFromOrder(final Order order) {
		return orderItemDao.getRowCountFromOrder(order);
	}

	/**
	 * 
	 * 
	 * @see IOrderItemService#
	 *      getOrderItemsFromOrder(java.lang.Integer)
	 */
	@Override
	@Transactional
	public List<OrderItem> getOrderItemsFromOrder(final Integer orderId) {
		Order order = orderDao.findByID(orderId);
		return getOrderItemsFromOrder(order);
	}

	/**
	 * 
	 * 
	 * @see IOrderItemService#
	 *      getOrderItemsFromOrder(java.lang.Integer, java.lang.Integer,
	 *      java.lang.Integer)
	 */
	@Override
	@Transactional
	public List<OrderItem> getOrderItemsFromOrder(final Integer orderId,
			final Integer startingFrom, final Integer maxResult) {
		Order order = orderDao.findByID(orderId);
		return getOrderItemsFromOrder(order, startingFrom, maxResult);
	}

	/**
	 * 
	 * 
	 * @see IOrderItemService#
	 *      getRowCountFromOrder(java.lang.Integer)
	 */
	@Override
	@Transactional
	public Long getRowCountFromOrder(final Integer orderId) {
		Order order = orderDao.findByID(orderId);
		return orderItemDao.getRowCountFromOrder(order);
	}

	/**
	 * 
	 * @see IOrderItemService#remove
	 *      (java.lang.Integer)
	 */
	@Override
	@Transactional
	public void delete(final Integer orderItemId) {
		OrderItem orderItem = orderItemDao.findByID(orderItemId);
		orderItemDao.delete(orderItem);
	}

}
