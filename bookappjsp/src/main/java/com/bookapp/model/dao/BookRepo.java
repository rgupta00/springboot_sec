package com.bookapp.model.dao;
import java.util.*;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepo extends JpaRepository<Book, Integer> {
	public List<Book> findByTitle(String title); //spring data automatically implement it
}
