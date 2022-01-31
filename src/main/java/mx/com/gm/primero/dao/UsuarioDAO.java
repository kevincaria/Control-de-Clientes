package mx.com.gm.primero.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import mx.com.gm.primero.entidad.Usuario;

public interface UsuarioDAO extends JpaRepository<Usuario,Long>{
    Usuario findByUsername(String username);
}
