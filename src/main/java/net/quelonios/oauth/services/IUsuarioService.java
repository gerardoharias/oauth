package net.quelonios.oauth.services;

import net.quelonios.users.commons.model.Usuario;

public interface IUsuarioService {
	
	public Usuario findByUsername(String username);
	
	public Usuario update(Usuario usuario, Long id);

}
