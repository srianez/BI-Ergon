package br.com.ergon.bi.model;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "LOG_DETAIL")
public class LogDetail implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id 
    @Column(name = "ID", nullable = false, insertable=true, updatable=true)
    private java.lang.Integer id;		
	
    @Column(name = "ID_EXEC", nullable = false, insertable=true, updatable=true)
    private java.lang.Integer idExec;	

    @Column(name = "TEXTO", nullable = false, insertable=true, updatable=true)
    private String texto;
    
    
}
