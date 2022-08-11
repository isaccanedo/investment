package com.isaccanedo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.isaccanedo.dto.CountType;
import com.isaccanedo.model.Investimento;
import com.isaccanedo.repositories.InvestimentoRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class InvestimentoService {
	
	private InvestimentoRepository investimentoRepository;
	
	@Transactional(readOnly = true)
	public List<Investimento> getInvestimentos(){
		return investimentoRepository.getAllInvestimentoDueDateDesc();
	}
	@Transactional
	public Investimento save(Investimento investimento) {
		return investimentoRepository.saveAndFlush(investimento);
	}
	@Transactional(readOnly = true)
	public boolean existById(Long id) {
		return investimentoRepository.existsById(id);
	}
	@Transactional(readOnly = true)
	public Optional<Investimento> getInvestimentoById(Long id) {
		return investimentoRepository.findById(id);
	}
	public void delete(Long id) {
		investimentoRepository.deleteById(id); 
	}
	
	public List<CountType> getPercentageGroupByType() {
		return investimentoRepository.getPercentageGroupByType();
		
	}
	

}
