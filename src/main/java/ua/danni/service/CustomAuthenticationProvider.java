package ua.danni.service;

import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Artem on 27.03.2016.
 */
@Service("provider")
public class CustomAuthenticationProvider implements AuthenticationProvider {
    @Override
    @Transactional
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
        String login = authentication.getName();
        String password = authentication.getCredentials().toString();

        if (login == null || password == null || login.isEmpty() || password.isEmpty()) {
            return null;
        }

        if (login.equals("lalka") && password.equals("lalka")) {
            List<GrantedAuthority> grantedAuth = new ArrayList<>();
            grantedAuth.add(new SimpleGrantedAuthority("ROLE_ADMIN"));
                  return new UsernamePasswordAuthenticationToken(login,password,grantedAuth);
        } else {

            return null;
        }
            }

    @Override
    public boolean supports(Class<?> authentication) {
        return authentication.equals(UsernamePasswordAuthenticationToken.class);
    }
}
