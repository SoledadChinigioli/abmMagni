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
			
			unDto.setId(entity.getId());
			unDto.setDenominacion(entity.getDenominacion());
			unDto.setTelefono(entity.getTelefono());
			unDto.setHorarioAtencion(entity.getHorarioAtencion());
			unDto.setQuienesSomos(entity.getQuienesSomos());
			unDto.setLongitud(entity.getLongitud());
			unDto.setLatitud(entity.getLatitud());
			unDto.setDomicilio(entity.getDomicilio());
			unDto.setEmail(entity.getEmail());
			
			
			
			return unDto;
			
		} catch (Exception e) {
			// TODO: handle exception
			throw new Exception();
		}
		
	}
	
	//------------------------------------SAVE------------------------------------
	@Transactional
	public EmpresaDto save (EmpresaDto dto) throws Exception{
		Empresa entity = new Empresa();
		entity.setDenominacion(dto.getDenominacion());
		entity.setTelefono(dto.getTelefono());
		entity.setHorarioAtencion(dto.getHorarioAtencion());
		entity.setQuienesSomos(dto.getQuienesSomos());
		entity.setLongitud(dto.getLongitud());
		entity.setLatitud(dto.getLatitud());
		entity.setDomicilio(dto.getDomicilio());
		entity.setEmail(dto.getEmail());
		
		try {
			entity = repository.save(entity);
			
			dto.setId(entity.getId());
			return dto;
			
			
		} catch (Exception e) {
			// TODO: handle exception
			throw new Exception();
		}
		
	}
	//------------------------------------UPDATE-----------------------------------
	
	@Transactional
	public EmpresaDto update (int id, EmpresaDto dto) throws Exception{
		
		Optional<Empresa> entityOptional = repository.findById(id);
		
		try {
			Empresa entity = entityOptional.get();
			
			entity.setId(id);
			entity.setDenominacion(dto.getDenominacion());
			entity.setTelefono(dto.getTelefono());
			entity.setHorarioAtencion(dto.getHorarioAtencion());
			entity.setQuienesSomos(dto.getQuienesSomos());
			entity.setLongitud(dto.getLongitud());
			entity.setLatitud(dto.getLatitud());
			entity.setDomicilio(dto.getDomicilio());
			entity.setEmail(dto.getEmail());
			
			
			repository.save(entity);
			dto.setId(entity.getId());
			return dto;
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
			throw new Exception();
		}
	}
	
	//----------------------------------DELETE-------------------------------------
	
	public boolean delete (int id) throws Exception {
		try {
			if (repository.existsById(id)) {
				
				repository.deleteById(id);
				return true;
				
			}else {
				
				throw new Exception();
			}
			
			
		} catch (Exception e) {
			// TODO: handle exception
			throw new Exception();	
		}
		
		
	}
	
}
