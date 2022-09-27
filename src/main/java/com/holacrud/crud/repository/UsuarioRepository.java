package com.holacrud.crud.repository;

import org.springframework.data.repository.CrudRepository;

import com.holacrud.crud.model.Usuario;


public interface UsuarioRepository extends CrudRepository<Usuario, Long>{

}