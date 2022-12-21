package com.example.ektp.repository.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.ektp.model.Kk;
import com.example.ektp.repository.IKkRepository;

@Repository
public class KkRepository implements IKkRepository {

	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public Kk insertKk(Kk kk) {
		// TODO Auto-generated method stub
		String query = "INSERT INTO tb_kartu_keluarga(alamat, desa_kelurahan, kabupaten_kota, kecamatan, kode_pos, nomor_kk, provinsi, rt, rw) "
				+ "VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?)";
		jdbcTemplate.update(query,
				new Object[] { kk.getAlamat(), kk.getDesa_kelurahan(), kk.getKabupaten_kota(), kk.getKecamatan(),
						kk.getKode_pos(), kk.getNomor_kk(), kk.getProvinsi(), kk.getRt(),
						kk.getRw() });
		return kk;
	}

	@Override
	public List<Kk> getAllKk() {
		// TODO Auto-generated method stub
		String query = "SELECT * FROM tb_kartu_keluarga";
		return jdbcTemplate.query(query, new BeanPropertyRowMapper<>(Kk.class));
	}

	@Override
	public Kk updateKk(int id, Kk kk) {
		// TODO Auto-generated method stub
		String query = "UPDATE tb_kartu_keluarga SET alamat = ?, desa_kelurahan = ?, kabupaten_kota = ?, kecamatan = ?, kode_pos = ?, kode_pos = ?, nomor_kk = ?, provinsi = ?, rt = ?, rw = ? WHERE id = ?";

		jdbcTemplate.update(query,
				new Object[] { kk.getAlamat(), kk.getDesa_kelurahan(), kk.getKabupaten_kota(), kk.getKecamatan(),
						kk.getKode_pos(), kk.getNomor_kk(), kk.getProvinsi(), kk.getRt(),
						kk.getRw(), id });

		return kk;
	}

	@Override
	public Kk deleteKk(int id) {
		// TODO Auto-generated method stub
		String query = "SELECT * FROM tb_kartu_keluarga WHERE id = ?";
		var result = jdbcTemplate.queryForObject(query, new BeanPropertyRowMapper<>(Kk.class), id);

		query = "DELETE FROM tb_kartu_keluarga WHERE id = ?";
		jdbcTemplate.update(query, id);

		return result;
	}

	@Override
	public Kk getKkById(int id) {
		// TODO Auto-generated method stub
		String query = "SELECT * FROM tb_kartu_keluarga WHERE id = ?";
		var result = jdbcTemplate.queryForObject(query, new BeanPropertyRowMapper<>(Kk.class), id);

		return result;
	}
	
//	 @Override
//	    public Kk getKkByNoKk(int nomor_kk) {
//	        // TODO Auto-generated method stub
//	        String query = "SELECT * FROM tb_kartu_keluarga WHERE nomor_kk = ?";
//	        return jdbcTemplate.queryForObject(query, new BeanPropertyRowMapper<>(Kk.class), nomor_kk);
//	    }
//
//	    @Override
//	    public Kk updateKkByNoKk(int nomor_kk, Kk kk) {
//	        // TODO Auto-generated method stub
//	        String query = "UPDATE tb_kartu_keluarga SET alamat = ?, desa_kelurahan = ?, kabupaten_kota = ?, kecamatan = ?, kode_pos = ?, provinsi = ?, rt = ?, rw  = ?, nomor_kk = ? WHERE id = ?";
//
//	        jdbcTemplate.update(query,
//	                new Object[] { kk.getAlamat(), kk.getDesa_kelurahan(),
//	                        kk.getKabupaten_kota(), kk.getKecamatan(), kk.getKode_pos(),
//	                        kk.getProvinsi(), kk.getRt(),
//	                        kk.getRw(), kk.getNomor_kk(), nomor_kk });
//
//	        return kk;
//	    }

}
