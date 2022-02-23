/**
 * 
 */
package com.softserveinc.edu.oms.web;

import com.softserveinc.edu.oms.web.unifiederrorpage.ErrorController;
import com.softserveinc.edu.oms.web.unifiederrorpage.ErrorInfo;
import org.springframework.ui.ModelMap;

import javax.servlet.http.HttpServletRequest;

/**
 * @author Vitalik
 * 
 */
public class AbstractControler {

	public String makeUpRequest(final HttpServletRequest request,
			final ModelMap modelMap, final IHandler handler) {
		try {
			return handler.handle(request, modelMap);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			ErrorInfo errorInfo = new ErrorInfo();
			errorInfo.setException(e);
			return ErrorController.redirectToErrorPage(errorInfo, request);
		}
	}
}
