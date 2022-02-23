package com.softserveinc.edu.oms.web.itemManagement;

import com.softserveinc.edu.oms.domain.entities.Product;
import com.softserveinc.edu.oms.service.interfaces.IProductService;
import com.softserveinc.edu.oms.web.itemManagement.model.ProductModel;
import com.softserveinc.edu.oms.web.user.AddEditUserValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;

import javax.servlet.http.HttpServletRequest;

public abstract class AbstractFormProductController {
	protected IProductService productService;

	protected AddEditUserValidator addEditUserValidator;

	public abstract String prepareForm(final ModelMap modelMap,
			final HttpServletRequest request);

	public abstract String onSubmit(
			@ModelAttribute("userModel") final ProductModel productModel,
			final BindingResult result);

	protected Product createProduct(final ProductModel productModel) {
		Product product = new Product();

		product.setName(productModel.getProductName());
		product.setDescription(productModel.getProductDescription());
		product.setPrice(Double.valueOf(productModel.getProductPrice()));

		return product;
	}

	@Autowired
	public void setProductService(final IProductService productService) {
		this.productService = productService;
	}
}
