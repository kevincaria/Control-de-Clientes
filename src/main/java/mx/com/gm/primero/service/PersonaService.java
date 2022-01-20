package mx.com.gm.primero.service;

import java.util.List;

import mx.com.gm.primero.entidad.Persona;

public interface PersonaService {
    
    public List<Persona> listarpersonas();

    public void guardar(Persona persona);

    public void eliminar(Persona persona);

    public Persona encontrar(Persona persona);
}
