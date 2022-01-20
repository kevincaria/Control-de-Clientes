package mx.com.gm.primero.dao;

import org.springframework.data.repository.CrudRepository;

import mx.com.gm.primero.entidad.Persona;

public interface PersonaDAO extends CrudRepository<Persona, Long>{
    
}
