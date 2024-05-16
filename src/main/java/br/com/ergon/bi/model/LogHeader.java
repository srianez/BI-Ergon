package br.com.ergon.bi.model;

import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "LOG_HEADER")
public class LogHeader implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
    @Column(name = "ID_EXEC", nullable = false, insertable=true, updatable=true)
    private java.lang.Integer id;	

    @Column(name = "DATA_EXEC", nullable = false, insertable=true, updatable=true)
    private Date dataExec;
    
    @Column(name = "TENANT_ID", nullable = false, insertable=true, updatable=true)
    private String tenantID;
    
}
