package com.auleweb.service;

import java.util.List;

import com.auleweb.model.Typology;

public interface TypologyService {
	
	public List<Typology> getAllTypologys();

	Typology saveOrUpdate(Typology typology);

	Typology getTypologyById(Long idTypology);

	void deleteTypology(Long idTypology);

}