package com.sistemaFacturacion.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.sistemaFacturacion.repository.UsuarioRepository;

import java.util.ArrayList;
@Service
public class AuthUserDetailService implements UserDetailsService {
	
	@Autowired
	private UsuarioRepository userRepository;
	
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return new User("diego", "{noop}platzi", new ArrayList<>());
    }
	
	
	
}
