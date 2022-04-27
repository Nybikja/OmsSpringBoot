package com.softserveinc.edu.oms.persistence.dao.concrete;

import com.softserveinc.edu.oms.domain.entities.CreditCardType;
import com.softserveinc.edu.oms.persistence.dao.HibernateDao;
import com.softserveinc.edu.oms.persistence.dao.interfaces.ICreditCardTypeDao;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CreditCardTypeDao extends HibernateDao<CreditCardType> implements
		ICreditCardTypeDao {

	public CreditCardTypeDao() {
		super(CreditCardType.class);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.softserveinc.edu.oms.persistence.dao.concrete.ICreditCardType#
	 * findRegionByName(java.lang.String)
	 */
	@Override
	public List<CreditCardType> findRegionByName(final String cardType) {
		return findByCriterions(Restrictions.like("cardType", cardType + "%"));
	}
}
