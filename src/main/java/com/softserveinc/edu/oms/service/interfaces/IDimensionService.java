package com.softserveinc.edu.oms.service.interfaces;

import com.softserveinc.edu.oms.domain.entities.Dimension;
import com.softserveinc.edu.oms.repository.params.DimensionTypesEnum;

import java.util.List;

public interface IDimensionService extends Service<Dimension> {
	List<Dimension> findDimensionByName(
			final String dimensionName);

	List<Dimension> findDimensionByName(
			final DimensionTypesEnum dimensionType);

	List<Dimension> findDimensionByNumberOfProduct(
			final int numberOfProduct);

	List<Dimension> findDimensionByNumberOfProduct(
			final DimensionTypesEnum dimensionType);

	Dimension getItemDimension();

	Dimension getBoxDimension();

	Dimension getPackageDimension();
}
