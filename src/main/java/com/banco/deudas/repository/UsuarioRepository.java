package com.banco.deudas.repository;

import com.banco.deudas.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UsuarioRepository extends JpaRepository <Usuario,String>{
    public List<Usuario> findAllByNombreUsuario(String NombreUsuario);



}
