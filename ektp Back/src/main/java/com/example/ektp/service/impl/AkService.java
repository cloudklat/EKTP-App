package com.example.ektp.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ektp.model.Ak;
import com.example.ektp.repository.IAkRepository;
import com.example.ektp.service.IAkService;

@Service
public class AkService implements IAkService{
	
	@Autowired
	IAkRepository akRepository;

	@Override
	public Ak insertAk(Ak ak) {
		// TODO Auto-generated method stub
		return akRepository.insertAk(ak);
	}

	@Override
	public List<Ak> getAllAk() {
		// TODO Auto-generated method stub
		return akRepository.getAllAk();
	}

	@Override
	public Ak updateAk(int id, Ak ak) {
		// TODO Auto-generated method stub
		return akRepository.updateAk(id, ak);
	}

	@Override
	public Ak deleteAk(int id) {
		// TODO Auto-generated method stub
		return akRepository.deleteAk(id);
	}

	@Override
	public List<Ak> getAkByIdKk(String id_kk) {
		// TODO Auto-generated method stub
		return akRepository.getAkByIdKk(id_kk);
	}

	@Override
	public Ak updateAkByIdKk(String id_kk, Ak ak) {
		// TODO Auto-generated method stub
		return akRepository.updateAkByIdKk(id_kk, ak);
	}

	@Override
	public List<Ak> deleteAkByIdKk(String id_kk) {
		// TODO Auto-generated method stub
		return akRepository.deleteAkByIdKk(id_kk);
	}

	@Override
	public Ak getAkById(int id) {
		// TODO Auto-generated method stub
		return akRepository.getAkById(id);
	}
}