package br.com.ergon.bi.repositorie;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.ergon.bi.model.LogDetail;

@Repository
public interface LogDetailRepository extends JpaRepository<LogDetail, java.lang.Integer> {
	
	List<LogDetail> findByIdExec(java.lang.Integer idExec);
	
}
