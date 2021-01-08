package com.demo.service;
import java.util.*;

import org.springframework.data.domain.Pageable;

import com.demo.entities.Book;
public interface BookService {
	public List<Book>getAllBooksPagable(Pageable pageable);
}
