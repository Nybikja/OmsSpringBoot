package com.softserveinc.edu.oms.service.interfaces;

import com.softserveinc.edu.oms.domain.entities.Region;

import java.util.List;

public interface IRegionService extends Service<Region> {

	List<Region> findRegionByName(final String regionName);
}
