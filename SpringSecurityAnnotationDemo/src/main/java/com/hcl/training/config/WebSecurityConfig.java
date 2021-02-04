package com.hcl.training.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.User.UserBuilder;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {

		UserBuilder users = User.withDefaultPasswordEncoder();
		auth.inMemoryAuthentication().withUser(users.username("vijay").password("vijay123").roles("GUEST"))
				.withUser(users.username("hcl").password("hcl123").roles("ADMIN"))
		.withUser(users.username("dba").password("dba123").roles("DBA"))
		.withUser(users.username("dotnet").password("dotnet123").roles("DOTNET"));
	}

	@Autowired
	protected void configure(HttpSecurity hs) throws Exception {
		hs.authorizeRequests()
		.antMatchers("/").hasAnyRole("GUEST", "ADMIN","DBA","DOTNET")
		.antMatchers("/java-course").hasAnyRole("GUEST", "ADMIN")
		.antMatchers("/premium-courses").hasRole("ADMIN")
		.antMatchers("/dba").hasAnyRole("DBA","ADMIN")
		.antMatchers("/dotnet").hasAnyRole("DOTNET","ADMIN")
		.and()
		.formLogin()
		.loginPage("/login")
		.loginProcessingUrl("/authenticateTheUser").permitAll().and().logout().permitAll();
	}
}
