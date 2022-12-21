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


import com.example.ektp.model.Ak;
import com.example.ektp.service.IAkService;

@RestController
@CrossOrigin(origins = "http://localhost:8080")
@RequestMapping("/api/ak")
public class AkController {
	@Autowired
	IAkService akService;
	
	
	@PostMapping("/insert")
	public Ak insertAk(@RequestBody Ak ak){
		return akService.insertAk(ak);
	}
	
	@GetMapping("/getAll")
	public List<Ak> getAllAk(){
		return akService.getAllAk();
	}
	
	@PutMapping("/update/{id}")
	public Ak updateAk(@PathVariable int id, @RequestBody Ak ak) {
		return akService.updateAk(id, ak);
	}
	
	@DeleteMapping("/delete/{id}")
	public Ak deleteAk(@PathVariable int id) {
		return akService.deleteAk(id);
	}
	
	@DeleteMapping("/deleteAkByIdKk/{id_kk}")
	public List<Ak> deleteAkByIdKk(@PathVariable String id_kk) {
		return akService.deleteAkByIdKk(id_kk);
	}
	
	@GetMapping("/getAkById/{id}")
	public Ak getAkById(@PathVariable int id) {
		return akService.getAkById(id);
	}
	
	@GetMapping("/getAkByIdKk/{id_kk}")
	public List<Ak> getAkByIdKk(@PathVariable String id_kk) {
		return akService.getAkByIdKk(id_kk);
	}

	@PutMapping("/updateKk/{id_kk}")
	public Ak updateAkByIdKk(@PathVariable String id_kk,
			@RequestBody Ak ak) {
		return akService.updateAkByIdKk(id_kk, ak);
	}

	
}
