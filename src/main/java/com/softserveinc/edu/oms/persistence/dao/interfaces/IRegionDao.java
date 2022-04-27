package com.softserveinc.edu.oms.persistence.dao.interfaces;

import com.softserveinc.edu.oms.domain.entities.Region;
import com.softserveinc.edu.oms.persistence.dao.IDao;

import java.util.List;

public interface IRegionDao extends IDao<Region>{

	List<Region> findRegionByName(final String regionName);

}