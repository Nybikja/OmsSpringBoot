package com.softserveinc.edu.oms.web.itemsmanagement;

import com.softserveinc.edu.oms.domain.entities.Product;

import java.util.ArrayList;
import java.util.List;

public class ItemManagementUtils {

	public static List<Product> paging(final int page, final int itemsPerPage,
			final List<Product> inList) {
		List<Product> list = new ArrayList<Product>();
		int count = 0;
		for (Product entry : inList) {
			if ((count >= page * itemsPerPage - itemsPerPage)
					&& (count < page * itemsPerPage)) {
				list.add(entry);
			}
			count++;
		}

		return list;
	}

}
