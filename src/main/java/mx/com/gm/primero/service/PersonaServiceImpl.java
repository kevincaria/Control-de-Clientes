package mx.com.gm.primero.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import mx.com.gm.primero.dao.PersonaDAO;
import mx.com.gm.primero.entidad.Persona;

@Service
public class PersonaServiceImpl implements PersonaService{

    @Autowired
    private PersonaDAO personaDAO;

    @Override
    @Transactional(readOnly = true)
    public List<Persona> listarpersonas() {
        return (List<Persona>)personaDAO.findAll();
    }
    
    @Override
    @Transactional
    public void guardar(Persona persona) {
        personaDAO.save(persona);
    }
    
    @Override
    @Transactional
    public void eliminar(Persona persona) {
        personaDAO.delete(persona);
    }
    
    @Override
    @Transactional(readOnly = true)
    public Persona encontrar(Persona persona) {
        return personaDAO.findById(persona.getIdPersona()).orElse(null);
    }
    
}
