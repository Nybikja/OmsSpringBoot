package com.softserveinc.edu.oms.web.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.session.SessionRegistry;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {

	private final static String USERS_COUNT_PARAM_NAME = "usersCount";
	private final static Integer MAX_USERS_COUNT_VALUE = 50;

	private SessionRegistry sessionRegistry;

	@RequestMapping("login.htm")
	public String handleLogin(final ModelMap map) {
		Object principal = SecurityContextHolder.getContext()
				.getAuthentication().getPrincipal();
		System.out.println(map);
		if (principal instanceof UserSecurityData) {
			System.out.println(principal);
			return "redirect:userInfo.htm";
		}
//		return "redirect:hello";
		final int usersCount = sessionRegistry.getAllPrincipals().size();

		if (MAX_USERS_COUNT_VALUE.equals(usersCount)) {
			map.put(USERS_COUNT_PARAM_NAME, usersCount);

			return "login/overloaded";
		}

		return "login/login";
	}

	@Autowired
	public void setSessionRegistry(final SessionRegistry sessionRegistry) {
		this.sessionRegistry = sessionRegistry;
	}

}
