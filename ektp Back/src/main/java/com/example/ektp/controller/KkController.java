package com.example.ektp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ektp.model.Kk;
import com.example.ektp.service.IKkService;

@RestController
@CrossOrigin(origins = "http://localhost:8080")
@RequestMapping("/api/kk")
public class KkController {
	@Autowired
	IKkService kkService;

	@PostMapping("/insert")
	public Kk insertKk(@RequestBody Kk kk) {
		return kkService.insertKk(kk);
	}

	@GetMapping("/getAll")
	public List<Kk> getAllKk() {
		return kkService.getAllKk();
	}

	@PutMapping("/update/{id}")
	public Kk updateKk(@PathVariable int id, @RequestBody Kk kk) {
		return kkService.updateKk(id, kk);
	}

	@DeleteMapping("/delete/{id}")
	public Kk deleteShippin(@PathVariable int id) {
		return kkService.deleteKk(id);
	}

	@GetMapping("/getKkById/{id}")
	public Kk getKkById(@PathVariable int id) {
		return kkService.getKkById(id);
	}

//	@GetMapping("/getKkByNoKk/{nomor_kk}")
//	public Kk getKkByNoKk(@PathVariable int nomor_kk) {
//		return kkService.getKkByNoKk(nomor_kk);
//	}
//
//	@PutMapping("/updateByKk/{nomor_kk}")
//	public Kk updateKkByNoKk(@PathVariable int nomor_kk, @RequestBody Kk kk) {
//		return kkService.updateKkByNoKk(nomor_kk, kk);
//	}

}
