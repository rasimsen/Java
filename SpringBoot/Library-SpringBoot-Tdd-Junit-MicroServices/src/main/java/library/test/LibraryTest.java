package library.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import library.model.Books;
import library.service.LseLibraryService;

public class LibraryTest {
	@Autowired
	private LseLibraryService bookService;
	
	@Test
	public void test() {
		fail("Not yet implemented");
	}
	
	@Test
	public void libraryTestBookByShelfNo() {
		List<Books> obj = bookService.getBookByShelfNo("1");
		assertEquals("Test", true,obj==null||(obj!=null&&obj.size()>0));
	}

	@Test
	public void libraryTestLocationByIsbnNo() {
		Books obj = bookService.getLocationByIsbnNo("1");
		assertEquals("Test", true,obj==null||(obj!=null&&obj.getSubject().length()>0));
	}

	@Test
	public void libraryTestStacksAndShelvesBySubject() {
		List<Books> obj = bookService.getStacksAndShelvesBySubject("Test");
		assertEquals("Test", true,obj==null||(obj!=null&&obj.size()>0));
	}

	@Test
	public void libraryTestCountOfBooksByShelfNo() {
		int c = bookService.getCountOfBooksByShelfNo("7");
		
		assertEquals("Test", true,c>0);
	}

	@Test
	public void libraryTestShelvesBySubjects() {
		List<Books> obj = bookService.getShelvesBySubjects("test1","test2");
		assertEquals("Test", true,obj==null||(obj!=null&&obj.size()>0));
	}

	@Test
	public void libraryTestShelvesByOneSubject() {
		List<Books> obj = bookService.getShelvesByOneSubject("test");
		assertEquals("Test", true,obj==null||(obj!=null&&obj.size()>0));
	}
	
}
