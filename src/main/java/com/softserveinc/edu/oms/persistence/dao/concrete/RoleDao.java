package com.softserveinc.edu.oms.persistence.dao.concrete;

import com.softserveinc.edu.oms.domain.entities.Role;
import com.softserveinc.edu.oms.persistence.dao.HibernateDao;
import com.softserveinc.edu.oms.persistence.dao.interfaces.IRoleDao;
import com.softserveinc.edu.oms.persistence.dao.params.SortProperties;
import com.softserveinc.edu.oms.persistence.dao.params.user.UserSelectWayCondition;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class RoleDao extends HibernateDao<Role> implements IRoleDao {

	public RoleDao() {
		super(Role.class);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.softserveinc.edu.oms.persistence.dao.concrete.IRoleDAO#getAdminRole()
	 */
	@Override
	public Role getAdminRole() {
		startSession();

		Criteria criteria = session.createCriteria(Role.class);
		criteria.add(Restrictions.eq("name", "Administrator"));
		@SuppressWarnings("unchecked")
		final List<Role> entities = criteria.list();

		return entities.size() < 1 ? null : entities.get(0);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.softserveinc.edu.oms.persistence.dao.concrete.IRoleDAO#getCustomerRole
	 * ()
	 */
	@Override
	public Role getCustomerRole() {
		startSession();

		Criteria criteria = session.createCriteria(Role.class);
		criteria.add(Restrictions.eq("name", "Customer"));
		@SuppressWarnings("unchecked")
		final List<Role> entities = criteria.list();

		return entities.size() < 1 ? null : entities.get(0);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.softserveinc.edu.oms.persistence.dao.concrete.IRoleDAO#
	 * getMerchandiserRole()
	 */
	@Override
	public Role getMerchandiserRole() {
		startSession();

		Criteria criteria = session.createCriteria(Role.class);
		criteria.add(Restrictions.eq("name", "Merchandiser"));
		@SuppressWarnings("unchecked")
		final List<Role> entities = criteria.list();

		return entities.size() < 1 ? null : entities.get(0);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.softserveinc.edu.oms.persistence.dao.concrete.IRoleDAO#getSupervisorRole
	 * ()
	 */
	@Override
	public Role getSupervisorRole() {
		startSession();

		Criteria criteria = session.createCriteria(Role.class);
		criteria.add(Restrictions.eq("name", "Supervisor"));
		@SuppressWarnings("unchecked")
		final List<Role> entities = criteria.list();

		return entities.size() < 1 ? null : entities.get(0);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.softserveinc.edu.oms.persistence.dao.concrete.IRoleDAO#findByRoleName
	 * (java.lang.String)
	 */
	@Override
	public List<Role> findByRoleName(final String roleName) {
		startSession();

		Criteria criteria = session.createCriteria(Role.class);
		criteria.add(Restrictions.eq("name", roleName));
		@SuppressWarnings("unchecked")
		final List<Role> entities = criteria.list();

		return entities;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.softserveinc.edu.oms.persistence.dao.concrete.IRoleDAO#findByRoleName
	 * (java.lang.String,
	 * com.softserveinc.edu.oms.persistence.dao.params.SortProperties)
	 */
	@Override
	public List<Role> findByRoleName(final String roleName,
			final SortProperties sortProperties) {
		final List<Role> entities = super.findByCriterions(sortProperties,
				Restrictions.eq("name", roleName));
		return entities;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.softserveinc.edu.oms.persistence.dao.concrete.IRoleDAO#findByRoleName
	 * (java.lang.String,
	 * com.softserveinc.edu.oms.persistence.dao.params.SelectCondition)
	 */
	@Override
	public List<Role> findByRoleName(final String roleName,
			final UserSelectWayCondition condition) {
		List<Role> roles = findByCriterions(condition.createStringCriterion(
				"name", roleName));

		return roles;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.softserveinc.edu.oms.persistence.dao.concrete.IRoleDAO#findByRoleName
	 * (java.lang.String,
	 * com.softserveinc.edu.oms.persistence.dao.params.SelectCondition,
	 * com.softserveinc.edu.oms.persistence.dao.params.SortProperties)
	 */
	@Override
	public List<Role> findByRoleName(final String roleName,
			final UserSelectWayCondition condition,
			final SortProperties sortProperties) {
		List<Role> roles = findByCriterions(sortProperties,
				condition.createStringCriterion("name", roleName));

		return roles;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.softserveinc.edu.oms.persistence.dao.concrete.IRoleDAO#containsRole
	 * (java.lang.String)
	 */
	@Override
	public boolean containsRole(final String roleName) {
		startSession();

		Criteria criteria = session.createCriteria(Role.class);
		criteria.add(Restrictions.eq("name", roleName));
		@SuppressWarnings("unchecked")
		final List<Role> entities = criteria.list();

		return entities.size() > 0;
	}

	public Role findByRole(final String roleName) {
		startSession();
		Criteria criteria = session.createCriteria(Role.class);
		criteria.add(Restrictions.eq("name", roleName));
		@SuppressWarnings("unchecked")
		final List<Role> entities = criteria.list();

		return entities.size() < 1 ? null : entities.get(0);
	}

}
