package com.softserveinc.edu.oms.repository;

import com.softserveinc.edu.oms.domain.entities.OrderStatus;
import com.softserveinc.edu.oms.repository.params.SortProperties;
import org.hibernate.criterion.Criterion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderStatusRepository extends JpaRepository<OrderStatus, Integer> {
//    Long getRowCount();

    OrderStatus findByOrderStatusName(final String name);

//    List<OrderStatus> findAll(final SortProperties sortProperties);
//
//    List<OrderStatus> findAll(final Integer startingFrom, final Integer maxResult);
//
//    List<OrderStatus> findAll(final Integer startingFrom, final Integer maxResult,
//                    final SortProperties sortProperties);
//
//    List<OrderStatus> findByCriterions(final Criterion... criterions);
}
