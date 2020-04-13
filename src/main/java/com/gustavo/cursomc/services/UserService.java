

package com.gustavo.cursomc.services;

import org.springframework.security.core.context.SecurityContextHolder;

import com.gustavo.cursomc.security.UserSS;

public class UserService {
	
	public static UserSS authenticated() {
		try {
			//Pega o usuário atual logado
			return (UserSS) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		} catch (Exception E) {
			return null;
		}
	}
	
}
