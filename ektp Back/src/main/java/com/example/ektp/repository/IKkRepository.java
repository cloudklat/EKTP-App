package com.example.ektp.repository;

import java.util.List;

import com.example.ektp.model.Kk;

public interface IKkRepository {
	public Kk insertKk(Kk kk);
	public List<Kk> getAllKk();
	public Kk updateKk(int id, Kk kk);
	public Kk deleteKk(int id);
	public Kk getKkById(int id);
//	public Kk getKkByNoKk(int nomor_kk);
//	public Kk updateKkByNoKk(int nomor_kk, Kk kk);
}
