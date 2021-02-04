package com.hcl.training.config;

import org.springframework.security.web.context.AbstractSecurityWebApplicationInitializer;
public class SecurityAppInitializer  extends AbstractSecurityWebApplicationInitializer {

	public SecurityAppInitializer() {
		super(WebSecurityConfig.class);
	}
}
