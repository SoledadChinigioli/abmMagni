package com.example.demo.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entidades.Empresa;

@Repository
public interface Irepository extends JpaRepository<Empresa,Integer> {//Trae los metodos de JPA,necesita la entidad y el ID que va a ser un integer
	
	
}
