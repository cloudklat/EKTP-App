package com.example.ektp.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ektp.model.Kk;
import com.example.ektp.repository.IKkRepository;
import com.example.ektp.service.IKkService;

@Service
public class KkService implements IKkService {

	@Autowired
	IKkRepository kkRepository;

	@Override
	public Kk insertKk(Kk kk) {
		// TODO Auto-generated method stub
		return kkRepository.insertKk(kk);
	}

	@Override
	public List<Kk> getAllKk() {
		// TODO Auto-generated method stub
		return kkRepository.getAllKk();
	}

	@Override
	public Kk updateKk(int id, Kk kk) {
		// TODO Auto-generated method stub
		return kkRepository.updateKk(id, kk);
	}

	@Override
	public Kk deleteKk(int id) {
		// TODO Auto-generated method stub
		return kkRepository.deleteKk(id);
	}

	@Override
	public Kk getKkById(int id) {
		// TODO Auto-generated method stub
		return kkRepository.getKkById(id);
	}
	
//	@Override
//	public Kk getKkByNoKk(int nomor_kk) {
//		// TODO Auto-generated method stub
//	return kkRepository.getKkByNoKk(nomor_kk);
//	}
//
//    @Override
//    public Kk updateKkByNoKk(int nomor_kk, Kk kk) {
//        // TODO Auto-generated method stub
//        return kkRepository.updateKkByNoKk(nomor_kk, kk);
//    }
	

}
