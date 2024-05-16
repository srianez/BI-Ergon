package br.com.ergon.bi.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.ergon.bi.model.LogDetail;

import br.com.ergon.bi.repositorie.LogDetailRepository;


@RestController
@RequestMapping("/logDetail")
public class LogDetailController {

    @Autowired
    LogDetailRepository logDetailRepository;
	 
	public String hello() {
		return "oi detail";
	}
    
	@GetMapping("/listAll")
	public List<LogDetail> listLogDetail(){
		return logDetailRepository.findAll();
	}

    @GetMapping("/logdetails/{id}")
    public Optional<LogDetail> getLogDetailsById(@PathVariable java.lang.Integer id) {
        return logDetailRepository.findByIdExec(id);
    }
}
