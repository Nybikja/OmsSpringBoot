package com.softserveinc.edu.oms.repository;

import com.softserveinc.edu.oms.domain.entities.Region;
import com.softserveinc.edu.oms.repository.params.SortProperties;
import org.hibernate.criterion.Criterion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RegionRepository extends JpaRepository<Region, Integer> {
    List<Region> findByName(final String regionName);

//    Long getRowCount();
//
//    List<Region> findAll(final SortProperties sortProperties);
//
//    List<Region> findAll(final Integer startingFrom, final Integer maxResult);
//
//    List<Region> findAll(final Integer startingFrom, final Integer maxResult,
//                    final SortProperties sortProperties);
//
//    List<Region> findByCriterions(final Criterion... criterions);
}
