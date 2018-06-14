package com.lse.library.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lse.library.dao.LseLibraryRepository;
import com.lse.library.model.Books;

@Service
public class LseLibraryService implements LseLibraryInt {
	@Autowired
	private LseLibraryRepository bookRepository;

	public List<Books> getAllBooks() {
		List<Books> books = new ArrayList<>();
		bookRepository.findAll().forEach(books::add);

		return books;
	}

	public Optional<Books> getBook(long id) {
		return bookRepository.findById(id);
	}

	public List<Books> getBookByShelfNo(String shelfNo) {
		List<Books> books = new ArrayList<>();
		bookRepository.findBooksByShelfNo(shelfNo)
		.forEach(books::add);
		return books;
	}

	public Books getLocationByIsbnNo(String isbnNo) {
		return bookRepository.findLocationByIsbnNo(isbnNo);
	}

	public List<Books> getStacksAndShelvesBySubject(String subject) {
		List<Books> books = new ArrayList<>();
		bookRepository.findStacksAndShelvesBySubject(subject).forEach(books::add);
		return books;
	}

	public int getCountOfBooksByShelfNo(String shelfNo) {
		return bookRepository.findCountOfBooksByShelfNo(shelfNo);
	}

	public List<Books> getShelvesBySubjects(String subject1, String subject2) {
		List<Books> books = new ArrayList<>();
		bookRepository.findShelvesBySubjects(subject1, subject2).forEach(books::add);
		return books;
	}

	public List<Books> getShelvesByOneSubject(String subject) {
		List<Books> books = new ArrayList<>();
		bookRepository.findShelvesByOneSubject(subject).forEach(books::add);
		return books;
	}

}
