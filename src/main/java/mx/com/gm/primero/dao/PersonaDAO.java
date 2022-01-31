package mx.com.gm.primero.dao;


import org.springframework.data.jpa.repository.JpaRepository;

import mx.com.gm.primero.entidad.Persona;

public interface PersonaDAO extends JpaRepository<Persona, Long>{
    
}
