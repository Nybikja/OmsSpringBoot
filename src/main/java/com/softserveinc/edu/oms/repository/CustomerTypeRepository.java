package com.softserveinc.edu.oms.repository;

import com.softserveinc.edu.oms.domain.entities.CreditCardType;
import com.softserveinc.edu.oms.domain.entities.CustomerType;
import com.softserveinc.edu.oms.repository.params.SortProperties;
import org.hibernate.criterion.Criterion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerTypeRepository extends JpaRepository<CustomerType, Integer> {
//    CustomerType getStandartTypeDiscount();
//
//    CustomerType getSilverTypeDiscount();
//
//    CustomerType getGoldTypeDiscount();
//
//    CustomerType getPlatinumTypeDiscount();
//
//    Long getRowCount();
//
//    List<CustomerType> findAll(final SortProperties sortProperties);
//
//    List<CustomerType> findAll(final Integer startingFrom, final Integer maxResult);
//
//    List<CustomerType> findAll(final Integer startingFrom, final Integer maxResult,
//                    final SortProperties sortProperties);
//
//    List<CustomerType> findByCriterions(final Criterion... criterions);
}
