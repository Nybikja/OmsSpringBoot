package com.softserveinc.edu.oms.service.implementation;

import com.softserveinc.edu.oms.domain.entities.Product;
import com.softserveinc.edu.oms.repository.params.SortProperties;
import com.softserveinc.edu.oms.repository.ProductRepository;
import com.softserveinc.edu.oms.service.interfaces.IProductService;
import com.softserveinc.edu.oms.web.itemManagement.util.ProductSelectField;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@AllArgsConstructor
@Service
public class ProductService implements IProductService {

	private final ProductRepository productDao;

	@Override
	@Transactional
	public Long getRowCount() {
		return 0L;
//		return productDao.getRowCount();
	}

	@Override
	@Transactional
	public List<Product> findAll() {
		return productDao.findAll();
	}

	@Override
	@Transactional
	public List<Product> findAll(final SortProperties sortProperties) {
		return null;
//		return productDao.findAll(sortProperties);
	}

	@Override
	@Transactional
	public Product findByID(final Integer id) {
		return productDao.findOne(id);
	}

	@Override
	@Transactional
	public Product insertOrUpdate(final Product entity) {
		return productDao.save(entity);
	}

	@Override
	@Transactional
	public void delete(final Product entity) {
		entity.setActive(false);

		productDao.save(entity);
	}

	@Override
	@Transactional
	public List<Product> findByName(final String productName) {
		return productDao.findByName(productName);
	}

	@Override
	@Transactional
	public List<Product> findByName(final String productName,
			final SortProperties sortProperties) {
//		return productDao.findByName(productName, sortProperties);
		return null;

	}

	@Override
	@Transactional
	public boolean containsProductByName(final String productName) {
		return false;
//		return productDao.containsName(productName);
	}

	@Override
	@Transactional
	public int numberOfProductByName(final String productName) {
		return 0;
//		return productDao.numberOfProductByName(productName);
	}

	@Override
	@Transactional
	public List<Product> findByDescription(final String productDescription) {
		return productDao.findByDescription(productDescription);
	}

	@Override
	@Transactional
	public List<Product> findByDescription(final String productDescription,
			final SortProperties sortProperties) {
//		return productDao.findByDescription(productDescription, sortProperties);
		return null;
	}

	@Override
	@Transactional
	public boolean containsProductByDescription(final String productDescription) {
		return false;
//		return productDao.containsProductByDescription(productDescription);
	}

	@Override
	public int numberOfProductByDescription(String productDescription) {
		return 0;
	}

//	@Override
//	@Transactional
//	public int numberOfProductByDescription(final String productDescription) {
//		return productDao.numberOfProductByDescription(productDescription);
//	}

	@Override
	@Transactional
	public List<Product> findByPrice(final Double productPrice) {
		return productDao.findByPrice(productPrice);
	}

	@Override
	@Transactional
	public List<Product> findByPriceFromTo(final Double productPriceFrom,
			final Double productPriceTo) {
//		return productDao.findByPriceFromTo(productPriceFrom, productPriceTo);
		return null;

	}

	@Override
	@Transactional
	public List<Product> findByPriceFromTo(final Double productPriceFrom,
			final Double productPriceTo, final SortProperties sortProperties) {
//		return productDao.findByPriceFromTo(productPriceFrom, productPriceTo, sortProperties);
		return null;
	}

	@Override
	@Transactional
	public List<Product> findAll(final Integer startingFrom,
			final Integer maxResult) {
//		return productDao.findAll(startingFrom, maxResult);
		return null;
	}

	@Override
	@Transactional
	public List<Product> findAll(final Integer startingFrom,
			final Integer maxResult, final SortProperties sortProperties) {
//		return productDao.findAll(startingFrom, maxResult, sortProperties);
		return null;
	}

	@Override
	@Transactional
	public List<Product> findByName(final String productName,
			final Integer startingFrom, final Integer maxResult,
			final SortProperties sortProperties) {
//		return productDao.findByName(productName, startingFrom, maxResult, sortProperties);
		return null;
	}

	@Override
	@Transactional
	public List<Product> findByDescription(final String productDescription,
			final Integer startingFrom, final Integer maxResult,
			final SortProperties sortProperties) {
//		return productDao.findByDescription(productDescription, startingFrom, maxResult, sortProperties);
		return null;
	}

	@Override
	@Transactional
	public List<Product> findBySearchValue(final String searchValue,
			final ProductSelectField selectField, final Integer startingFrom,
			final Integer maxResult, final SortProperties sortProperties) {
//		switch (selectField) {
//		case PRODUCT_NAME:
//			return findByName(searchValue, startingFrom, maxResult,
//					sortProperties);
//
//		case DESCRIPTION:
//			return findByDescription(searchValue, startingFrom, maxResult,
//					sortProperties);
//
//		default:
//			return findByName(searchValue, startingFrom, maxResult,
//					sortProperties);
//		}
		return null;
	}

	@Override
	@Transactional
	public Integer countProductsBySearchValue(final String searchValue,
			final ProductSelectField selectField) {
//		switch (selectField) {
//		case PRODUCT_NAME:
//			return countProductsByName(searchValue).intValue();
//
//		case DESCRIPTION:
//			return countProductsByDescription(searchValue).intValue();
//
//		default:
//			return numberOfProductByDescription(searchValue);
//		}
		return null;

	}

	@Override
	@Transactional
	public Long countProductsByName(final String productName) {
		return 0L;
//		return productDao.countProductsByName(productName);
	}

	@Override
	@Transactional
	public Long countProductsByDescription(final String productDescription) {
		return 0L;
//		return productDao.countProductsByDescription(productDescription);
	}

}
