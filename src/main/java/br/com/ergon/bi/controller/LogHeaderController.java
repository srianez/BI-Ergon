package br.com.ergon.bi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.ergon.bi.model.LogHeader;
import br.com.ergon.bi.repositorie.LogHeaderRepository;

@RestController
@RequestMapping("/logHeader")
public class LogHeaderController {

    @Autowired
    LogHeaderRepository logHeaderRepository;
	 
	@GetMapping("/listAll")
	public List<LogHeader> listLogHeader(){
		return logHeaderRepository.findAll();
	}
	
	@GetMapping("/getAll")
	public ResponseEntity<List<LogHeader>> getAll(){
		return ResponseEntity.status(HttpStatus.OK).body(logHeaderRepository.findAll());
	}
}
