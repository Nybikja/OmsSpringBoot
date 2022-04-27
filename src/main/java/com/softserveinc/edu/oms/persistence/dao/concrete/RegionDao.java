package com.softserveinc.edu.oms.persistence.dao.concrete;

import com.softserveinc.edu.oms.domain.entities.Region;
import com.softserveinc.edu.oms.persistence.dao.HibernateDao;
import com.softserveinc.edu.oms.persistence.dao.interfaces.IRegionDao;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class RegionDao extends HibernateDao<Region> implements IRegionDao {

	public RegionDao() {
		super(Region.class);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.softserveinc.edu.oms.persistence.dao.concrete.IRegionDAO#findRegionByName
	 * (java.lang.String)
	 */
	@Override
	public List<Region> findRegionByName(final String regionName) {
		return findByCriterions(Restrictions.like("regionName", regionName
				+ "%"));
	}
}
