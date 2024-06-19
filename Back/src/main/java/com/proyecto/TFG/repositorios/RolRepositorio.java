package com.proyecto.TFG.repositorios;

import com.proyecto.TFG.modelos.Rol;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RolRepositorio extends JpaRepository<Rol, Long> {

}
