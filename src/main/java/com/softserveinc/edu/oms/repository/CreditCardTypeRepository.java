package com.softserveinc.edu.oms.repository;

import com.softserveinc.edu.oms.domain.entities.CreditCardType;
import com.softserveinc.edu.oms.repository.params.SortProperties;
import org.hibernate.criterion.Criterion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CreditCardTypeRepository extends JpaRepository<CreditCardType, Integer> {
//    Long getRowCount();
//
//    List<CreditCardType> findAll(final SortProperties sortProperties);
//
//    List<CreditCardType> findAll(final Integer startingFrom, final Integer maxResult);
//
//    List<CreditCardType> findAll(final Integer startingFrom, final Integer maxResult,
//                    final SortProperties sortProperties);
//
//    List<CreditCardType> findByCriterions(final Criterion... criterions);


}
