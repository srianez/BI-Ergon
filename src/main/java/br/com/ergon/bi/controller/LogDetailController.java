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
	    
	@GetMapping("/listAll")
	public List<LogDetail> listLogDetail(){
		return logDetailRepository.findAll();
	}

    @GetMapping("/listByIdExec/{idExec}")
    public List<LogDetail> getLogDetailsByIdExec(@PathVariable java.lang.Integer idExec) {
        return logDetailRepository.findByIdExec(idExec);
    }
    
}
