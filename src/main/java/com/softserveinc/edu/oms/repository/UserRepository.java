package com.softserveinc.edu.oms.repository;

import com.softserveinc.edu.oms.domain.entities.User;
import com.softserveinc.edu.oms.repository.params.SortProperties;
import com.softserveinc.edu.oms.repository.params.user.UserSelectField;
import com.softserveinc.edu.oms.repository.params.user.UserSelectWayCondition;
import org.hibernate.criterion.Criterion;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.domain.Pageable;
import java.util.List;

public interface UserRepository extends JpaRepository<User, Integer> {
//    List<User> findUsersBySearchValue(final String searchValue,
//                                      final UserSelectField selectField,
//                                      final UserSelectWayCondition condition, final Integer startingFrom,
//                                      final Integer maxResult);
//
//    List<User> findUsersBySearchValue(final String searchValue,
//                                      final UserSelectField selectField,
//                                      final UserSelectWayCondition condition, final Integer startingFrom,
//                                      final Integer maxResult, final SortProperties sortProperties);
//
//    Long countUsersBySearchValue(final String searchValue,
//                                 final UserSelectField selectField,
//                                 final UserSelectWayCondition condition);

    User findByLogin(final String login);

//    Long getRowCount();
//
//    List<User> findAll(final SortProperties sortProperties);
//
    List<User> findAll();
//
//    List<User> findAll(final Integer startingFrom, final Integer maxResult,
//                    final SortProperties sortProperties);
//
//    List<User> findByCriterions(final Criterion... criterions);
}
