package com.softserveinc.edu.oms.service.implementation;

import com.softserveinc.edu.oms.domain.entities.Role;
import com.softserveinc.edu.oms.repository.params.SortProperties;
import com.softserveinc.edu.oms.repository.params.user.UserSelectWayCondition;
import com.softserveinc.edu.oms.repository.RoleRepository;
import com.softserveinc.edu.oms.service.interfaces.IRoleService;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@AllArgsConstructor
@Service
public class RoleService implements IRoleService {

	private final RoleRepository roleDao;

	@Transactional
	@Override
	public Long getRowCount() {
		return 0L;
//		return roleDao.getRowCount();
	}

	@Transactional
	@Override
	public List<Role> findAll() {
		return roleDao.findAll();
	}

	@Transactional
	@Override
	public List<Role> findAll(final SortProperties sortProperties) {
		return null;
//		return roleDao.findAll(sortProperties);
	}

	@Transactional
	@Override
	public Role findByID(final Integer id) {
		return roleDao.findOne(id);
	}

	@Transactional
	@Override
	public Role insertOrUpdate(final Role entity) {
		return roleDao.save(entity);
	}

	@Transactional
	@Override
	public void delete(final Role entity) {
		roleDao.delete(entity);
	}

	@Transactional
	@Override
	public Role getAdminRole() {
//		return null;
		return roleDao.getAdminRole();
	}

	@Transactional
	@Override
	public Role getCustomerRole() {
		return null;
//		return roleDao.getCustomerRole();
	}

	@Transactional
	@Override
	public Role getMerchandiserRole() {
		return null;
//		return roleDao.getMerchandiserRole();
	}

	@Transactional
	@Override
	public Role getSupervisorRole() {
		return null;
//		return roleDao.getSupervisorRole();
	}

	@Transactional
	@Override
	public List<Role> findByRoleName(final String roleName) {

		return roleDao.findByName(roleName);
	}

	@Transactional
	@Override
	public List<Role> findByRoleName(final String roleName,
			final SortProperties sortProperties) {
		return null;
//		return roleDao.findByRoleName(roleName, sortProperties);
	}

	@Transactional
	@Override
	public List<Role> findByRoleName(final String roleName,
			final UserSelectWayCondition condition) {
		return null;
//		return roleDao.findByRoleName(roleName, condition);
	}

	@Transactional
	@Override
	public List<Role> findByRoleName(final String roleName,
			final UserSelectWayCondition condition,
			final SortProperties sortProperties) {
		return null;
//		return roleDao.findByRoleName(roleName, condition, sortProperties);
	}

	@Transactional
	@Override
	public boolean containsRole(final String roleName) {
//		return roleDao.containsRole(roleName);
		return false;
	}

}
