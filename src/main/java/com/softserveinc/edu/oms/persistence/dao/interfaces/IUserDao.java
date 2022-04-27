package com.softserveinc.edu.oms.persistence.dao.interfaces;

import com.softserveinc.edu.oms.domain.entities.User;
import com.softserveinc.edu.oms.persistence.dao.IPageableDao;
import com.softserveinc.edu.oms.persistence.dao.params.SortProperties;
import com.softserveinc.edu.oms.persistence.dao.params.user.UserSelectField;
import com.softserveinc.edu.oms.persistence.dao.params.user.UserSelectWayCondition;

import java.util.List;

public interface IUserDao extends IPageableDao<User> {

	List<User> findUsersBySearchValue(final String searchValue,
                                      final UserSelectField selectField,
                                      final UserSelectWayCondition condition, final Integer startingFrom,
                                      final Integer maxResult);

	List<User> findUsersBySearchValue(final String searchValue,
                                      final UserSelectField selectField,
                                      final UserSelectWayCondition condition, final Integer startingFrom,
                                      final Integer maxResult, final SortProperties sortProperties);

	Long countUsersBySearchValue(final String searchValue,
                                 final UserSelectField selectField,
                                 final UserSelectWayCondition condition);

	User findByLogin(final String login);

}