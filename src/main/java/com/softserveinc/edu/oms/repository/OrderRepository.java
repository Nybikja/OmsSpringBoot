package com.softserveinc.edu.oms.repository;

import com.softserveinc.edu.oms.domain.entities.Order;
import com.softserveinc.edu.oms.domain.entities.OrderStatus;
import com.softserveinc.edu.oms.repository.params.SelectCondition;
import com.softserveinc.edu.oms.repository.params.SortProperties;
import org.hibernate.criterion.Criterion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface OrderRepository extends JpaRepository<Order, Integer> {
//    List<Order> findByTotalPrice(final double totalPrice, final SelectCondition cond);

//    List<Order> findByDeliveryDate(final Date deliveryDate, final SelectCondition cond);

//    List<Order> findByOrderDate(final Date orderDate, final SelectCondition cond);

    List<Order> findByOrderStatus(final OrderStatus orderStatus);
//
//    Long getRowCount();
//
//    List<Order> findAll(final SortProperties sortProperties);
//
//    List<Order> findAll(final Integer startingFrom, final Integer maxResult);
//
//    List<Order> findAll(final Integer startingFrom, final Integer maxResult,
//                    final SortProperties sortProperties);
//
//    List<Order> findByCriterions(final Criterion... criterions);
}
