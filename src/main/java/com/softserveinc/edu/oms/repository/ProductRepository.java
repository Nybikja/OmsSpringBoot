package com.softserveinc.edu.oms.repository;

import com.softserveinc.edu.oms.domain.entities.Product;
import com.softserveinc.edu.oms.repository.params.SortProperties;
import org.hibernate.criterion.Criterion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {
    List<Product> findByName(final String productName);

//    List<Product> findByName(final String productName,
//                             final Integer startingFrom, final Integer maxResult,
//                             final SortProperties sortProperties);
//
//    List<Product> findByName(final String productName,
//                             final SortProperties sortProperties);

//    boolean containsName(final String productName);

//    int numberOfProductByName(final String productName);

//    List<Product> findByDescription(final String productDescription,
//                                    final Integer startingFrom, final Integer maxResult,
//                                    final SortProperties sortProperties);
//
    List<Product> findByDescription(final String productDescription);
//
//    List<Product> findByDescription(final String productDescription,
//                                    SortProperties sortProperties);

//    boolean containsProductByDescription(final String productDescription);

    List<Product> findByPrice(final Double productPrice);

//    List<Product> findByPriceFromTo(final Double productPriceFrom,
//                                    final Double productPriceTo);
//
//    List<Product> findByPriceFromTo(final Double productPriceFrom,
//                                    final Double productPriceTo, SortProperties sortProperties);

//    Long countProductsByName(final String productName);

//    Long countProductsByDescription(final String productDescription);

//    Long getRowCount();
//
//    List<Product> findAll(final SortProperties sortProperties);
//
//    List<Product> findAll(final Integer startingFrom, final Integer maxResult);
//
//    List<Product> findAll(final Integer startingFrom, final Integer maxResult,
//                    final SortProperties sortProperties);
//    List<Product> findByCriterions(final Criterion... criterions);
}
