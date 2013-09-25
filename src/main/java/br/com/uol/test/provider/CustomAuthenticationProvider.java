package br.com.uol.test.provider;

import java.util.ArrayList;
import java.util.List;

import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.stereotype.Component;

@Component
public class CustomAuthenticationProvider implements AuthenticationProvider {

	public Authentication authenticate(Authentication auth) throws AuthenticationException {
		if("rafael".equals(auth.getName()) && "123456".equals(auth.getCredentials().toString())){
			 List<GrantedAuthority> grantedAuths = new ArrayList<GrantedAuthority>();
	         grantedAuths.add(new SimpleGrantedAuthority("ROLE_USER"));
	         Authentication authen = new UsernamePasswordAuthenticationToken(auth.getName(), auth.getCredentials().toString(), grantedAuths);
	         return authen;
		}else{
			return null;
		}
	}

	public boolean supports(Class<? extends Object> auth) {
		  return auth.equals(UsernamePasswordAuthenticationToken.class);
	}

}
