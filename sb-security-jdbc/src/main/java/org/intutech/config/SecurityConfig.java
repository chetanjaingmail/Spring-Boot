package org.intutech.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter{

	@Autowired
	private DataSource ds;
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.jdbcAuthentication() // provide type of authentication
		.dataSource(ds)
		.usersByUsernameQuery("select email, password, enable from register where email=?") // get username, password, enable flag by username
		.authoritiesByUsernameQuery("select email, role from register where email=?");// get username, role by username
	}
	
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests()
		.antMatchers("/manager/**").hasAnyRole("MANAGER")
		.antMatchers("/developer/**").hasAnyRole("DEVELOPER")
		.antMatchers("/tester/**").hasAnyRole("TESTER")
		.antMatchers("/employee/**").hasAnyRole("MANAGER", "DEVELOPER", "TESTER")
		.antMatchers("/register**").permitAll()
		.and().formLogin();
	}
	
	@Bean
	public PasswordEncoder getEncoder() {
		return NoOpPasswordEncoder.getInstance();
	}
	
}
