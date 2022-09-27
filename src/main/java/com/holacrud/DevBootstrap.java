package com.holacrud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;

import com.holacrud.crud.model.Rol;
import com.holacrud.crud.repository.RolRepository;


public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent>{

	@Autowired
	RolRepository repo;
	
	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		repo.save(new Rol("Administrador"));
		repo.save(new Rol("Contable"));
		repo.save(new Rol("Regular"));
	}
}
