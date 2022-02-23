package com.softserveinc.edu.oms.service.implementation;

import com.softserveinc.edu.oms.domain.entities.Region;
import com.softserveinc.edu.oms.repository.params.SortProperties;
import com.softserveinc.edu.oms.repository.RegionRepository;
import com.softserveinc.edu.oms.service.interfaces.IRegionService;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@AllArgsConstructor
@Service
public class RegionService implements IRegionService {

	private final RegionRepository regionDao;

	@Transactional
	@Override
	public Long getRowCount() {
		return 0L;
//		return regionDao.getRowCount();
	}

	@Transactional
	@Override
	public List<Region> findAll() {
		return regionDao.findAll();
	}

	@Transactional
	@Override
	public List<Region> findAll(final SortProperties sortProperties) {
		return null;
//		return regionDao.findAll(sortProperties);
	}

	@Transactional
	@Override
	public Region findByID(final Integer id) {
		return regionDao.findOne(id);
	}

	@Transactional
	@Override
	public Region insertOrUpdate(final Region entity) {
		return regionDao.save(entity);
	}

	@Transactional
	@Override
	public void delete(final Region entity) {
		regionDao.delete(entity);
	}

	@Transactional
	@Override
	public List<Region> findRegionByName(final String regionName) {
		return regionDao.findByName(regionName);
	}
}
