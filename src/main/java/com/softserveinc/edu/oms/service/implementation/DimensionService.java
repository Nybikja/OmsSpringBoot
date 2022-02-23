package com.softserveinc.edu.oms.service.implementation;

import com.softserveinc.edu.oms.domain.entities.Dimension;
import com.softserveinc.edu.oms.repository.DimensionRepository;
import com.softserveinc.edu.oms.repository.params.DimensionTypesEnum;
import com.softserveinc.edu.oms.repository.params.SortProperties;
import com.softserveinc.edu.oms.service.interfaces.IDimensionService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@AllArgsConstructor
@Service
public class DimensionService implements IDimensionService {

	private final DimensionRepository dimensionDao;


	@Override
	@Transactional
	public Long getRowCount() {
		return 0L;
//		return dimensionDao.getRowCount();
	}


	@Override
	@Transactional
	public List<Dimension> findAll() {
		return dimensionDao.findAll();
	}

	@Override
	@Transactional
	public List<Dimension> findAll(SortProperties sortProperties) {
//		return dimensionDao.findAll(sortProperties);
		return null;
	}

	@Override
	@Transactional
	public Dimension findByID(Integer id) {
		return dimensionDao.findOne(id);
	}

	@Override
	@Transactional
	public Dimension insertOrUpdate(Dimension entity) {
		return dimensionDao.save(entity);
	}

	@Override
	@Transactional
	public void delete(Dimension entity) {
		dimensionDao.delete(entity);
	}

	@Override
	@Transactional
	public List<Dimension> findDimensionByName(String dimensionName) {
		return dimensionDao.findDimensionByName(dimensionName);
	}

	@Override
	@Transactional
	public List<Dimension> findDimensionByName(DimensionTypesEnum dimensionType) {
//		return dimensionDao.findDimensionByName(dimensionType);
		return null;

	}

	@Override
	@Transactional
	public List<Dimension> findDimensionByNumberOfProduct(int numberOfProduct) {
		return dimensionDao.findDimensionByNumberOfProduct(numberOfProduct);
	}

	@Override
	@Transactional
	public List<Dimension> findDimensionByNumberOfProduct(
			DimensionTypesEnum dimensionType) {
//		return dimensionDao.findDimensionByNumberOfProduct(dimensionType);
		return null;

	}

	@Override
	@Transactional
	public Dimension getItemDimension() {
		return null;

//		return dimensionDao.getItemDimension();
	}

	@Override
	@Transactional
	public Dimension getBoxDimension() {
		return null;

//		return dimensionDao.getBoxDimension();
	}

	@Override
	@Transactional
	public Dimension getPackageDimension() {
		return null;

//		return dimensionDao.getPackageDimension();
	}
}
