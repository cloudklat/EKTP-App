package com.example.ektp.service;

import java.util.List;


import com.example.ektp.model.Ak;

public interface IAkService {
	public Ak insertAk(Ak ak);
	public List<Ak> getAllAk();
	public Ak updateAk(int id, Ak ak);
	public Ak deleteAk(int id);
	public List<Ak> deleteAkByIdKk(String id_kk);
	public Ak getAkById(int id);
	public List<Ak> getAkByIdKk(String id_kk);

	public Ak updateAkByIdKk(String id_kk, Ak ak);


}
