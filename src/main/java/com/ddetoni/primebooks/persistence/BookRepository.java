package com.ddetoni.primebooks.persistence;

import com.ddetoni.primebooks.domain.Book;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Alex on 07/03/2015.
 */

public interface BookRepository extends JpaRepository<Book, Long> {
}
