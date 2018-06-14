package com.lse.library.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lse.library.model.Books;
import com.lse.library.service.LseLibraryService;

@RestController
public class LseLibraryController {
	@Autowired
	private LseLibraryService bookService;
	
	//test adres: http://localhost:8080/allbooks/shelf/10
	@RequestMapping("/allbooks/shelf/{shelfNo}")
	public List<Books> getBookByShelfNo(@PathVariable("shelfNo") String shelfNo) {
		return bookService.getBookByShelfNo(shelfNo);
	}
	
	//test adres: http://localhost:8080/location/isbn/0400-10-020
	@RequestMapping("/location/isbn/{isbnNo}")
	public Books getLocationByIsbnNo(@PathVariable("isbnNo") String isbnNo) {
		return bookService.getLocationByIsbnNo(isbnNo);
	}
	
	//test adres: http://localhost:8080/StacksAndShelves/subject/Subject
	@RequestMapping("/StacksAndShelves/subject/{subject}")
	public List<Books> getStacksAndShelvesBySubject(@PathVariable("subject") String subject) {
		return bookService.getStacksAndShelvesBySubject(subject);
	}
		
	//test adres: http://localhost:8080/CountOfBooks/ShelfNo/10
	@RequestMapping("/CountOfBooks/ShelfNo/{shelfNo}")
	public int getCountOfBooksByShelfNo(@PathVariable("shelfNo") String shelfNo) {
		return bookService.getCountOfBooksByShelfNo(shelfNo);
	}
	
	//test adres: http://localhost:8080/StacksAndShelves/subject/Subject%201/Subject 2
	@RequestMapping("/StacksAndShelves/subject/{subject1}/{subject2}")
	public List<Books> getShelvesBySubjects(@PathVariable("subject1") String subject1,@PathVariable("subject2") String subject2) {
		return bookService.getShelvesBySubjects(subject1,subject2);
	}
	
	//test adres: http://localhost:8080/Shelves/OneSubject/Subject 1
	@RequestMapping("/Shelves/OneSubject/{subject}")
	public List<Books> getShelvesByOneSubject(@PathVariable("subject") String subject) {
		return bookService.getShelvesByOneSubject(subject);
	}
	
}
