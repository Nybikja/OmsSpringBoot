package com.softserveinc.edu.oms.service.implementation;

import com.softserveinc.edu.oms.domain.entities.Role;
import com.softserveinc.edu.oms.domain.entities.User;
import com.softserveinc.edu.oms.repository.params.SortProperties;
import com.softserveinc.edu.oms.repository.params.user.UserSelectField;
import com.softserveinc.edu.oms.repository.params.user.UserSelectWayCondition;
import com.softserveinc.edu.oms.repository.RoleRepository;
import com.softserveinc.edu.oms.repository.UserRepository;
import com.softserveinc.edu.oms.service.interfaces.IUserService;
import com.softserveinc.edu.oms.web.security.UserSecurityData;

import lombok.AllArgsConstructor;
import org.springframework.dao.DataAccessException;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@Service
public class UserService implements IUserService, UserDetailsService {
	private final UserRepository userDao;
	private final RoleRepository roleDao;


	@Transactional
	@Override
	public List<User> findAll(final Integer startingFrom,
			final Integer maxResult) {
//		return userDao.findAll(startingFrom, maxResult);
		return userDao.findAll();
//		return null;
	}

	@Transactional
	@Override
	public List<User> findAll(final Integer startingFrom,
			final Integer maxResult, final SortProperties sortProperties) {
//		return userDao.findAll(startingFrom, maxResult, sortProperties);
		return userDao.findAll();
	}

	@Transactional
	@Override
	public Long getRowCount() {
		return 0L;
//		return userDao.getRowCount();
	}

	@Transactional
	@Override
	public List<User> findAll() {
		return userDao.findAll();
	}

	@Transactional
	@Override
	public List<User> findAll(final SortProperties sortProperties) {
		return null;
//		return userDao.findAll(sortProperties);
	}

	@Transactional
	@Override
	public User findByID(final Integer id) {
		return userDao.findOne(id);
	}

	@Transactional
	@Override
	public void delete(final User entity) {
		entity.setActive(false);

		userDao.save(entity);
	}

	@Transactional
	@Override
	public User insertOrUpdate(final User entity) {
		return userDao.save(entity);
	}

	@Transactional
	@Override
	public List<User> findUsersBySearchValue(final String searchValue,
			final UserSelectField selectField,
			final UserSelectWayCondition condition, final Integer startingFrom,
			final Integer maxResult) {
//		return userDao.findUsersBySearchValue(searchValue, selectField, condition, startingFrom, maxResult);
		List<User> user = new ArrayList<>();
		user.add(userDao.findByLogin(searchValue));
		return user;
	}

	@Transactional
	@Override
	public List<User> findUsersBySearchValue(final String searchValue,
			final UserSelectField selectField,
			final UserSelectWayCondition condition, final Integer startingFrom,
			final Integer maxResult, final SortProperties sortProperties) {
//		return userDao.findUsersBySearchValue(searchValue, selectField, condition, startingFrom, maxResult, sortProperties);
		List<User> user = new ArrayList<>();
		user.add(userDao.findByLogin(searchValue));
		return user;
	}

	@Transactional
	@Override
	public Long countUsersBySearchValue(final String searchValue,
			final UserSelectField selectField,
			final UserSelectWayCondition condition) {
//		return userDao.countUsersBySearchValue(searchValue, selectField, condition);
		return null;
	}

	@Transactional
	@Override
	public UserDetails loadUserByUsername(final String login)
			throws UsernameNotFoundException, DataAccessException {
		final User user = userDao.findByLogin(login);

		if (user == null) {
			throw new UsernameNotFoundException("user not found");
		}

		return new UserSecurityData(user);
	}

	@Transactional
	@Override
	public User findByLogin(final String login) {
		return userDao.findByLogin(login);
	}

	@Transactional
	@Override
	public List<User> findMerchandiserUsers() {
//		Role merchandiserRole = roleDao.getMerchandiserRole();
//		Long maxResult = countUsersBySearchValue(
//				merchandiserRole.getRoleName(), UserSelectField.ROLE,
//				UserSelectWayCondition.EQUALS);
//
//		return userDao.findUsersBySearchValue(merchandiserRole.getRoleName(),
//				UserSelectField.ROLE, UserSelectWayCondition.EQUALS, 0,
//				maxResult.intValue());
		return null;
	}
}