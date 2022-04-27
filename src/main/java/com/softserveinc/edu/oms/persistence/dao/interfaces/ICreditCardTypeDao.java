package com.softserveinc.edu.oms.persistence.dao.interfaces;

import com.softserveinc.edu.oms.domain.entities.CreditCardType;
import com.softserveinc.edu.oms.persistence.dao.IDao;

import java.util.List;

public interface ICreditCardTypeDao extends IDao<CreditCardType> {

	List<CreditCardType> findRegionByName(String cardType);

}
