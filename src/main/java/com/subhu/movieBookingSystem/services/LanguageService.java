package com.subhu.movieBookingSystem.services;

import java.util.List;

import com.subhu.movieBookingSystem.entities.Language;
import com.subhu.movieBookingSystem.exceptions.LanguageDetailsNotFoundException;

public interface LanguageService {

	public Language acceptLanguageDetails(Language language);

	public Language getLanguageDetails(int id) throws LanguageDetailsNotFoundException;

	public Language getLanguageDetailsByLanguageName(String languageName) throws LanguageDetailsNotFoundException;

	public boolean deleteLanguage(int id) throws LanguageDetailsNotFoundException;

	public List<Language> getAllLanguageDetails();
}
