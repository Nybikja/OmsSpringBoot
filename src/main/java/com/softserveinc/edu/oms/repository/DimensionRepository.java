package com.softserveinc.edu.oms.repository;

import com.softserveinc.edu.oms.domain.entities.Dimension;
import com.softserveinc.edu.oms.repository.params.DimensionTypesEnum;
import com.softserveinc.edu.oms.repository.params.SortProperties;
import org.hibernate.criterion.Criterion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DimensionRepository extends JpaRepository<Dimension, Integer> {
    List<Dimension> findDimensionByName(final String dimensionName);

//    List<Dimension> findDimensionByName(final DimensionTypesEnum dimensionType);

    List<Dimension> findDimensionByNumberOfProduct(final int numberOfProduct);

//    List<Dimension> findDimensionByNumberOfProduct(final DimensionTypesEnum dimensionType);

//    Dimension getItemDimension();
//
//    Dimension getBoxDimension();
//
//    Dimension getPackageDimension();
//
//    Long getRowCount();

//    List<Dimension> findAll(final SortProperties sortProperties);
//
//    List<Dimension> findAll(final Integer startingFrom, final Integer maxResult);
//
//    List<Dimension> findAll(final Integer startingFrom, final Integer maxResult,
//                    final SortProperties sortProperties);

//    List<Dimension> findByCriterions(final Criterion... criterions);
}
