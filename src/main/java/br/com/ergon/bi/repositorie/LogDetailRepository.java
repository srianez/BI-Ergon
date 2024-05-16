package br.com.ergon.bi.repositorie;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.ergon.bi.model.LogDetail;

@Repository
public interface LogDetailRepository extends JpaRepository<LogDetail, java.lang.Integer> {
	
	Optional<LogDetail> findByIdExec(java.lang.Integer idExec);
	
}
