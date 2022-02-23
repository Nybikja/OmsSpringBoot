package com.softserveinc.edu.oms.repository;

import com.softserveinc.edu.oms.domain.entities.CreditCardType;
import com.softserveinc.edu.oms.domain.entities.Order;
import com.softserveinc.edu.oms.domain.entities.OrderItem;
import com.softserveinc.edu.oms.repository.params.SortProperties;
import org.hibernate.criterion.Criterion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderItemRepository extends JpaRepository<OrderItem, Integer> {
//    List<OrderItem> getOrderItemsFromOrder(final Order order,
//                                           final Integer startingFrom, final Integer maxResult);
//
//    List<OrderItem> getOrderItemsFromOrder(final Order order);

//    Long getRowCountFromOrder(final Order order);
//
//    Long getRowCount();
//
//    List<OrderItem> findAll(final SortProperties sortProperties);
//
//    List<OrderItem> findAll(final Integer startingFrom, final Integer maxResult);
//
//    List<OrderItem> findAll(final Integer startingFrom, final Integer maxResult,
//                    final SortProperties sortProperties);
//
//    List<OrderItem> findByCriterions(final Criterion... criterions);

}
