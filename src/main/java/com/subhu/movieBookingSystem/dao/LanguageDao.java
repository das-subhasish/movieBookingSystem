package com.subhu.movieBookingSystem.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.subhu.movieBookingSystem.entities.Language;

public interface LanguageDao extends JpaRepository<Language, Integer> {
	public Optional<Language> findByLanguageName(String languageName);
}