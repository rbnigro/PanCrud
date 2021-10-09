package com.crud.conrtoller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crud.model.MaintenanceModel;
import com.crud.repository.MaintenanceRepo;

@RestController
@RequestMapping("/api")
public class MaintenanceController {

	@Autowired
	private MaintenanceRepo repository;

	@GetMapping("/pegar")
	public List<MaintenanceModel> getAll() {
		return repository.findAll();
	}

	@PostMapping("/inserir")
	public ResponseEntity<MaintenanceModel> criar(@RequestBody MaintenanceModel model) {
		return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(model));
	}
	
//	@PostMapping("/excluir")
	
}
