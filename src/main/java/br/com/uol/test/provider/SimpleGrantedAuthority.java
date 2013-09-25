package br.com.uol.test.provider;

import org.springframework.security.core.GrantedAuthority;

public class SimpleGrantedAuthority implements GrantedAuthority {
	
	private static final long serialVersionUID = 6907591858385120413L;
	
	private String role;

	public SimpleGrantedAuthority(String role) {
		this.role = role;
	}

	public String getAuthority() {
		return role;
	}

}
