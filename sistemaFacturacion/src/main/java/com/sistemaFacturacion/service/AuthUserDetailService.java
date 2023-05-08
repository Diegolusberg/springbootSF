package com.sistemaFacturacion.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.sistemaFacturacion.entity.Usuario;
import com.sistemaFacturacion.repository.UsuarioRepository;

import java.util.ArrayList;
@Service
public class AuthUserDetailService implements UserDetailsService {
	
	@Autowired
	private UsuarioRepository userRepository;
	
    /*@Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return new User("diego", "{noop}platzi", new ArrayList<>());
    }*/
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
	    
	    Usuario user = userRepository.findByUsername(username);
	    //System.out.print(user.getUsername() + "pass " + user.getPassword());
	    if (user == null) {
	        throw new UsernameNotFoundException("Usuario no encontrado");
	    }
	    
	    return new User(user.getUsername(), user.getPassword(), new ArrayList<>());
	}



 
	
	
	
}
