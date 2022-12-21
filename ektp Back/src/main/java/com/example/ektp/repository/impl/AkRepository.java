package com.example.ektp.repository.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.ektp.model.Ak;
import com.example.ektp.repository.IAkRepository;

@Repository
public class AkRepository implements IAkRepository {

	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public Ak insertAk(Ak ak) {
		// TODO Auto-generated method stub
		String query = "INSERT INTO tb_anggota_keluarga(agama, id_kk, jenis_kelamin, kepala_keluarga, nama, nik, pendidikan, tanggal_lahir, tempat_lahir) "
				+ "VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?)";
		jdbcTemplate.update(query,
				new Object[] { ak.getAgama(), ak.getId_kk(), ak.getJenis_kelamin(), ak.getKepala_keluarga(),
						ak.getNama(), ak.getNik(), ak.getPendidikan(), ak.getTanggal_lahir(),
						ak.getTempat_lahir() });
		return ak;
	}

	@Override
	public List<Ak> getAllAk() {
		// TODO Auto-generated method stub
		String query = "SELECT * FROM tb_anggota_keluarga";
		return jdbcTemplate.query(query, new BeanPropertyRowMapper<>(Ak.class));
	}

	@Override
	public Ak updateAk(int id, Ak ak) {
		// TODO Auto-generated method stub
		String query = "UPDATE tb_anggota_keluarga SET agama = ?, id_kk = ?, jenis_kelamin = ?, kepala_keluarga = ?, nama = ?, nama = ?, nik = ?, pendidikan = ?, tanggal_lahir = ?, tempat_lahir = ? WHERE id = ?";

		jdbcTemplate.update(query,
				new Object[] { ak.getAgama(), ak.getId_kk(), ak.getJenis_kelamin(), ak.getKepala_keluarga(),
						ak.getNama(), ak.getNik(), ak.getPendidikan(), ak.getTanggal_lahir(),
						ak.getTempat_lahir(), id });

		return ak;
	}

	@Override
	public Ak deleteAk(int id) {
		// TODO Auto-generated method stub
		String query = "SELECT * FROM tb_anggota_keluarga WHERE id = ?";
		var result = jdbcTemplate.queryForObject(query, new BeanPropertyRowMapper<>(Ak.class), id);

		query = "DELETE FROM tb_anggota_keluarga WHERE id = ?";
		jdbcTemplate.update(query, id);

		return result;
	}
	
	@Override
	public List<Ak> deleteAkByIdKk(String id_kk) {
		// TODO Auto-generated method stub
		String query = "SELECT * FROM tb_anggota_keluarga WHERE id_kk = ?";
		var result = jdbcTemplate.query(query, new BeanPropertyRowMapper<>(Ak.class), id_kk);

		query = "DELETE FROM tb_anggota_keluarga WHERE id_kk = ?";
		jdbcTemplate.update(query, id_kk);

		return result;
	}


	@Override
	public Ak getAkById(int id) {
		// TODO Auto-generated method stub
		String query = "SELECT * FROM tb_anggota_keluarga WHERE id = ?";
		return jdbcTemplate.queryForObject(query, new BeanPropertyRowMapper<>(Ak.class), id);
	}
	
	@Override
	public List<Ak> getAkByIdKk(String id_kk) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Ak updateAkByIdKk(String id_kk, Ak ak) {
		// TODO Auto-generated method stub
		return null;
	}



}
