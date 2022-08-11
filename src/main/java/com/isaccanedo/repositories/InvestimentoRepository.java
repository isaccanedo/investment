package com.isaccanedo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.isaccanedo.dto.CountType;
import com.isaccanedo.model.Investimento;

public interface InvestimentoRepository extends JpaRepository<Investimento,Long> {

	
	@Query(value="Select * from investimento order by due_date desc",nativeQuery = true)
	public List<Investimento> getAllInvestimentoDueDateDesc();
	
	
	@Query(value="Select new com.isaccanedo.dto.CountType(COUNT(*)/(Select COUNT(*) from Investimento) *100,type) from Investimento GROUP BY type")
	public List<CountType> getPercentageGroupByType();
	
}
