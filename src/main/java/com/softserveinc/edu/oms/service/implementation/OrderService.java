package com.softserveinc.edu.oms.service.implementation;

import com.softserveinc.edu.oms.domain.entities.Order;
import com.softserveinc.edu.oms.repository.OrderRepository;
import com.softserveinc.edu.oms.repository.OrderStatusRepository;
import com.softserveinc.edu.oms.repository.RoleRepository;
import com.softserveinc.edu.oms.repository.params.SortProperties;
import com.softserveinc.edu.oms.service.interfaces.IOrderService;
import com.softserveinc.edu.oms.web.order.SearchFilterOptions;
import lombok.AllArgsConstructor;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@AllArgsConstructor
@Service
public class OrderService implements IOrderService {

	private final OrderRepository dao;

	private final OrderStatusRepository orderStatusDAO;

	private final RoleRepository roleDAO;

	@Transactional
	@Deprecated
	@Override
	public List<Order> findAll(final Integer startingFrom,
			final Integer maxResult) {
		// TODO Auto-generated method stub
//		return dao.findAll(startingFrom, maxResult);
		return null;

	}

	@Transactional
	@Deprecated
	@Override
	public List<Order> findAll(final Integer startingFrom,
			final Integer maxResult, final SortProperties sortProperties) {
//		return dao.findAll(startingFrom, maxResult, sortProperties);
		return null;

	}

	@Transactional
	@Override
	public Long getRowCount() {
		return null;

//		return dao.getRowCount();
	}

	@Transactional
	@Deprecated
	@Override
	public List<Order> findAll() {
		return dao.findAll();
	}

	@Transactional
	@Deprecated
	@Override
	public List<Order> findAll(final SortProperties sortProperties) {
		return null;

//		return dao.findAll(sortProperties);
	}

	@Transactional
	@Override
	public Order findByID(final Integer id) {
		return dao.findOne(id);
	}

	@Transactional
	@Override
	public Order insertOrUpdate(final Order entity) {
		return dao.save(entity);
	}

	@Transactional
	@Override
	public void delete(final Order entity) {
		dao.delete(entity);
	}

	@SuppressWarnings("unused")
	@Deprecated
	private Criterion createFilter(final SearchFilterOptions options) {
		Criterion filter = null;

		if (options.getFilterBy().equalsIgnoreCase("orderStatus")) {
			filter = Restrictions.eq(options.getFilterBy(),
					orderStatusDAO.findByOrderStatusName(options.getFilterValue()));
		}
		if (options.getFilterBy().equalsIgnoreCase("Role")) {
			// filter = Restrictions.eq(options.getFilterBy(),
			filter = Restrictions.eq("asss.role",
					roleDAO.findByName(options.getFilterValue()));
		}

		if (options.getFilterValue().equals("")
				|| options.getFilterValue().equalsIgnoreCase("None")) {
			filter = null;
		}
		return filter;
	}

	@SuppressWarnings("unused")
	@Deprecated
	private Criterion createSearch(final SearchFilterOptions options) {
		Criterion search = null;
		if (options.getSearch().equalsIgnoreCase("orderName")) {
			search = Restrictions.like(options.getSearch(),
					options.getSearchValue() + "%");
		}

		if (options.getSearch().equalsIgnoreCase("orderStatus")) {
			search = Restrictions.like(options.getSearch(),
					options.getSearchValue() + "%");
		}

		if (options.getSearch().equalsIgnoreCase("assignee")) {
			search = Restrictions.like(options.getSearch(),
					options.getSearchValue() + "%");
		}

		if (options.getSearchValue().equals("")) {
			search = null;
		}
		return search;
	}

	@Override
	public List<Order> find(Integer startingFrom, Integer maxResult, SearchFilterOptions options, SortProperties sortProperties) {
		return null;
	}

	@Override
	public Long getRowCount(SearchFilterOptions options) {
		return null;
	}

	@Override
	public Integer getMaxOrderNumber() {
		return null;
	}

	@Override
	public Boolean orderNumberExists(Integer orderNumber) {
		return null;
	}

//	@Transactional
//	@Override
//	public List<Order> find(final Integer startingFrom,
//			final Integer maxResult, final SearchFilterOptions options,
//			final SortProperties sortProperties) {
//		return dao.find(startingFrom, maxResult, sortProperties, options);
//	}

//	@Transactional
//	@Override
//	public Long getRowCount(final SearchFilterOptions options) {
//		return dao.countRowNumbers(options);
//	}

//	@Transactional
//	@Override
//	public Integer getMaxOrderNumber() {
//		return dao.findOrderNumber();
//	}

//	@Transactional
//	@Override
//	public Boolean orderNumberExists(final Integer orderNumber) {
//
//		if (dao.findByOrderNumber(orderNumber) == null) {
//			return false;
//		}
//		return true;
//	}
}
