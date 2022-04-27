/*
 * DimensionDao.java
 *
 * Version 1.0
 *
 * 11.07.2011
 *
 * (c) Vitalik Nobis nobisvitaliy@gmail.com
 */
package com.softserveinc.edu.oms.persistence.dao.concrete;

import com.softserveinc.edu.oms.domain.entities.Dimension;
import com.softserveinc.edu.oms.persistence.dao.HibernateDao;
import com.softserveinc.edu.oms.persistence.dao.interfaces.IDimensionDao;
import com.softserveinc.edu.oms.persistence.dao.params.DimensionTypesEnum;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author nobisvitaliy
 * 
 */
@Repository
public class DimensionDao extends HibernateDao<Dimension> implements
		IDimensionDao {
	public DimensionDao() {
		super(Dimension.class);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.softserveinc.edu.oms.persistence.dao.concrete.IDimensionDAO#
	 * findDimensionByName(java.lang.String)
	 */
	@Override
	public List<Dimension> findDimensionByName(final String dimension_name) {
		List<Dimension> dimensions = findByCriterions(Restrictions.eq(
				"name", dimension_name));
		return dimensions;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.softserveinc.edu.oms.persistence.dao.concrete.IDimensionDAO#
	 * findDimensionByName
	 * (com.softserveinc.edu.oms.persistence.dao.params.DimensionTypesEnum)
	 */
	@Override
	public List<Dimension> findDimensionByName(
			final DimensionTypesEnum dimensionType) {
		List<Dimension> dimensions = findByCriterions(Restrictions.eq(
				"name", dimensionType.getDimensionTypeName()));
		return dimensions;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.softserveinc.edu.oms.persistence.dao.concrete.IDimensionDAO#
	 * findDimensionByNumberOfProducts(int)
	 */
	@Override
	public List<Dimension> findDimensionByNumberOfProducts(
			final int number_of_products) {
		List<Dimension> dimensions = findByCriterions(Restrictions.eq(
				"number_of_products", number_of_products));
		return dimensions;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.softserveinc.edu.oms.persistence.dao.concrete.IDimensionDAO#
	 * findDimensionByNumberOfProducts
	 * (com.softserveinc.edu.oms.persistence.dao.params.DimensionTypesEnum)
	 */
	@Override
	public List<Dimension> findDimensionByNumberOfProducts(
			final DimensionTypesEnum dimensionType) {
		List<Dimension> dimensions = findByCriterions(Restrictions
				.eq("number_of_products",
						dimensionType.getNumberOfProductInThisType()));
		return dimensions;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.softserveinc.edu.oms.persistence.dao.concrete.IDimensionDAO#
	 * getItemDimension()
	 */
	@Override
	public Dimension getItemDimension() {
		List<Dimension> dimensions = findByCriterions(Restrictions.eq(
				"number_of_products",
				DimensionTypesEnum.ITEM.getNumberOfProductInThisType()));
		return dimensions.size() < 1 ? null : dimensions.get(0);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.softserveinc.edu.oms.persistence.dao.concrete.IDimensionDAO#
	 * getBoxDimension()
	 */
	@Override
	public Dimension getBoxDimension() {
		List<Dimension> dimensions = findByCriterions(Restrictions.eq(
				"number_of_products",
				DimensionTypesEnum.BOX.getNumberOfProductInThisType()));
		return dimensions.size() < 1 ? null : dimensions.get(0);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.softserveinc.edu.oms.persistence.dao.concrete.IDimensionDAO#
	 * getPackageDimension()
	 */
	@Override
	public Dimension getPackageDimension() {
		List<Dimension> dimensions = findByCriterions(Restrictions.eq(
				"number_of_products",
				DimensionTypesEnum.PACKAGE.getNumberOfProductInThisType()));
		return dimensions.size() < 1 ? null : dimensions.get(0);
	}
}
