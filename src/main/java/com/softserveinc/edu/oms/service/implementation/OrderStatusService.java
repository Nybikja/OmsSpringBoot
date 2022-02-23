/**
 * 
 */
package com.softserveinc.edu.oms.service.implementation;

import com.softserveinc.edu.oms.domain.entities.OrderStatus;
import com.softserveinc.edu.oms.repository.params.OrderSatusTypes;
import com.softserveinc.edu.oms.repository.params.SortProperties;
import com.softserveinc.edu.oms.repository.OrderStatusRepository;
import com.softserveinc.edu.oms.service.interfaces.IOrderStatusService;

import lombok.AllArgsConstructor;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@AllArgsConstructor
@Service
public class OrderStatusService implements IOrderStatusService {

	private final OrderStatusRepository dao;

	@Transactional
	@Deprecated
	@Override
	public Long getRowCount() {
		// TODO Auto-generated method stub
//		return dao.getRowCount();
		return 0L;
	}

	@Transactional
	@Override
	public List<OrderStatus> findAll() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

	@Transactional
	@Deprecated
	@Override
	public List<OrderStatus> findAll(final SortProperties sortProperties) {
		// TODO Auto-generated method stub
//		return dao.findAll(sortProperties);
		return null;

	}

	@Transactional
	@Override
	public OrderStatus findByID(final Integer id) {
		// TODO Auto-generated method stub
		return dao.findOne(id);
	}

	@Transactional
	@Deprecated
	@Override
	public OrderStatus insertOrUpdate(final OrderStatus entity) {
		// TODO Auto-generated method stub
		return dao.save(entity);
	}

	@Transactional
	@Deprecated
	@Override
	public void delete(final OrderStatus entity) {
		dao.delete(entity);
	}

	@Transactional
	@Override
	public OrderStatus getByName(final String name) {
		Criterion nameCriteria = Restrictions.eq("orderStatusName", name);
//		List<OrderStatus> entities = dao.findByCriterions(nameCriteria);
//		return entities.size() < 1 ? null : entities.get(0);
		return null;
	}

	@Transactional
	@Override
	public OrderStatus getCreatedStatus() {
		return getByName(OrderSatusTypes.CREATED);
	}

	@Transactional
	@Override
	public OrderStatus getPendingStatus() {
		return getByName(OrderSatusTypes.PENDING);
	}

	@Transactional
	@Override
	public OrderStatus getOrderedStatus() {
		return getByName(OrderSatusTypes.ORDERED);
	}

	@Transactional
	@Override
	public OrderStatus getDeliveredStatus() {
		return getByName(OrderSatusTypes.DELIVERED);
	}

}
