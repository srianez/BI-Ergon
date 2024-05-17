package br.com.ergon.bi.repositorie;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import br.com.ergon.bi.model.LogHeader;

@Repository
public interface LogHeaderRepository extends JpaRepository<LogHeader, java.lang.Integer> {
	
}
