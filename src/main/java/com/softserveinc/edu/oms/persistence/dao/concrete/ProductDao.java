package com.softserveinc.edu.oms.persistence.dao.concrete;

import com.softserveinc.edu.oms.domain.entities.Product;
import com.softserveinc.edu.oms.persistence.dao.HibernatePageableDao;
import com.softserveinc.edu.oms.persistence.dao.interfaces.IProductDao;
import com.softserveinc.edu.oms.persistence.dao.params.SortProperties;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ProductDao extends HibernatePageableDao<Product> implements
		IProductDao {

	private static final Criterion IF_IS_ACTIVE = Restrictions.eq("active",
			true);

	public ProductDao() {
		super(Product.class);
	}

	@Override
	public List<Product> findAll(final Integer startingFrom,
			final Integer maxResult, final SortProperties sortProperties) {
		return findByCriterions(startingFrom, maxResult, sortProperties,
				IF_IS_ACTIVE);
	}

	@Override
	public Long getRowCount() {
		return getRowCountByCriterions(IF_IS_ACTIVE);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.softserveinc.edu.oms.persistence.dao.concrete.IProductDAO#findByName
	 * (java.lang.String)
	 */
	@Override
	public List<Product> findByName(final String name) {
		return findByCriterions(
				Restrictions.like("product_name", name + "%"),
				IF_IS_ACTIVE);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.softserveinc.edu.oms.persistence.dao.concrete.IProductDAO#findByName
	 * (java.lang.String,
	 * com.softserveinc.edu.oms.persistence.dao.params.SortProperties)
	 */
	@Override
	public List<Product> findByName(final String name,
			final SortProperties sortProperties) {
		return findByCriterions(sortProperties,
				Restrictions.like("name", name + "%"),
				IF_IS_ACTIVE);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.softserveinc.edu.oms.persistence.dao.concrete.IProductDAO#
	 * containsProductByName(java.lang.String)
	 */
	@Override
	public boolean containsProductByName(final String name) {
		return findByCriterions(Restrictions.like("product_name", name))
				.size() > 0;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.softserveinc.edu.oms.persistence.dao.concrete.IProductDAO#
	 * numberOfProductByName(java.lang.String)
	 */
	@Override
	public int numberOfProductByName(final String name) {
		return findByCriterions(Restrictions.like("product_name", name))
				.size();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.softserveinc.edu.oms.persistence.dao.concrete.IProductDAO#
	 * findByDescription(java.lang.String)
	 */
	@Override
	public List<Product> findByDescription(final String description) {
		return findByCriterions(
				Restrictions.like("product_description", description
						+ "%"), IF_IS_ACTIVE);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.softserveinc.edu.oms.persistence.dao.concrete.IProductDAO#
	 * findByDescription(java.lang.String,
	 * com.softserveinc.edu.oms.persistence.dao.params.SortProperties)
	 */
	@Override
	public List<Product> findByDescription(final String description,
			final SortProperties sortProperties) {
		return findByCriterions(
				sortProperties,
				Restrictions.like("product_description", description
						+ "%"), IF_IS_ACTIVE);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.softserveinc.edu.oms.persistence.dao.concrete.IProductDAO#
	 * containsProductByDescription(java.lang.String)
	 */
	@Override
	public boolean containsProductByDescription(final String description) {
		return findByCriterions(
				Restrictions.like("product_description", description))
				.size() > 0;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.softserveinc.edu.oms.persistence.dao.concrete.IProductDAO#
	 * numberOfProductByDescription(java.lang.String)
	 */
	@Override
	public int numberOfProductByDescription(final String description) {
		return findByCriterions(
				Restrictions.like("product_description", description))
				.size();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.softserveinc.edu.oms.persistence.dao.concrete.IProductDAO#findByPrice
	 * (java.lang.Double)
	 */
	@Override
	public List<Product> findByPrice(final Double price) {
		return findByCriterions(Restrictions.eq("product_price", price),
				IF_IS_ACTIVE);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.softserveinc.edu.oms.persistence.dao.concrete.IProductDAO#
	 * findByPriceFromTo(java.lang.Double, java.lang.Double)
	 */
	@Override
	public List<Product> findByPriceFromTo(final Double productPriceFrom,
			final Double productPriceTo) {
		return findByCriterions(Restrictions.between("price",
				productPriceFrom, productPriceTo), IF_IS_ACTIVE);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.softserveinc.edu.oms.persistence.dao.concrete.IProductDAO#
	 * findByPriceFromTo(java.lang.Double, java.lang.Double,
	 * com.softserveinc.edu.oms.persistence.dao.params.SortProperties)
	 */
	@Override
	public List<Product> findByPriceFromTo(final Double productPriceFrom,
			final Double productPriceTo, final SortProperties sortProperties) {
		return findByCriterions(sortProperties, Restrictions.between(
				"price", productPriceFrom, productPriceTo), IF_IS_ACTIVE);
	}

	@Override
	public List<Product> findByName(final String name,
			final Integer startingFrom, final Integer maxResult,
			final SortProperties sortProperties) {
		return findByCriterions(startingFrom, maxResult, sortProperties,
				Restrictions.like("product_name", name + "%"),
				IF_IS_ACTIVE);
	}

	@Override
	public List<Product> findByDescription(final String productDescription,
			final Integer startingFrom, final Integer maxResult,
			final SortProperties sortProperties) {
		return findByCriterions(
				startingFrom,
				maxResult,
				sortProperties,
				Restrictions.like("description", productDescription
						+ "%"), IF_IS_ACTIVE);
	}

	@Override
	public Long countProductsByName(final String productName) {
		return getRowCountByCriterions(
				Restrictions.like("name", productName + "%"),
				IF_IS_ACTIVE);
	}

	@Override
	public Long countProductsByDescription(final String productDescription) {
		return getRowCountByCriterions(
				Restrictions.like("description", productDescription
						+ "%"), IF_IS_ACTIVE);
	}
}
