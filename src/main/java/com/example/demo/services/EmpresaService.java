package com.example.demo.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.example.demo.dtos.EmpresaDto;
import com.example.demo.entidades.Empresa;
import com.example.demo.repository.Irepository;

@Service
public class EmpresaService {
	private Irepository repository;

	public EmpresaService (Irepository repository) {
		super();
		this.repository = repository;
		
	}
	//-------------------------------FIND ALL-----------------------------------------------
	
	@Transactional
	public List<EmpresaDto> findAll() throws Exception{
		List<Empresa> entities = repository.findAll();
		
		
		List<EmpresaDto> dtos = new ArrayList<>();
		
		try {
			for(Empresa i : entities) {
				EmpresaDto unDto = new EmpresaDto();
				unDto.setId(i.getId());
				unDto.setDenominacion(i.getDenominacion());
				unDto.setTelefono(i.getTelefono());
				unDto.setHorarioAtencion(i.getHorarioAtencion());
				unDto.setQuienesSomos(i.getQuienesSomos());
				unDto.setLongitud(i.getLongitud());
				unDto.setLatitud(i.getLatitud());
				unDto.setDomicilio(i.getDomicilio());
				unDto.setEmail(i.getEmail());
				
				dtos.add(unDto);
				
				
			}
			return dtos;
			
		} catch (Exception e) {
			// TODO: handle exception
			throw new Exception();
		}
		
		
	}
	
	//----------------------------------------FIND BY ID---------------------------
	@Transactional
	public EmpresaDto findById(int id) throws Exception {
		
		Optional<Empresa> entityOptional = repository.findById(id);
		
		EmpresaDto unDto = new EmpresaDto();
		
		try {
			Empresa entity = entityOptional.get();		
			
			
			
			return unDto;
			
		} catch (Exception e) {
			// TODO: handle exception
			throw new Exception();
		}
		
	}
	
}
