package com.lse.library.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.lse.library.model.Books;

@Repository
public interface LseLibraryRepository extends CrudRepository<Books,Long> {
	//ID,ISBN_NO,SUBJECT,AUTHOR,TITLE
    @Query(value="SELECT * FROM LSE_LIBRARY_BOOKS s where s.SHELF_NO = :shelfNo", nativeQuery = true) 
    List<Books> findBooksByShelfNo(@Param("shelfNo") String shelfNo);

    //LOCATION_NO
    @Query(value="SELECT * FROM LSE_LIBRARY_BOOKS s where s.ISBN_NO = :IsbnNo", nativeQuery = true) 
    Books findLocationByIsbnNo(@Param("IsbnNo") String IsbnNo);

    //STACK_NO,SHELF_NO
    @Query(value="SELECT * FROM LSE_LIBRARY_BOOKS s where s.SUBJECT like CONCAT('%',:subject,'%')", nativeQuery = true)   
    List<Books> findStacksAndShelvesBySubject(@Param("subject") String subject);

    @Query(value="SELECT count(*) ID FROM LSE_LIBRARY_BOOKS s where s.SHELF_NO = :shelfNo", nativeQuery = true) 
    int findCountOfBooksByShelfNo(@Param("shelfNo") String shelfNo);

    //SHELF_NO
    @Query(value="SELECT * FROM LSE_LIBRARY_BOOKS s where s.SUBJECT = :subject1 or s.SUBJECT = :subject2 ", nativeQuery = true)   
    List<Books> findShelvesBySubjects(@Param("subject1") String subject1,@Param("subject2") String subject2);

    //SHELF_NO
    @Query(value="SELECT * FROM LSE_LIBRARY_BOOKS s where s.SUBJECT = :subject", nativeQuery = true)   
    List<Books> findShelvesByOneSubject(@Param("subject") String subject);

}
