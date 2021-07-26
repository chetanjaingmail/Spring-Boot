package org.intutech.config;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

	// localhost:8080/logout
	// localhost:8080/login
	
	// This function is use to configure Authentication of application.
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication()
		.withUser("stud").password("stud@123").roles("STUDENT")
		.and()
		.withUser("admin").password("admin@123").roles("ADMIN")
		.and()
		.withUser("stud1").password("stud1@123").roles("STUDENT");
	}
	
	// This function is use to configure Authorization of application.
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests()
		.antMatchers("/student/**").hasAnyRole("STUDENT")
		.antMatchers("/admin/**").hasAnyRole("ADMIN")
		.and().formLogin();
	}
	
	@Bean
	public PasswordEncoder getPassEncoder() {
		return NoOpPasswordEncoder.getInstance();
	}
	
}
